package com.example.geostudy;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class RegionData {
    @SerializedName("regions")
    public Map<String, Map<String, Map<String, String>>> allGamesData = new HashMap<>();
    public Map<String, Map<String, Map<String, String>>> getRegionsData(){
        return allGamesData;
    }
}
