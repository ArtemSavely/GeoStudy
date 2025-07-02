package com.savely.geostudy;

import android.view.Gravity;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import java.util.HashMap;
import java.util.Map;

/**
 * Документация к классу. CurrentMapGame - класс, отвечающий за текущую игру. В нем происходит проверка ответов, переход на следующий вопрос,
 * вызов обновления списка ответов пользователя.
 */
public class CurrentMapGame {
    public Map<String, Map<String, String>> regions;

    public Map<String, String> reversedRegions;

    public String currentRegion;
    public FragmentActivity activity;
    MapFragment fragment;
    public AllGamesList allGamesList;
    public int coins;

    /**
     * Конструктор класса.
     * @param regions ассоциативный массив со всеми регионами для игры. Ключи - международные ISO-коды стран и регионов,
     *                по которым можно получить название регионов на двух языках.
     * @param activity активность, из которой запущена игра.
     * @param allGamesList объект класса AllGamesList (см. {@link AllGamesList})
     */
    public CurrentMapGame(Map<String, Map<String, String>> regions, FragmentActivity activity, MapFragment fragment, AllGamesList allGamesList) {
        this.regions = regions;
        this.currentRegion = "";
        this.coins = 0;
        this.activity = activity;
        this.fragment = fragment;
        this.reversedRegions = new HashMap<>();
        this.allGamesList = allGamesList;
        for (Map.Entry<String, Map<String, String>> entry : regions.entrySet()) {
            reversedRegions.put(entry.getValue().get(allGamesList.getCurrentLanguage()), entry.getKey());
        }
    }

    /**
     * Метод, вызываемый из assets/script.js для перехода на следующий вопрос игры
     */
    @JavascriptInterface
    public void nextGame(){
        if (fragment.gameIndex < regions.size() - 1){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            fragment.nextQuestion();
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
                            fragment.finishCurrentGame();
                        }
                    });
                }
            }).start();
        }
    }

    /**
     * Метод, вызываемый из assets/script.js для отображения Toast с правильным ответом на вопрос,
     * если ответ пользователя оказался неверным.
     * @param regionId ISO-код региона, полученный при нажатии на объект svg карты, по сути ответ пользователя.
     *                 Используется как ключ для получения названия региона.
     */
    @JavascriptInterface
    public void showIncorrectToast(String regionId){
        String regionName = regions.get(regionId).get(allGamesList.getCurrentLanguage());
        Toast toast = Toast.makeText(activity, regionName, Toast.LENGTH_SHORT);
        toast.setView(fragment.createCustomToast(regionName));
        toast.setGravity(Gravity.TOP, 0,1200);
        toast.show();
    }

    /**
     * Метод, вызываемый из assets/script.js для проверки правильности ответа пользователя.
     * @param id ISO-код региона, полученный при нажатии на объект svg карты, по сути ответ пользователя.
     * @return логическое значение: true, если ответ правильный, false, если наоборот.
     */
    @JavascriptInterface
    public boolean check(String id){
        boolean flag = regions.get(id).get(allGamesList.getCurrentLanguage()).equals(currentRegion) ? true : false;
        if (flag) {coins ++;}
        fragment.answerListAdapter.insert(new AnswerItem(currentRegion, flag));
        return flag;
    }

    /**
     * Метод, вызываемый из assets/script.js, возвращающий ISO-код текущего региона (вопроса) для того,
     * чтобы подсветить его красным цветом на карте, если ответ пользователя был неверным.
     * @return ISO-код текущего региона (вопроса)
     */
    @JavascriptInterface
    public String getCurrentRegion(){return reversedRegions.get(currentRegion);
    }
}
