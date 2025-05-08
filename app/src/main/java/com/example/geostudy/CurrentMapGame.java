package com.example.geostudy;

import android.view.Gravity;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;


public class CurrentMapGame {
    public Map<String, String> regions;

    public Map<String, String> reversedRegions;

    public String currentRegion;
    public MapActivity activity;
    public int coins;

    public CurrentMapGame(Map<String, String> regions, MapActivity activity) {
        this.regions = regions;
        this.currentRegion = "";
        this.coins = 0;
        this.activity = activity;
        this.reversedRegions = new HashMap<>();
        for (Map.Entry<String, String> entry : regions.entrySet()) {
            reversedRegions.put(entry.getValue(), entry.getKey());
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
                            activity.showFininshAlert();
                        }
                    });
                }
            }).start();
        }
    }

    @JavascriptInterface
    public void showIncorrectToast(String regionId){
        Toast toast = Toast.makeText(activity, regions.get(regionId), Toast.LENGTH_SHORT);
        toast.setView(activity.createCustomToast(regions.get(regionId)));
        toast.setGravity(Gravity.TOP, 0,1200);
        toast.show();
    }

    @JavascriptInterface
    public boolean check(String id){
        boolean flag = regions.get(id).equals(currentRegion) ? true : false;
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
