package com.example.geostudy;

import java.util.HashMap;
import java.util.Map;

public class AllGamesList {
    public Map<String, Map<String, String>> allGamesList = new HashMap<>();
    public Map<String, String> countryCodes = new HashMap<>();
    public Map<String, String> belarus = new HashMap<>();

    public AllGamesList(){
        createWorldIndia();
        createBelarus();
        createAllGames();
//        System.out.println(allGamesList.get("belarusLow").values());
    }

    public Map<String, String> getRegionsMap(String key) {
        return allGamesList.get(key);
    }

    public void createWorldIndia(){
        countryCodes.put("AE", "ОАЭ");
        countryCodes.put("AF", "Афганистан");
        countryCodes.put("AL", "Албания");
        countryCodes.put("AM", "Армения");
        countryCodes.put("AO", "Ангола");
        countryCodes.put("AR", "Аргентина");
        countryCodes.put("AT", "Австрия");
        countryCodes.put("AU", "Австралия");
        countryCodes.put("AZ", "Азербайджан");
        countryCodes.put("BA", "Босния и Герцеговина");
        countryCodes.put("BD", "Бангладеш");
        countryCodes.put("BE", "Бельгия");
        countryCodes.put("BF", "Буркина-Фасо");
        countryCodes.put("BG", "Болгария");
        countryCodes.put("BI", "Бурунди");
        countryCodes.put("BJ", "Бенин");
        countryCodes.put("BN", "Бруней-Даруссалам");
        countryCodes.put("BO", "Боливия");
        countryCodes.put("BR", "Бразилия");
        countryCodes.put("BS", "Багамы");
        countryCodes.put("BT", "Бутан");
        countryCodes.put("BW", "Ботсвана");
        countryCodes.put("BY", "Белоруссия");
        countryCodes.put("BZ", "Белиз");
        countryCodes.put("CA", "Канада");
        countryCodes.put("CD", "Демократическая Республика Конго");
        countryCodes.put("CF", "Центральноафриканская Республика");
        countryCodes.put("CG", "Республика Конго");
        countryCodes.put("CH", "Швейцария");
        countryCodes.put("CI", "Кот-д'Ивуар");
        countryCodes.put("CL", "Чили");
        countryCodes.put("CM", "Камерун");
        countryCodes.put("CN", "Китай");
        countryCodes.put("CO", "Колумбия");
        countryCodes.put("CR", "Коста-Рика");
        countryCodes.put("CU", "Куба");
        countryCodes.put("CY", "Кипр");
        countryCodes.put("CZ", "Чехия");
        countryCodes.put("DE", "Германия");
        countryCodes.put("DJ", "Джибути");
        countryCodes.put("DK", "Дания");
        countryCodes.put("DO", "Доминиканская Республика");
        countryCodes.put("DZ", "Алжир");
        countryCodes.put("EC", "Эквадор");
        countryCodes.put("EE", "Эстония");
        countryCodes.put("EG", "Египет");
        countryCodes.put("ER", "Эритрея");
        countryCodes.put("ES", "Испания");
        countryCodes.put("ET", "Эфиопия");
        countryCodes.put("FK", "Фолклендские острова");
        countryCodes.put("FI", "Финляндия");
        countryCodes.put("FJ", "Фиджи");
        countryCodes.put("FR", "Франция");
        countryCodes.put("GA", "Габон");
        countryCodes.put("GB", "Великобритания");
        countryCodes.put("GE", "Грузия");
        countryCodes.put("GF", "Французская Гвиана");
        countryCodes.put("GH", "Гана");
        countryCodes.put("GL", "Гренландия");
        countryCodes.put("GM", "Гамбия");
        countryCodes.put("GN", "Гвинея");
        countryCodes.put("GQ", "Экваториальная Гвинея");
        countryCodes.put("GR", "Греция");
        countryCodes.put("GT", "Гватемала");
        countryCodes.put("GW", "Гвинея-Бисау");
        countryCodes.put("GY", "Гайана");
        countryCodes.put("HN", "Гондурас");
        countryCodes.put("HR", "Хорватия");
        countryCodes.put("HT", "Гаити");
        countryCodes.put("HU", "Венгрия");
        countryCodes.put("ID", "Индонезия");
        countryCodes.put("IE", "Ирландия");
        countryCodes.put("IL", "Израиль");
        countryCodes.put("IN", "Индия");
        countryCodes.put("IQ", "Ирак");
        countryCodes.put("IR", "Иран");
        countryCodes.put("IS", "Исландия");
        countryCodes.put("IT", "Италия");
        countryCodes.put("JM", "Ямайка");
        countryCodes.put("JO", "Иордания");
        countryCodes.put("JP", "Япония");
        countryCodes.put("KE", "Кения");
        countryCodes.put("KG", "Киргизия");
        countryCodes.put("KH", "Камбоджа");
        countryCodes.put("KP", "Северная Корея");
        countryCodes.put("KR", "Южная Корея");
        countryCodes.put("XK", "Косово");
        countryCodes.put("KW", "Кувейт");
        countryCodes.put("KZ", "Казахстан");
        countryCodes.put("LA", "Лаос");
        countryCodes.put("LB", "Ливан");
        countryCodes.put("LK", "Шри-Ланка");
        countryCodes.put("LR", "Либерия");
        countryCodes.put("LS", "Лесото");
        countryCodes.put("LT", "Литва");
        countryCodes.put("LU", "Люксембург");
        countryCodes.put("LV", "Латвия");
        countryCodes.put("LY", "Ливия");
        countryCodes.put("MA", "Марокко");
        countryCodes.put("MD", "Молдова");
        countryCodes.put("ME", "Черногория");
        countryCodes.put("MG", "Мадагаскар");
        countryCodes.put("MK", "Северная Македония");
        countryCodes.put("ML", "Мали");
        countryCodes.put("MM", "Мьянма");
        countryCodes.put("MN", "Монголия");
        countryCodes.put("MR", "Мавритания");
        countryCodes.put("MW", "Малави");
        countryCodes.put("MX", "Мексика");
        countryCodes.put("MY", "Малайзия");
        countryCodes.put("MZ", "Мозамбик");
        countryCodes.put("NA", "Намибия");
        countryCodes.put("NC", "Новая Каледония");
        countryCodes.put("NE", "Нигер");
        countryCodes.put("NG", "Нигерия");
        countryCodes.put("NI", "Никарагуа");
        countryCodes.put("NL", "Нидерланды");
        countryCodes.put("NO", "Норвегия");
        countryCodes.put("NP", "Непал");
        countryCodes.put("NZ", "Новая Зеландия");
        countryCodes.put("OM", "Оман");
        countryCodes.put("PA", "Панама");
        countryCodes.put("PE", "Перу");
        countryCodes.put("PG", "Папуа — Новая Гвинея");
        countryCodes.put("PH", "Филиппины");
        countryCodes.put("PL", "Польша");
        countryCodes.put("PK", "Пакистан");
        countryCodes.put("PR", "Пуэрто-Рико");
        countryCodes.put("PS", "Палестина");
        countryCodes.put("PT", "Португалия");
        countryCodes.put("PY", "Парагвай");
        countryCodes.put("QA", "Катар");
        countryCodes.put("RO", "Румыния");
        countryCodes.put("RS", "Сербия");
        countryCodes.put("RU", "Россия");
        countryCodes.put("RW", "Руанда");
        countryCodes.put("SA", "Саудовская Аравия");
        countryCodes.put("SB", "Соломоновы Острова");
        countryCodes.put("SD", "Судан");
        countryCodes.put("SE", "Швеция");
        countryCodes.put("SI", "Словения");
        countryCodes.put("SJ", "Шпицберген и Ян-Майен");
        countryCodes.put("SK", "Словакия");
        countryCodes.put("SL", "Сьерра-Леоне");
        countryCodes.put("SN", "Сенегал");
        countryCodes.put("SO", "Сомали");
        countryCodes.put("SR", "Суринам");
        countryCodes.put("SS", "Южный Судан");
        countryCodes.put("SV", "Сальвадор");
        countryCodes.put("SY", "Сирия");
        countryCodes.put("SZ", "Эсватини");
        countryCodes.put("TD", "Чад");
        countryCodes.put("TF", "Французские Южные территории");
        countryCodes.put("TG", "Того");
        countryCodes.put("TH", "Таиланд");
        countryCodes.put("TJ", "Таджикистан");
        countryCodes.put("TL", "Восточный Тимор");
        countryCodes.put("TM", "Туркмения");
        countryCodes.put("TN", "Тунис");
        countryCodes.put("TR", "Турция");
        countryCodes.put("TT", "Тринидад и Тобаго");
        countryCodes.put("TW", "Тайвань");
        countryCodes.put("TZ", "Танзания");
        countryCodes.put("UA", "Украина");
        countryCodes.put("UG", "Уганда");
        countryCodes.put("US", "США");
        countryCodes.put("UY", "Уругвай");
        countryCodes.put("UZ", "Узбекистан");
        countryCodes.put("VE", "Венесуэла");
        countryCodes.put("VN", "Вьетнам");
        countryCodes.put("VU", "Вануату");
        countryCodes.put("YE", "Йемен");
        countryCodes.put("ZA", "Южно-Африканская Республика");
        countryCodes.put("ZM", "Замбия");
        countryCodes.put("ZW", "Зимбабве");
    }

    public void createBelarus() {
        belarus.put("BY-BR", "Брестская область");
        belarus.put("BY-HO", "Гомельская область");
//        belarus.put("BY-HM", "Город Минск");
        belarus.put("BY-HR", "Гродненская область");
        belarus.put("BY-MA", "Могилевская область");
        belarus.put("BY-MI", "Минская область");
        belarus.put("BY-VI", "Витебская область");
    }

    public void createAllGames(){
        allGamesList.put("worldIndiaLow", countryCodes);
        allGamesList.put("belarusLow", belarus);
    }


}
