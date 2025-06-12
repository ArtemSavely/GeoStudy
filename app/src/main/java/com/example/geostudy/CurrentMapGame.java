package com.example.geostudy;

import android.view.Gravity;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;


public class CurrentMapGame {
    public Map<String, Map<String, String>> regions;

    public Map<String, String> reversedRegions;

    public String currentRegion;
    public MapActivity activity;
    public AllGamesList allGamesList;
    public int coins;

    public CurrentMapGame(Map<String, Map<String, String>> regions, MapActivity activity, AllGamesList allGamesList) {
        this.regions = regions;
        this.currentRegion = "";
        this.coins = 0;
        this.activity = activity;
        this.reversedRegions = new HashMap<>();
        this.allGamesList = allGamesList;
        for (Map.Entry<String, Map<String, String>> entry : regions.entrySet()) {
            reversedRegions.put(entry.getValue().get(allGamesList.getCurrentLanguage()), entry.getKey());
        }
    }
    @JavascriptInterface
    public void nextGame(){
        if (activity.gameIndex < regions.size() - 1){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            activity.nextQuestion();
                        }
                    });
                }
            }).start();
        } else {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            activity.finishCurrentGame();
                        }
                    });
                }
            }).start();
        }
    }

    @JavascriptInterface
    public void showIncorrectToast(String regionId){
        String regionName = regions.get(regionId).get(allGamesList.getCurrentLanguage());
        Toast toast = Toast.makeText(activity, regionName, Toast.LENGTH_SHORT);
        toast.setView(activity.createCustomToast(regionName));
        toast.setGravity(Gravity.TOP, 0,1200);
        toast.show();
    }

    @JavascriptInterface
    public boolean check(String id){
        boolean flag = regions.get(id).get(allGamesList.getCurrentLanguage()).equals(currentRegion) ? true : false;
        if (flag) {coins ++;}
        activity.answerListAdapter.insert(new AnswerItem(currentRegion, flag));
        activity.answerListAdapter.animateFirstItem(activity.answers);
        return flag;
    }


    @JavascriptInterface
    public String getCurrentRegion(){
        return reversedRegions.get(currentRegion);
    }
}
