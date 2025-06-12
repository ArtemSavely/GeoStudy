package com.savely.geostudy;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

/**
 * Документация к классу. RegionData - класс для содержания ассоциативного массива с данными, полученными
 * из regions.json.
 */
public class RegionData {
    @SerializedName("regions")
    public Map<String, Map<String, Map<String, String>>> allGamesData = new HashMap<>();
    public Map<String, Map<String, Map<String, String>>> getRegionsData(){
        return allGamesData;
    }
}
