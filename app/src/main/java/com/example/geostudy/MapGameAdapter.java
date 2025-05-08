package com.example.geostudy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class MapGameAdapter extends BaseAdapter {
    Context context;
    MapGameItem[] mapGames;
    public MapGameAdapter(Context context, MapGameItem[] mapGames) {
        this.mapGames = mapGames;
        this.context = context;
    }
    @Override
    public int getCount() {
        return mapGames.length;
    }

    @Override
    public MapGameItem getItem(int position) {
        return mapGames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_map_game_item, parent, false);
        }
        TextView gameName = convertView.findViewById(R.id.game_name);
        MapGameItem item = mapGames[position];
        gameName.setText(item.itemName);
        return convertView;
    }
}
