package com.savely.geostudy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/**
 * Документация к классу. MapFragment - фрагмент, отвечающий непосредственно за игру-викторину с картой
 * в приложении.
 */
@SuppressLint("SetJavaScriptEnabled")
public class MapFragment extends Fragment {

    private static final String TAG = "MapActivity";
    View view;
    WebView webView;
    TextView currentRegion;
    TextView question;
    TextView title;
    AllGamesList allGamesList;
    List<String> regionNames;
    RecyclerView answers;
    ImageButton action_back;
    LinearLayout answerBanner;
    BottomSheetBehavior<LinearLayout> bottomSheetBehavior;
    int gameIndex = -1;
    String gameName;
    String[] argsList;
    ArrayList<AnswerItem> answerItems;
    AnswerListAdapter answerListAdapter;
    CurrentMapGame game;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_map, container, false);
        initializeViews();
        setupWebView();
        setupGameData();
        answerItems = new ArrayList<>();
        setupAnswerList();
        nextQuestion();
        return view;
    }

    private void initializeViews() {
        currentRegion = view.findViewById(R.id.current_region_text);
        question = view.findViewById(R.id.question_number);
        title = view.findViewById(R.id.map_tool_bar_title);
        webView = view.findViewById(R.id.web_view);
        answerBanner = view.findViewById(R.id.answer_banner_layout);
        answers = view.findViewById(R.id.answers_list);
        action_back = view.findViewById(R.id.action_back);
        action_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController navController = Navigation.findNavController(requireView());
                navController.popBackStack(R.id.map_menu_fragment, false);
            }
        });
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
        webView.setInitialScale(0);

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
     * Метод для установки данных, необходимых для игры.
     */
    private void setupGameData() {
        MapFragmentArgs args = MapFragmentArgs.fromBundle(getArguments());
        argsList = args.getGameName();
        gameName = argsList[0];
        title.setText(argsList[1]);
        allGamesList = new AllGamesList();
        Map<String, Map<String, String>> allRegions = allGamesList.createMapGame(gameName.replace("Low", ""), requireContext());
        regionNames = allGamesList.getRegionNames(allRegions);
        Collections.shuffle(regionNames);
        game = new CurrentMapGame(allRegions, requireActivity(), this, allGamesList);
        webView.addJavascriptInterface(game, "Android");
        loadSvgImage("file:///android_asset/" + gameName + ".svg");
    }

    /**
     * Метод для установки баннера с ответами пользователя.
     */
    private void setupAnswerList() {
        bottomSheetBehavior = BottomSheetBehavior.from(answerBanner);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        bottomSheetBehavior.setPeekHeight(200);
        answerListAdapter = new AnswerListAdapter(answerItems, requireContext());
        answers.setLayoutManager(new LinearLayoutManager(getContext()));
        answers.setAdapter(answerListAdapter);
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
        LinearLayout container = new LinearLayout(requireContext());
        container.setOrientation(LinearLayout.HORIZONTAL);
        container.setPadding(30, 16, 30, 16);
        container.setBackgroundResource(R.drawable.toast_background);
        TextView textView = new TextView(requireContext());
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
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), R.style.ShadowedAlertDialogStyle);
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
        builder.setView(customView);
        builder.setCancelable(false);
        AlertDialog finishAlert = builder.create();
        finishAlert.show();
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController navController = Navigation.findNavController(requireView());
                MapFragmentDirections.ActionToMap action = MapFragmentDirections.actionToMap(argsList);
                Navigation.findNavController(view).navigate(action);
                navController.navigate(action);
                finishAlert.dismiss();
            }
        });
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController navController = Navigation.findNavController(requireView());
                navController.popBackStack(R.id.main_fragment, false);
                finishAlert.dismiss();
            }
        });
    }
    /**
     * Метод для сохранения рекорда прохождения игры пользователя с использованием {@link SharedPreferences}.
     */
    public void saveRecordResult() {
        int intPer = game.coins * 100 / game.regions.size();
        SharedPreferences sharedPref = requireContext().getSharedPreferences("geostudy_prefs", Context.MODE_PRIVATE);
        int bestScore = sharedPref.getInt(gameName, 0);
        if (intPer > bestScore) {
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putInt(gameName, intPer);
            editor.apply();
        }
    }
}
