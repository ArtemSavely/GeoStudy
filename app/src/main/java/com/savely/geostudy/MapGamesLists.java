package com.savely.geostudy;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;
/**
 * Документация к классу. MapGamesLists - класс, содержащий поля - списки с названиями игр-карт,
 * а также списки с соответствующими именами файлов этих карт.
 */
public class MapGamesLists {
    public Map<String, String[]> mapGames = new HashMap<>();
    public String[] world = {"worldIndiaLow"};
    public String[] worldItems;
    public String[] europe = {"europeLow", "belarusLow", "bulgariaLow", "hungaryLow", "ukLow", "germanyLow", "greeceLow", "denmarkLow", "italyLow", "netherlandsLow", "polandLow", "russiaLow", "finlandLow", "franceLow", "czechLow", "switzerlandLow", "estoniaLow"};
    public String[] europeItems;
    public String[] africa = {"africaLow", "southAfricaLow", "egyptLow"};
    public String[] africaItems;
    public String[] america = {"northAmericaLow", "centralAmericaLow", "latinAmericaLow", "caribbeanLow", "canadaLow", "usaLow", "mexicoLow", "argentinaLow", "brazilLow"};
    public String[] americaItems;
    public String[] asia = {"asiaLow", "chinaLow", "japanLow", "southKoreaLow", "indonesiaLow", "unitedArabEmiratesLow", "turkeyLow", "indiaLow"};
    public String[] asiaItems;
    public String[] oceania = {"oceaniaLow", "australiaLow", "newZealandLow", "newCaledoniaLow"};
    public String[] oceaniaItems;
    public Map<String, String> itemsNames = new HashMap<>();

    public MapGamesLists(Context context) {
        worldItems = context.getResources().getStringArray(R.array.world_regions);
        europeItems = context.getResources().getStringArray(R.array.european_regions);
        africaItems = context.getResources().getStringArray(R.array.african_regions);
        americaItems = context.getResources().getStringArray(R.array.americas_regions);
        asiaItems = context.getResources().getStringArray(R.array.asia_regions);
        oceaniaItems = context.getResources().getStringArray(R.array.australia_oceania_regions);
        mapGames.put("world", world);
        mapGames.put("europe", europe);
        mapGames.put("africa", africa);
        mapGames.put("america", america);
        mapGames.put("asia", asia);
        mapGames.put("oceania", oceania);
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
        for (int i = 0; i < asia.length; i++) {
            itemsNames.put(asia[i], asiaItems[i]);
        }
        for (int i = 0; i < oceania.length; i++) {
            itemsNames.put(oceania[i], oceaniaItems[i]);
        }
    }

    public String[] getMapGames(String key) {
        return mapGames.get(key);
    }

}
