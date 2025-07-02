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

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.Map;

/**
 * Документация к классу. MapGameAdapter - класс-адаптер для списка RecyclerView из меню игр-карт.
 */
public class MapGameAdapter extends RecyclerView.Adapter<MapGameAdapter.MapGameViewHolder> {
    MapGameItem[] mapGames;
    Context context;
    OnItemClickListener listener;

    public static class MapGameViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout item;

        public MapGameViewHolder(View view, OnItemClickListener listener) {
            super(view);
            item = view.findViewById(R.id.map_item);
            item.setOnClickListener(v -> {
                if (listener != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position);
                    }
                }
            });
        }
    }

    public MapGameAdapter(MapGameItem[] mapGames, Context context, OnItemClickListener onItemClickListener) {
        this.mapGames = mapGames;
        this.context = context;
        this.listener = onItemClickListener;
    }

    @NonNull
    @Override
    public MapGameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_map_game_item, parent, false);
        return new MapGameViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull MapGameViewHolder holder, int position) {
        MapGameItem item = mapGames[position];
        TextView gameName = holder.item.findViewById(R.id.game_name);
        ImageView flagIcon = holder.item.findViewById(R.id.flag_icon);
        View percentBar = holder.item.findViewById(R.id.percent_bar);
        LinearLayout bar = holder.item.findViewById(R.id.bar);
        bar.post(() -> {
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
        TextView percent = holder.item.findViewById(R.id.record_percent);
        gameName.setText(item.itemName);
        percent.setText(String.valueOf(item.percent) + "%");
        int iconID = context.getResources().getIdentifier(item.name.toLowerCase(), "drawable", context.getPackageName());
        String resourceName;
        try {
            resourceName = context.getResources().getResourceEntryName(iconID);
            if (iconID != 0 && resourceName.equals(item.name.toLowerCase())) {
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
            if (maps.containsKey(item.name)) {
                flagIcon.setImageResource(maps.get(item.name));
                flagIcon.setMaxHeight(40);
            } else {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getItemCount() {
        return mapGames.length;
    }
}