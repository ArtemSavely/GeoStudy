package com.savely.geostudy;

import android.content.Context;
import android.os.LocaleList;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;

/**
 * Документация к классу.
 * AllGamesList - класс, обеспечивающий взаимодействие с regions.json, в котором хранятся все названия регионов для каждой викторины.
 * Все регионы и страны в regions.json отсортированы по названиям соответсвующих игр. Ключ к названию страны/региона -
 * международный ISO-код.
 * Класс используется в каждой викторине для получения ассоциативного массива со всеми необходимыми регионами для игры.
 */
public class AllGamesList {
    public AllGamesList() {}

    /**
     * Метод, необходимый для получения ассоциативного массива со всеми нужными регионами для текущей игры.
     * @param gameName название текущей игры.
     * @param context контекст.
     * @return ассоциативный массив с названиями регионов на русском и английском.
     */
    public Map<String, Map<String, String>> createMapGame(String gameName, Context context) {
        String jsonStr = loadJSON(context);
        Gson gson = new Gson();
        System.out.println(gameName + "create");
        RegionData data = gson.fromJson(jsonStr, RegionData.class);
        System.out.println(data.getRegionsData() + "contain");
        Map<String, Map<String, String>> currentGemeMap;
        currentGemeMap = data.getRegionsData().get(gameName);
        System.out.println(currentGemeMap);
        return currentGemeMap;
    }

    /**
     * Метод осуществляющий загрузку и чтение regions.json
     * @param context контекст.
     * @return строка-json.
     */
    public String loadJSON(Context context) {
        String json;
        try {
            InputStream inputStream = context.getAssets().open("regions.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException ioException) {
            ioException.printStackTrace();
            return null;
        }
        return json;
    }

    /**
     * Метод для получения текущего языка на устройстве пользователя.
     * @return строка - язык устройства .
     */
    public String getCurrentLanguage() {
        return LocaleList.getDefault().get(0).getLanguage();
    }

    /**
     * Метод для получениея списка всех регионов для игры на текущем языке устройства.
     * @param currentGemeMap ассоциатвный массив с регионами текущей игры на двух языках.
     * @return список всех названий регионов для игры.
     */
    public ArrayList<String> getRegionNames(Map<String, Map<String, String>> currentGemeMap) {
        String currentLang = getCurrentLanguage();
        ArrayList<String> regionNames = new ArrayList<>();
        currentGemeMap.forEach((region, translations) -> {
            regionNames.add(translations.get(currentLang));
        });
        return regionNames;
    }
}