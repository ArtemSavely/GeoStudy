package com.example.geostudy;

import java.util.HashMap;
import java.util.Map;

public class MapGamesLists {
    public Map<String, String[]> mapGames = new HashMap<>();
    public String[] world = {"worldIndiaLow"};
    public String[] worldItems = {"Мир: все страны"};
    public String[] europe = {"europeLow", "belarusLow", "russiaHigh"};
    public String[] europeItems = {"Европа: страны", "Беларусь: регионы", "Россия: субъекты"};
    public String[] africa = {"africaLow"};
    public String[] africaItems = {"Африка: страны"};
    public String[] america = {"northAmericaLow"};
    public String[] americaItems = {"Северная Америка: страны"};

    public Map<String, String> itemsNames = new HashMap<>();

    public MapGamesLists() {
        mapGames.put("world", world);
        mapGames.put("europe", europe);
        mapGames.put("africa", africa);
        mapGames.put("america", america);
        for (int i = 0; i < world.length; i++) {
            itemsNames.put(world[i], worldItems[i]);
        }
        for (int i = 0; i < europe.length; i++) {
            itemsNames.put(europe[i], europeItems[i]);
        }
        for (int i = 0; i < africa.length; i++) {
            itemsNames.put(africa[i], africaItems[i]);
        }
        for (int i = 0; i < america.length; i++) {
            itemsNames.put(america[i], americaItems[i]);
        }
    }

    public String[] getMapGames(String key) {
        return mapGames.get(key);
    }

}
