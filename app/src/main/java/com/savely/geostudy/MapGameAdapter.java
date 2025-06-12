package com.savely.geostudy;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

/**
 * Документация к классу. MapGameAdapter - класс-адаптер для списка ListView из меню игр-карт.
 */
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
        MapGameItem item = mapGames[position];
        TextView gameName = convertView.findViewById(R.id.game_name);
        ImageView flagIcon = convertView.findViewById(R.id.flag_icon);
        View percentBar = convertView.findViewById(R.id.percent_bar);
        LinearLayout bar = convertView.findViewById(R.id.bar);
        bar.post(() ->{
            int barWidth = bar.getWidth();
            ViewGroup.LayoutParams params = (LinearLayout.LayoutParams) percentBar.getLayoutParams();
            params.width = item.percent * barWidth / 100;
            percentBar.setLayoutParams(params);
            PathInterpolator pathInterpolator = new PathInterpolator(0.2f, 0.8f, 0.6f, 1f);  //анимация прогресс-бара элемента списка
            percentBar.setScaleX(0f);
            percentBar.setPivotX(0f);
            percentBar.setAlpha(0f);
            percentBar.animate()
                    .scaleX(1f)
                    .alpha(1f)
                    .setDuration(1200)
                    .setInterpolator(pathInterpolator)
                    .start();
        });
        TextView percent = convertView.findViewById(R.id.record_percent);
        gameName.setText(item.itemName);
        percent.setText(String.valueOf(item.percent) + "%");
        int iconID = context.getResources().getIdentifier(item.name.toLowerCase(), "drawable", context.getPackageName());
        String resourceName;
        try {
            resourceName = context.getResources().getResourceEntryName(iconID);
            if (iconID != 0 && resourceName.equals(item.name.toLowerCase())){
                System.out.println(iconID + "id");
                flagIcon.setImageResource(iconID);   //присвоение иконки-флага соответсвующим играм-картам
            }
            System.out.println("Имя ресурса: " + resourceName);
        } catch (Resources.NotFoundException e) {
            Map<String, Integer> maps = new HashMap<>();
            maps.put("africaLow", R.drawable.africa_button_icon);
            maps.put("worldIndiaLow", R.drawable.world_button_icon);
            maps.put("northAmericaLow", R.drawable.america_button_icon);
            maps.put("latinAmericaLow", R.drawable.america_button_icon);    // присвоение иконок картам, для которых нет флагов
            maps.put("centralAmericaLow", R.drawable.america_button_icon);
            maps.put("caribbeanLow", R.drawable.america_button_icon);
            maps.put("asiaLow", R.drawable.asia_button_icon);
            maps.put("oceaniaLow", R.drawable.oceania_button_icon);
            if (maps.containsKey(item.name)){
                flagIcon.setImageResource(maps.get(item.name));
                flagIcon.setMaxHeight(40);
            } else{
                e.printStackTrace();
            }
        }
        return convertView;
    }
}
