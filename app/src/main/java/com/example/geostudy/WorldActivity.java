package com.example.geostudy;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class WorldActivity extends ListActivity {
    ListView listView;
    TextView toolBarTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        setContentView(R.layout.activity_world);
        listView = (ListView) findViewById(android.R.id.list);
        toolBarTextView = findViewById(R.id.tool_bar_text_view);
        MapGamesLists maps = new MapGamesLists();
        String[] intentList = getIntent().getStringArrayExtra("gameClass");
        toolBarTextView.setText(intentList[1]);
        String[] mapGamesList = maps.getMapGames(intentList[0]);
        MapGameAdapter mapGameAdapter = new MapGameAdapter(this, makeMapGames(maps, mapGamesList));
        setListAdapter(mapGameAdapter);
    }

    MapGameItem[] makeMapGames(MapGamesLists maps, String[] mapList) {
        MapGameItem[] mapGames = new MapGameItem[mapList.length];

        for(int i = 0; i < mapGames.length; i ++){
            SharedPreferences sharedPref = getSharedPreferences("geostudy_prefs", MODE_PRIVATE);
            int bestScore = sharedPref.getInt(mapList[i], 0);
            MapGameItem mapGame = new MapGameItem();
            mapGame.name = mapList[i];
            mapGame.itemName = maps.itemsNames.get(mapList[i]);
            mapGame.percent = bestScore;
            mapGames[i] = mapGame;
        }
        return mapGames;
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        MapGameItem selectedGame = (MapGameItem) getListAdapter().getItem(position);
        if (selectedGame != null) {
            String gameName = selectedGame.name;
            String itemName = selectedGame.itemName;
            Intent intent = new Intent(WorldActivity.this, MapActivity.class).putExtra("gameName", new String[] {gameName, itemName});
            startActivity(intent);
        } else {
            Log.e("WorldActivity", "Selected game is null!");
        }
    }
}
