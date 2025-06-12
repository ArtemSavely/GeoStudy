package com.savely.geostudy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Документация к классу. MapActivity - активность отвечающая непосредственно за игру-викторину с картой
 * в приложении.
 */
@SuppressLint("SetJavaScriptEnabled")
public class MapActivity extends AppCompatActivity {
    WebView webView;
    TextView currentRegion;
    TextView question;
    TextView title;
    AllGamesList allGamesList;
    List<String> regionNames;
    ListView answers;
    LinearLayout answerBanner;
    BottomSheetBehavior<LinearLayout> bottomSheetBehavior;
    int gameIndex = -1;
    String gameName;
    String[] intentList;
    ArrayList<AnswerItem> answerItems;
    AnswerListAdapter answerListAdapter;
    CurrentMapGame game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_map);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        currentRegion = findViewById(R.id.current_region_text);
        question = findViewById(R.id.question_number);
        intentList = getIntent().getStringArrayExtra("gameName");
        gameName = intentList[0];
        webView = findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/" + gameName + ".svg");
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        allGamesList = new AllGamesList();
        System.out.println(gameName);
        Map<String, Map<String, String>> allRegions = allGamesList.createMapGame(gameName.replace("Low", ""), this);
        regionNames = allGamesList.getRegionNames(allRegions);
        System.out.println(regionNames);
        Collections.shuffle(regionNames);
        game = new CurrentMapGame(allRegions, this, allGamesList);
        webView.addJavascriptInterface(game, "Android");
        answerBanner = findViewById(R.id.answer_banner_layout);
        bottomSheetBehavior = BottomSheetBehavior.from(answerBanner);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        bottomSheetBehavior.setPeekHeight(200);
        answers = findViewById(R.id.answers_list);
        setAnswersListOnTouch();
        title = findViewById(R.id.map_tool_bar_title );
        title.setText(intentList[1]);
        answerItems = new ArrayList<>();
        answerListAdapter = new AnswerListAdapter(this, answerItems, answers);
        answers.setAdapter(answerListAdapter);
        nextQuestion();
    }

    /**
     * Метод для перехода к следующему вопросу игры.
     */
    public void nextQuestion() {
        gameIndex++;
        String currentRegionText = getString(R.string.press_on, regionNames.get(gameIndex));
        currentRegion.setText(currentRegionText);
        String strPer = getString(R.string.question, String.valueOf(gameIndex + 1) + "/" + String.valueOf(regionNames.size()));
        question.setText(strPer);
        game.currentRegion = regionNames.get(gameIndex);
        System.out.println(game.currentRegion);
    }

    /**
     * Метод для завершения текущей игры.
     */
    public void finishCurrentGame(){
        saveRecordResult();
        showFininshAlert();
    }

    /**
     * Метод класса для создания кастомного Toast, необходимого для отображения неправильных ответов.
     * @param message строка-сообщение для отображения на Toast.
     * @return контейнер {@link LinearLayout} для кастомного Toast.
     */
    public View createCustomToast(String message){
        LinearLayout container = new LinearLayout(this);
        container.setOrientation(LinearLayout.HORIZONTAL);
        container.setPadding(30, 16, 30, 16);
        container.setBackgroundResource(R.drawable.toast_background);
        TextView textView = new TextView(this);
        textView.setText(message);
        textView.setTextAppearance(R.style.MyText);
        container.addView(textView);
        return container;
    }

    /**
     * Метод для создания и отображения кастомного {@link AlertDialog} с информацией об итогах игры и
     * проценте правильных ответов, а также кнопками для перезапуска игры и выхода к главному меню.
     */
    public void showFininshAlert() {
        int intPer = game.coins * 100 / game.regions.size();
        String strPer = getString(R.string.question, String.valueOf(gameIndex + 1) + "/" + String.valueOf(regionNames.size()));
        question.setText(strPer);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.ShadowedAlertDialogStyle);
        View customView = getLayoutInflater().inflate(R.layout.finish_alert_layout, null);
        TextView message = customView.findViewById(R.id.finish_alert_message);
        LinearLayout bar = customView.findViewById(R.id.finish_alert_bar);
        View percentBar = customView.findViewById(R.id.finish_alert_percent_bar);
        bar.post(() ->{
            int barWidth = bar.getWidth();
            ViewGroup.LayoutParams params = (LinearLayout.LayoutParams) percentBar.getLayoutParams();
            params.width = intPer * barWidth / 100;
            percentBar.setLayoutParams(params);
            PathInterpolator pathInterpolator = new PathInterpolator(0.2f, 0.8f, 0.6f, 1f);
            percentBar.setScaleX(0f);
            percentBar.setPivotX(0f);
            percentBar.setAlpha(0f);
            percentBar.animate()
                    .scaleX(1f)
                    .alpha(1f)
                    .setDuration(1000)
                    .setInterpolator(pathInterpolator)
                    .start();
        });
        message.setText(getString(R.string.correct_answers_info, String.valueOf(intPer) + "%"));
        Button finishButton = customView.findViewById(R.id.finish_alert_button);
        Button restartButton = customView.findViewById(R.id.finish_alert_restart_button);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapActivity.this, MapActivity.class).putExtra("gameName", intentList);
                startActivity(intent);
            }
        });
        builder.setView(customView);
        builder.setCancelable(false);
        AlertDialog finishAlert = builder.create();
        finishAlert.show();
    }

    /**
     * Метод для сохранения рекорда прохождения игры пользователя с использованием {@link SharedPreferences}
     */
    public void saveRecordResult(){
        int intPer = game.coins * 100 / game.regions.size();
        SharedPreferences sharedPref = getSharedPreferences("geostudy_prefs", MODE_PRIVATE);
        int bestScore = sharedPref.getInt(gameName, 0);
        if (intPer > bestScore){
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putInt(gameName, intPer);
            editor.apply();
        }
    }

    /**
     * Метод для правильной обработки нажатий списка ListView с ответами - answers. Нужен для корректного
     * скролла списка с целью предотвращения незапланированного закрытия answerBanner при попытке скролла снизу вверх.
     */
    @SuppressLint("ClickableViewAccessibility")
    public void setAnswersListOnTouch(){
        answers.setOnTouchListener(new View.OnTouchListener() {
            private float startY;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        startY = event.getY();
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_MOVE:
                        float currentY = event.getY();
                        float deltaY = currentY - startY;
                        if (deltaY > 0 && !canScrollUp(answers)) {
                            v.getParent().requestDisallowInterceptTouchEvent(false);
                        }
                        else if (deltaY < 0 && !canScrollDown(answers)) {
                            v.getParent().requestDisallowInterceptTouchEvent(false);
                        }
                        break;

                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }
                return false;
            }

            private boolean canScrollUp(ListView listView) {
                return listView.getFirstVisiblePosition() > 0 ||
                        listView.getChildAt(0).getTop() < listView.getPaddingTop();
            }

            private boolean canScrollDown(ListView listView) {
                int lastItem = listView.getLastVisiblePosition();
                boolean canScroll = lastItem < listView.getCount() - 1;
                if (!canScroll && listView.getChildAt(lastItem) != null) {
                    canScroll = listView.getChildAt(lastItem).getBottom() > listView.getHeight() - listView.getPaddingBottom();
                }
                return canScroll;
            }
        });
        answers.setNestedScrollingEnabled(false);
    }
}
