package com.example.geostudy;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@SuppressLint("SetJavaScriptEnabled")
public class MapActivity extends AppCompatActivity {
    WebView webView;
    TextView currentRegion;
    TextView percent;
    TextView title;
    AllGamesList allGamesList;
    List<String> regionNames;
    ListView answers;
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
        currentRegion = findViewById(R.id.current_region_text);
        percent = findViewById(R.id.perc);
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
        allGamesList.createMapGame(gameName);
        Map<String, String> allRegions = allGamesList.getRegionsMap(gameName);
        System.out.println(allRegions.values());
        regionNames = new ArrayList<>(allRegions.values());
        Collections.shuffle(regionNames);
        game = new CurrentMapGame(allRegions, this);
        webView.addJavascriptInterface(game, "Android");
        answers = findViewById(R.id.answers_list);
        title = findViewById(R.id.map_tool_bar_title );
        title.setText(intentList[1]);
        answerItems = new ArrayList<>();
        answerListAdapter = new AnswerListAdapter(this, answerItems, answers);
        answers.setAdapter(answerListAdapter);
        nextQuestion();
    }


    public void nextQuestion() {
        gameIndex ++;
        String currentRegionText = "Нажмите на: " + regionNames.get(gameIndex);
        currentRegion.setText(currentRegionText);
        int intPer = game.coins * 100 / game.regions.size();
        String strPer = String.valueOf(intPer) + "%";
        percent.setText(String.valueOf(intPer) + "%");
        game.currentRegion = regionNames.get(gameIndex);
        System.out.println(game.currentRegion);
    }

    public void finishCurrentGame(){
        saveRecordResult();
        showFininshAlert();
    }

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

    public void showFininshAlert() {
        int intPer = game.coins * 100 / game.regions.size();
        String strPer = String.valueOf(intPer) + "%";
        percent.setText(String.valueOf(intPer) + "%");
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.ShadowedAlertDialogStyle);
        View customView = getLayoutInflater().inflate(R.layout.finish_alert_layout, null);
        TextView message = customView.findViewById(R.id.finish_alert_message);
        message.setText("Вы ответиили верно на " + strPer + " вопросов.");
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

    public void saveRecordResult(){
        int intPer = game.coins * 100 / game.regions.size();
        SharedPreferences sharedPref = getSharedPreferences("geostudy_prefs", MODE_PRIVATE);
        int bestScore = sharedPref.getInt(gameName, 0);
        if (intPer > bestScore){
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putInt(gameName, intPer);
            editor.apply();
        }
        int bestScore1 = sharedPref.getInt(gameName, 0);
        System.out.println(bestScore1);
    }
}
