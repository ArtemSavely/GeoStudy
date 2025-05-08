package com.example.geostudy;

import java.util.HashMap;
import java.util.Map;

public class MapGamesLists {
    public Map<String, String[]> mapGames = new HashMap<>();
    public String[] world = {"worldIndiaLow"};
    public String[] worldItems = {"Мир: все страны"};
    public String[] europe = {"belarusLow", "russiaHigh"};
    public String[] europeItems = {"Беларусь: регионы", "Россия: субъекты"};

    public Map<String, String> itemsNames = new HashMap<>();

    public MapGamesLists() {
        mapGames.put("world", world);
        mapGames.put("europe", europe);
        for (int i = 0; i < world.length; i++) {
            itemsNames.put(world[i], worldItems[i]);
        }
        for (int i = 0; i < europe.length; i++) {
            itemsNames.put(europe[i], europeItems[i]);
        }
    }

    public String[] getMapGames(String key) {
        return mapGames.get(key);
    }

}
