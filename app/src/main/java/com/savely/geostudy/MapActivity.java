package com.savely.geostudy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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

    private static final String TAG = "MapActivity";
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
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Bundle mapBundle = new Bundle();

        if (answerItems != null) {
            for (AnswerItem answerItem : answerItems) {
                mapBundle.putBoolean(answerItem.region, answerItem.flag);
            }
            outState.putBundle("PROGRESS_MAP_BUNDLE", mapBundle);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_map);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        initializeViews();
        setupWebView();
        setupGameData();
        answerItems = new ArrayList<>();
        setupAnswerList();
        nextQuestion();
    }

    private void initializeViews() {
        currentRegion = findViewById(R.id.current_region_text);
        question = findViewById(R.id.question_number);
        title = findViewById(R.id.map_tool_bar_title);
        webView = findViewById(R.id.web_view);
        answerBanner = findViewById(R.id.answer_banner_layout);
        answers = findViewById(R.id.answers_list);
    }

    /**
     * Метод для установки настроек webView для отображения карты
     */
    private void setupWebView() {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setSupportZoom(true);
        webView.setInitialScale(1);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                // Подстраиваем высоту после загрузки
                adjustWebViewHeight();
            }
        });
    }

    private void loadSvgImage(String path) {
        webView.loadUrl(path);
    }

    /**
     * Метод для регулирования высоты webView.
     */
    private void adjustWebViewHeight() {
        webView.evaluateJavascript(
                "(function() { " +
                        "   var img = document.querySelector('svg,img'); " +
                        "   return img ? Math.max(img.scrollHeight, img.offsetHeight, img.clientHeight) : 0; " +
                        "})();",
                new ValueCallback<String>() {
                    @Override
                    public void onReceiveValue(String value) {
                        try {
                            int height = (int) Float.parseFloat(value);
                            if (height > 0) {
                                ViewGroup.LayoutParams params = webView.getLayoutParams();
                                params.height = height;
                                webView.setLayoutParams(params);
                            }
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }

    /**
     * Метод для установки данных, необходимых для игры
     */
    private void setupGameData() {
        intentList = getIntent().getStringArrayExtra("gameName");
        gameName = intentList[0];
        title.setText(intentList[1]);

        allGamesList = new AllGamesList();
        Map<String, Map<String, String>> allRegions = allGamesList.createMapGame(gameName.replace("Low", ""), this);
        regionNames = allGamesList.getRegionNames(allRegions);
        Collections.shuffle(regionNames);

        game = new CurrentMapGame(allRegions, this, allGamesList);
        webView.addJavascriptInterface(game, "Android");
        loadSvgImage("file:///android_asset/" + gameName + ".svg");
    }

    /**
     * Метод для установки баннера с ответами пользователя
     */
    private void setupAnswerList() {
        bottomSheetBehavior = BottomSheetBehavior.from(answerBanner);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        bottomSheetBehavior.setPeekHeight(200);

        answerListAdapter = new AnswerListAdapter(this, answerItems, answers);
        answers.setAdapter(answerListAdapter);
        setAnswersListOnTouch();
    }

    /**
     * Метод для перехода к следующему вопросу игры.
     */
    public void nextQuestion() {
        gameIndex++;
        String currentRegionText = getString(R.string.press_on, regionNames.get(gameIndex));
        currentRegion.setText(currentRegionText);
        int intPer = game.coins * 100 / game.regions.size();
        String strPer = getString(R.string.question, String.valueOf(gameIndex + 1) + "/" + String.valueOf(regionNames.size()));
        question.setText(strPer);
        game.currentRegion = regionNames.get(gameIndex);
        System.out.println(game.currentRegion);
    }
    /**
     * Метод для завершения текущей игры.
     */
    public void finishCurrentGame() {
        saveRecordResult();
        showFininshAlert();
    }
    /**
     * Метод класса для создания кастомного Toast, необходимого для отображения неправильных ответов.
     * @param message строка-сообщение для отображения на Toast.
     * @return контейнер {@link LinearLayout} для кастомного Toast.
     */
    public View createCustomToast(String message) {
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
    /**Добавить комментарийБольше действий
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
            ViewGroup.LayoutParams params =  percentBar.getLayoutParams();
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

    private int convertDpToPx(float dpValue) {
        return Math.round(TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dpValue,
                this.getResources().getDisplayMetrics()));
    }
    /**Добавить комментарийБольше действий
     * Метод для сохранения рекорда прохождения игры пользователя с использованием {@link SharedPreferences}
     */
    public void saveRecordResult() {
        int intPer = game.coins * 100 / game.regions.size();
        SharedPreferences sharedPref = getSharedPreferences("geostudy_prefs", MODE_PRIVATE);
        int bestScore = sharedPref.getInt(gameName, 0);
        if (intPer > bestScore) {
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putInt(gameName, intPer);
            editor.apply();
        }
    }
    /**Добавить комментарийБольше действий
     * Метод для правильной обработки нажатий списка ListView с ответами - answers. Нужен для корректного
     * скролла списка с целью предотвращения незапланированного закрытия answerBanner при попытке скролла снизу вверх.
     */
    @SuppressLint("ClickableViewAccessibility")
    public void setAnswersListOnTouch() {
        answers.setOnTouchListener(new View.OnTouchListener() {
            private float startY;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // Запоминаем начальную позицию касания
                        startY = event.getY();
                        // Блокируем родительский контейнер от перехвата событий
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_MOVE:
                        float currentY = event.getY();
                        float deltaY = currentY - startY;

                        // Если скроллим вниз и достигли верха списка
                        if (deltaY > 0 && !canScrollUp(answers)) {
                            // Разрешаем BottomSheet обрабатывать жест
                            v.getParent().requestDisallowInterceptTouchEvent(false);
                        }
                        // Если скроллим вверх и достигли низа списка
                        else if (deltaY < 0 && !canScrollDown(answers)) {
                            // Разрешаем BottomSheet обрабатывать жест
                            v.getParent().requestDisallowInterceptTouchEvent(false);
                        }
                        break;

                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        // Восстанавливаем нормальное поведение
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
