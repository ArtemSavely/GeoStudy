package com.example.geostudy;

import java.util.HashMap;
import java.util.Map;

public class MapGamesLists {
    public Map<String, String[]> mapGames = new HashMap<>();
    public String[] world = {"worldIndiaLow"};
    public String[] worldItems = {"Мир: все страны"};
    public String[] europe = {"europeLow", "belarusLow", "bulgariaLow", "hungaryLow", "ukLow", "germanyLow", "greeceLow", "denmarkLow", "italyLow", "netherlandsLow", "polandLow", "russiaHigh", "finlandLow", "franceLow", "czechLow", "switzerlandLow", "estoniaLow"};
    public String[] europeItems = {"Европа: страны", "Беларусь: регионы", "Болгария: регионы", "Венгрия: медье", "Великобритания: регионы + Ирландия", "Германия: федеральные земли", "Греция: регионы", "Дания: регионы", "Италия: регионы", "Нидерланды: провинции", "Польша: воеводства", "Россия: субъекты", "Финляндия: области", "Франция: регионы", "Чехия: края", "Швейцария: кантоны", "Эстония: уезды"};
    public String[] africa = {"africaLow"};
    public String[] africaItems = {"Африка: страны"};
    public String[] america = {"northAmericaLow", "centralAmericaLow", "latinAmericaLow", "caribbeanLow", "canadaLow", "usaLow", "mexicoLow", "argentinaLow", "brazilLow"};
    public String[] americaItems = {"Северная Америка: страны", "Центральная Америка: страны", "Латинская Америка: страны", "Страны Карибского бассейна", "Канада: штаты", "США: штаты", "Мексика: штаты", "Аргентина: провинции", "Бразилия: штаты"};
    public String[] asia = {"asiaLow", "chinaLow"};
    public String[] asiaItems = {"Азия: страны", "Китай: регионы"};
    public String[] oceania = {"australiaLow"};
    public String[] oceaniaItems = {"Австралия: штаты"};
    public Map<String, String> itemsNames = new HashMap<>();

    public MapGamesLists() {
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
