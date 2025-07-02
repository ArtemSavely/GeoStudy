package com.savely.geostudy;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Документация к классу. MapMenuFragment - фрагмент для отображения меню доступных игр-карт из выбранного
 * раздела.
 */
public class MapMenuFragment extends Fragment {
    RecyclerView recyclerView;
    TextView toolBarTextView;
    ImageButton action_back;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_map_menu, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        toolBarTextView = view.findViewById(R.id.tool_bar_text_view);
        action_back = view.findViewById(R.id.menu_action_back);
        action_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController navController = Navigation.findNavController(requireView());
                navController.popBackStack(R.id.main_fragment , false);
            }
        });
        MapGamesLists maps = new MapGamesLists(requireContext());
        MapMenuFragmentArgs args = MapMenuFragmentArgs.fromBundle(getArguments());
        String[] argsList = args.getGameClass();
        toolBarTextView.setText(argsList[1]);
        String[] mapGamesList = maps.getMapGames(argsList[0]);
        MapGameItem[] mapItems = makeMapGames(maps, mapGamesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        MapGameAdapter mapGameAdapter = new MapGameAdapter(mapItems, requireContext(), new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                MapGameItem selectedGame = mapItems[position];
                String gameName = selectedGame.name;
                String itemName = selectedGame.itemName;
                MapMenuFragmentDirections.ActionToMap action = MapMenuFragmentDirections
                        .actionToMap(new String[] {gameName, itemName});
                Navigation.findNavController(view).navigate(action);
            }
        });
        recyclerView.setAdapter(mapGameAdapter);
        return view;
    }

    /**
     * Метод для формирования списка элементов {@link MapGameItem} для отображения в меню.
     * @param maps объект класса {@link MapGamesLists}
     * @param mapList список карт
     * @return список MapGameItem[]
     */
    MapGameItem[] makeMapGames(MapGamesLists maps, String[] mapList) {
        MapGameItem[] mapGames = new MapGameItem[mapList.length];
        for(int i = 0; i < mapGames.length; i ++){
            SharedPreferences sharedPref = requireContext().getSharedPreferences("geostudy_prefs", Context.MODE_PRIVATE);
            int bestScore = sharedPref.getInt(mapList[i], 0);
            MapGameItem mapGame = new MapGameItem();
            mapGame.name = mapList[i];
            mapGame.itemName = maps.itemsNames.get(mapList[i]);
            mapGame.percent = bestScore;
            mapGames[i] = mapGame;
        }
        return mapGames;
    }
}
