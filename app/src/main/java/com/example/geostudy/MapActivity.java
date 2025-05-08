package com.example.geostudy;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
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
    AllGamesList allGamesList;
    List<String> regionNames;
    ListView answers;
    int gameIndex = 0;

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
        String gameName = getIntent().getStringExtra("gameName");
        webView = findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/" + gameName + ".svg");
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);


        allGamesList = new AllGamesList();
        Map<String, String> allRegions = allGamesList.getRegionsMap(gameName);
        System.out.println(allRegions.values());
        regionNames = new ArrayList<>(allRegions.values());
        Collections.shuffle(regionNames);
        game = new CurrentMapGame(allRegions, this);
        webView.addJavascriptInterface(game, "Android");
        answers = findViewById(R.id.answers_list);
        answerItems = new ArrayList<>();
        answerListAdapter = new AnswerListAdapter(this, answerItems, answers);
        answers.setAdapter(answerListAdapter);

        nextQuestion();
    }

    public void nextQuestion() {
        currentRegion.setText(regionNames.get(gameIndex));
//        int intPer = game.coins * 100 / game.regions.size();
//        String strPer = String.valueOf(intPer) + "%";
//        percent.setText(String.valueOf(intPer) + "%");
        //System.out.println(intPer);
        game.currentRegion = regionNames.get(gameIndex);
        gameIndex ++;
        System.out.println(answerItems);
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
}
