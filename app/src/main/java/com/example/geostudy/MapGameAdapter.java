package com.example.geostudy;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;


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
        ImageView flagIcon = convertView.findViewById(R.id.flag_icon);
        LinearLayout percentBar = convertView.findViewById(R.id.percent_bar);
        TextView percent = convertView.findViewById(R.id.record_percent);
        MapGameItem item = mapGames[position];
        gameName.setText(item.itemName);
        percent.setText(String.valueOf(item.percent) + "%");
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) percentBar.getLayoutParams();
        params.width = convertDpToPx((float) item.percent / 100 * 150);
        percentBar.setLayoutParams(params);
        int iconID = context.getResources().getIdentifier(item.name.toLowerCase(), "drawable", context.getPackageName());
        String resourceName;
        try {
            resourceName = context.getResources().getResourceEntryName(iconID);
            if (iconID != 0 && resourceName.equals(item.name.toLowerCase())){
                System.out.println(iconID + "id");
                flagIcon.setImageResource(iconID);
            }
            System.out.println("Имя ресурса: " + resourceName);
        } catch (Resources.NotFoundException e) {
            Map<String, Integer> maps = new HashMap<>();
            maps.put("africaLow", R.drawable.africa_button_icon);
            maps.put("worldIndiaLow", R.drawable.world_button_icon);
            maps.put("northAmericaLow", R.drawable.america_button_icon);
            maps.put("latinAmericaLow", R.drawable.america_button_icon);
            maps.put("centralAmericaLow", R.drawable.america_button_icon);
            maps.put("caribbeanLow", R.drawable.america_button_icon);
            maps.put("asiaLow", R.drawable.asia_button_icon);
            if (maps.containsKey(item.name)){
                flagIcon.setImageResource(maps.get(item.name));
                flagIcon.setMaxHeight(40);
            } else{
                e.printStackTrace();
            }
        }
        return convertView;
    }

    private int convertDpToPx(float dpValue) {
        return Math.round(TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dpValue,
                context.getResources().getDisplayMetrics()));
    }
}
