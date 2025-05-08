package com.example.geostudy;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

public class WorldActivity extends ListActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);
        listView = (ListView) findViewById(android.R.id.list);
        MapGamesLists maps = new MapGamesLists();
        String[] mapGamesList = maps.getMapGames(getIntent().getStringExtra("gameClass"));
        MapGameAdapter mapGameAdapter = new MapGameAdapter(this, makeMapGames(maps, mapGamesList));
        setListAdapter(mapGameAdapter);
    }

    MapGameItem[] makeMapGames(MapGamesLists maps, String[] mapList) {
        MapGameItem[] mapGames = new MapGameItem[mapList.length];

        for(int i = 0; i < mapGames.length; i ++){
            MapGameItem mapGame = new MapGameItem();
            mapGame.name = mapList[i];
            mapGame.itemName = maps.itemsNames.get(mapList[i]);
            mapGames[i] = mapGame;
        }
        return mapGames;
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        MapGameItem selectedGame = (MapGameItem) getListAdapter().getItem(position);
        if (selectedGame != null) {
            String gameName = selectedGame.name;
            Intent intent = new Intent(WorldActivity.this, MapActivity.class).putExtra("gameName", gameName);
            startActivity(intent);
        } else {
            Log.e("WorldActivity", "Selected game is null!");
        }
    }
}
