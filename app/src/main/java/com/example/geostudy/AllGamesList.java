package com.example.geostudy;

import java.util.HashMap;
import java.util.Map;

public class AllGamesList {
    public Map<String, Map<String, String>> allGamesList = new HashMap<>();
    public Map<String, String> countryCodes = new HashMap<>();
    public Map<String, String> belarus = new HashMap<>();
    public Map<String, String> russia = new HashMap<>();
    public Map<String, String> europe = new HashMap<>();
    public Map<String, String> africa = new HashMap<>();
    public Map<String, String> northAmerica = new HashMap<>();
    public Map<String, String> centralAmerica = new HashMap<>();
    public Map<String, String> latinAmerica = new HashMap<>();
    public Map<String, String> usa = new HashMap<>();
    public Map<String, String> asia = new HashMap<>();
    public Map<String, String> china = new HashMap<>();

    public AllGamesList(){
//        createWorldIndia();
//        createBelarus();
//        createAllGames();
//        createRussia();
//        createEurope();
//        System.out.println(allGamesList.get("belarusLow").values());
    }

    public Map<String, String> getRegionsMap(String key) {
        return allGamesList.get(key);
    }

    public void createMapGame(String map){
        switch (map){
            case "russiaHigh":
                createRussia();
                break;
            case "europeLow":
                createEurope();
                break;
            case "worldIndiaLow":
                createWorldIndia();
                break;
            case "belarusLow":
                createBelarus();
                break;
            case "africaLow":
                createAfrica();
                System.out.println(africa);
                break;
            case "northAmericaLow":
                createNorthAmerica();
                break;
            case "centralAmericaLow":
                createCentralAmerica();
                break;
            case "latinAmericaLow":
                createLatinAmerica();
                break;
            case "usaLow":
                createUSA();
                break;
            case "asiaLow":
                createAsia();
                break;
            case "chinaLow":
                createChina();
                break;
        }
        createAllGames();
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
    
    public void createNorthAmerica(){
        northAmerica.put("BS", "Багамские Острова");
        northAmerica.put("BZ", "Белиз");
        northAmerica.put("CA", "Канада");
        northAmerica.put("CR", "Коста-Рика");
        northAmerica.put("CU", "Куба");
        northAmerica.put("DO", "Доминиканская Республика");
        northAmerica.put("GT", "Гватемала");
        northAmerica.put("HN", "Гондурас");
        northAmerica.put("HT", "Гаити");
        northAmerica.put("JM", "Ямайка");
        northAmerica.put("MX", "Мексика");
        northAmerica.put("NI", "Никарагуа");
        northAmerica.put("PA", "Панама");
        northAmerica.put("PR", "Пуэрто-Рико");
        northAmerica.put("SV", "Сальвадор");
        northAmerica.put("US", "США");
    }
    
    public void createCentralAmerica(){
        centralAmerica.put("BZ", "Белиз");
        centralAmerica.put("CR", "Коста-Рика");
        centralAmerica.put("GT", "Гватемала");
        centralAmerica.put("HN", "Гондурас");
        centralAmerica.put("MX", "Мексика");
        centralAmerica.put("NI", "Никарагуа");
        centralAmerica.put("PA", "Панама");
        centralAmerica.put("SV", "Сальвадор");
    }
    
    public void createLatinAmerica(){
        latinAmerica.put("AR", "Аргентина");
        latinAmerica.put("BO", "Боливия");
        latinAmerica.put("BR", "Бразилия");
        latinAmerica.put("CL", "Чили");
        latinAmerica.put("CO", "Колумбия");
        latinAmerica.put("EC", "Эквадор");
        latinAmerica.put("FK", "Фолклендские острова");
        latinAmerica.put("GF", "Французская Гвиана");
        latinAmerica.put("GY", "Гайана");
        latinAmerica.put("PE", "Перу");
        latinAmerica.put("PY", "Парагвай");
        latinAmerica.put("SR", "Суринам");
        latinAmerica.put("UY", "Уругвай");
        latinAmerica.put("VE", "Венесуэла");

        // Центральная Америка
        latinAmerica.put("BZ", "Белиз");
        latinAmerica.put("CR", "Коста-Рика");
        latinAmerica.put("GT", "Гватемала");
        latinAmerica.put("HN", "Гондурас");
        latinAmerica.put("MX", "Мексика");
        latinAmerica.put("NI", "Никарагуа");
        latinAmerica.put("PA", "Панама");
        latinAmerica.put("SV", "Сальвадор");

        // Карибский бассейн
        latinAmerica.put("BS", "Багамские Острова");
        latinAmerica.put("CU", "Куба");
        latinAmerica.put("DO", "Доминиканская Республика");
        latinAmerica.put("HT", "Гаити");
        latinAmerica.put("JM", "Ямайка");
        latinAmerica.put("PR", "Пуэрто-Рико");
        latinAmerica.put("TT", "Тринидад и Тобаго");
    }
    public void createUSA(){
        usa.put("US-AK", "Аляска");
        usa.put("US-AL", "Алабама");
        usa.put("US-AR", "Арканзас");
        usa.put("US-AZ", "Аризона");
        usa.put("US-CA", "Калифорния");
        usa.put("US-CO", "Колорадо");
        usa.put("US-CT", "Коннектикут");
        //usa.put("US-DC", "Округ Колумбия");
        usa.put("US-DE", "Делавэр");
        usa.put("US-FL", "Флорида");
        usa.put("US-GA", "Джорджия");
        usa.put("US-HI", "Гавайи");
        usa.put("US-IA", "Айова");
        usa.put("US-ID", "Айдахо");
        usa.put("US-IL", "Иллинойс");
        usa.put("US-IN", "Индиана");
        usa.put("US-KS", "Канзас");
        usa.put("US-KY", "Кентукки");
        usa.put("US-LA", "Луизиана");
        usa.put("US-MA", "Массачусетс");
        usa.put("US-MD", "Мэриленд");
        usa.put("US-ME", "Мэн");
        usa.put("US-MI", "Мичиган");
        usa.put("US-MN", "Миннесота");
        usa.put("US-MO", "Миссури");
        usa.put("US-MS", "Миссисипи");
        usa.put("US-MT", "Монтана");
        usa.put("US-NC", "Северная Каролина");
        usa.put("US-ND", "Северная Дакота");
        usa.put("US-NE", "Небраска");
        usa.put("US-NH", "Нью-Гэмпшир");
        usa.put("US-NJ", "Нью-Джерси");
        usa.put("US-NM", "Нью-Мексико");
        usa.put("US-NV", "Невада");
        usa.put("US-NY", "Нью-Йорк");
        usa.put("US-OH", "Огайо");
        usa.put("US-OK", "Оклахома");
        usa.put("US-OR", "Орегон");
        usa.put("US-PA", "Пенсильвания");
        usa.put("US-RI", "Род-Айленд");
        usa.put("US-SC", "Южная Каролина");
        usa.put("US-SD", "Южная Дакота");
        usa.put("US-TN", "Теннесси");
        usa.put("US-TX", "Техас");
        usa.put("US-UT", "Юта");
        usa.put("US-VA", "Вирджиния");
        usa.put("US-VT", "Вермонт");
        usa.put("US-WA", "Вашингтон");
        usa.put("US-WI", "Висконсин");
        usa.put("US-WV", "Западная Вирджиния");
        usa.put("US-WY", "Вайоминг");
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

    public void createEurope(){
        europe.put("RU", "Россия");
        europe.put("NL", "Нидерланды");
        europe.put("CY", "Кипр");
        europe.put("UA", "Украина");
        europe.put("TR", "Турция");
        europe.put("SE", "Швеция");
        europe.put("SI", "Словения");
        europe.put("SK", "Словакия");
        europe.put("RS", "Сербия");
        europe.put("RO", "Румыния");
        europe.put("PT", "Португалия");
        europe.put("PL", "Польша");
        //europe.put("SJ", "Шпицберген и Ян-Майен");
        europe.put("NO", "Норвегия");
        europe.put("ME", "Черногория");
        europe.put("MK", "Северная Македония");
        europe.put("MD", "Молдова");
        europe.put("LV", "Латвия");
        europe.put("LU", "Люксембург");
        europe.put("LT", "Литва");
        //europe.put("LI", "Лихтенштейн");
        europe.put("KV", "Косово");
        //europe.put("JE", "Джерси");
        europe.put("IS", "Исландия");
        europe.put("IE", "Ирландия");
        //europe.put("IM", "Остров Мэн");
        europe.put("HU", "Венгрия");
        europe.put("HR", "Хорватия");
        europe.put("GR", "Греция");
        //europe.put("GG", "Гернси");
        europe.put("GE", "Грузия");
        europe.put("FR", "Франция");
        //europe.put("FO", "Фарерские острова");
        europe.put("FI", "Финляндия");
        europe.put("EE", "Эстония");
        europe.put("ES", "Испания");
        europe.put("GB", "Великобритания");
        europe.put("DK", "Дания");
        europe.put("DE", "Германия");
        europe.put("CZ", "Чехия");
        europe.put("CH", "Швейцария");
        europe.put("BY", "Беларусь");
        europe.put("BA", "Босния и Герцеговина");
        europe.put("BG", "Болгария");
        europe.put("BE", "Бельгия");
        europe.put("AZ", "Азербайджан");
        europe.put("AT", "Австрия");
        europe.put("AM", "Армения");
        //europe.put("AX", "Аландские острова");
        europe.put("AL", "Албания");
        europe.put("IT", "Италия");
        europe.put("KZ", "Казахстан");
        europe.put("AD", "Андорра");
        //europe.put("MT", "Мальта");
        //europe.put("MC", "Монако");
        //europe.put("SM", "Сан-Марино");
        //europe.put("GI", "Гибралтар");
        //europe.put("VA", "Ватикан");
    }

    public void createRussia() {
        russia.put("RU-AD", "Республика Адыгея");
        russia.put("RU-ALT", "Алтайский край");
        russia.put("RU-AMU", "Амурская область");
        russia.put("RU-ARK", "Архангельская область");
        russia.put("RU-AST", "Астраханская область");
        russia.put("RU-BA", "Республика Башкортостан");
        russia.put("RU-BEL", "Белгородская область");
        russia.put("RU-BRY", "Брянская область");
        russia.put("RU-BU", "Республика Бурятия");
        russia.put("RU-CE", "Чеченская Республика");
        russia.put("RU-CHE", "Челябинская область");
        russia.put("RU-CHU", "Чукотский автономный округ");
        russia.put("RU-CU", "Чувашская Республика");
        russia.put("RU-DA", "Республика Дагестан");
        russia.put("RU-AL", "Республика Алтай");
        russia.put("RU-IN", "Республика Ингушетия");
        russia.put("RU-IRK", "Иркутская область");
        russia.put("RU-IVA", "Ивановская область");
        russia.put("RU-KB", "Кабардино-Балкарская Республика");
        russia.put("RU-KC", "Карачаево-Черкесская Республика");
        russia.put("RU-KDA", "Краснодарский край");
        russia.put("RU-KEM", "Кемеровская область");
        russia.put("RU-KLU", "Калужская область");
        russia.put("RU-KHA", "Хабаровский край");
        russia.put("RU-KR", "Республика Карелия");
        russia.put("RU-KK", "Республика Хакасия");
        russia.put("RU-KL", "Республика Калмыкия"); // Исправлено с Калининградской на Калмыкию
        russia.put("RU-KHM", "Ханты-Мансийский автономный округ — Югра");
        russia.put("RU-KGD", "Калининградская область");
        russia.put("RU-KO", "Республика Коми");
        russia.put("RU-KAM", "Камчатский край");
        russia.put("RU-KRS", "Курская область");
        russia.put("RU-KOS", "Костромская область");
        russia.put("RU-KGN", "Курганская область");
        russia.put("RU-KIR", "Кировская область");
        russia.put("RU-KYA", "Красноярский край");
        russia.put("RU-LEN", "Ленинградская область");
        russia.put("RU-LIP", "Липецкая область");
        russia.put("RU-MOW", "Москва");
        russia.put("RU-ME", "Республика Марий Эл");
        russia.put("RU-MAG", "Магаданская область");
        russia.put("RU-MUR", "Мурманская область");
        russia.put("RU-MO", "Республика Мордовия");
        russia.put("RU-MOS", "Московская область");
        russia.put("RU-NGR", "Новгородская область");
        russia.put("RU-NEN", "Ненецкий автономный округ");
        russia.put("RU-SE", "Республика Северная Осетия — Алания");
        russia.put("RU-NVS", "Новосибирская область");
        russia.put("RU-NIZ", "Нижегородская область");
        russia.put("RU-ORE", "Оренбургская область");
        russia.put("RU-ORL", "Орловская область");
        russia.put("RU-OMS", "Омская область");
        russia.put("RU-PER", "Пермский край");
        russia.put("RU-PRI", "Приморский край");
        russia.put("RU-PSK", "Псковская область");
        russia.put("RU-PNZ", "Пензенская область");
        russia.put("RU-ROS", "Ростовская область");
        russia.put("RU-RYA", "Рязанская область");
        russia.put("RU-SAM", "Самарская область");
        russia.put("RU-SA", "Республика Саха (Якутия)");
        russia.put("RU-SAK", "Сахалинская область");
        russia.put("RU-SMO", "Смоленская область");
        russia.put("RU-SPE", "Санкт-Петербург");
        russia.put("RU-SAR", "Саратовская область");
        russia.put("RU-STA", "Ставропольский край");
        russia.put("RU-SVE", "Свердловская область");
        russia.put("RU-TAM", "Тамбовская область");
        russia.put("RU-TOM", "Томская область");
        russia.put("RU-TUL", "Тульская область");
        russia.put("RU-TA", "Республика Татарстан");
        russia.put("RU-TY", "Республика Тыва");
        russia.put("RU-TVE", "Тверская область");
        russia.put("RU-TYU", "Тюменская область");
        russia.put("RU-UD", "Удмуртская Республика");
        russia.put("RU-ULY", "Ульяновская область");
        russia.put("RU-VGG", "Волгоградская область");
        russia.put("RU-VLA", "Владимирская область");
        russia.put("RU-YAN", "Ямало-Ненецкий автономный округ");
        russia.put("RU-VLG", "Вологодская область");
        russia.put("RU-VOR", "Воронежская область");
        russia.put("RU-YAR", "Ярославская область");
        russia.put("RU-YEV", "Еврейская автономная область");
        russia.put("RU-ZAB", "Забайкальский край");
    }

    public void createAfrica(){
        africa.put("AO", "Ангола");
        africa.put("BF", "Буркина-Фасо");
        africa.put("BI", "Бурунди");
        africa.put("BJ", "Бенин");
        africa.put("BW", "Ботсвана");
        africa.put("CD", "Демократическая Республика Конго");
        africa.put("CF", "Центральноафриканская Республика");
        africa.put("CG", "Республика Конго");
        africa.put("CI", "Кот-д’Ивуар");
        africa.put("CM", "Камерун");
        africa.put("DJ", "Джибути");
        africa.put("DZ", "Алжир");
        africa.put("EG", "Египет");
        africa.put("ER", "Эритрея");
        africa.put("ET", "Эфиопия");
        africa.put("GA", "Габон");
        africa.put("GH", "Гана");
        africa.put("GM", "Гамбия");
        africa.put("GN", "Гвинея");
        africa.put("GQ", "Экваториальная Гвинея");
        africa.put("GW", "Гвинея-Бисау");
        africa.put("KE", "Кения");
        africa.put("LR", "Либерия");
        africa.put("LS", "Лесото");
        africa.put("LY", "Ливия");
        africa.put("MA", "Марокко");
        africa.put("MG", "Мадагаскар");
        africa.put("ML", "Мали");
        africa.put("MR", "Мавритания");
        africa.put("MW", "Малави");
        africa.put("MZ", "Мозамбик");
        africa.put("NA", "Намибия");
        africa.put("NE", "Нигер");
        africa.put("NG", "Нигерия");
        africa.put("RW", "Руанда");
        africa.put("SD", "Судан");
        africa.put("SL", "Сьерра-Леоне");
        africa.put("SN", "Сенегал");
        africa.put("SO", "Сомали");
        africa.put("SS", "Южный Судан");
        africa.put("SZ", "Эсватини");
        africa.put("TD", "Чад");
        africa.put("TG", "Того");
        africa.put("TN", "Тунис");
        africa.put("TZ", "Танзания");
        africa.put("UG", "Уганда");
        africa.put("ZA", "Южно-Африканская Республика");
        africa.put("ZM", "Замбия");
        africa.put("ZW", "Зимбабве");
    }

    public void createAsia(){
        asia.put("AE", "ОАЭ");
        asia.put("AF", "Афганистан");
        asia.put("IQ", "Ирак");
        asia.put("IR", "Иран");
        asia.put("IL", "Израиль");
        asia.put("JO", "Иордания");
        asia.put("KW", "Кувейт");
        asia.put("LB", "Ливан");
        asia.put("OM", "Оман");
        asia.put("PS", "Палестина");
        asia.put("QA", "Катар");
        asia.put("SA", "Саудовская Аравия");
        asia.put("SY", "Сирия");
        asia.put("YE", "Йемен");

        // Южная Азия
        asia.put("BD", "Бангладеш");
        asia.put("BT", "Бутан");
        asia.put("IN", "Индия");
        asia.put("LK", "Шри-Ланка");
        //asia.put("MV", "Мальдивы");
        asia.put("NP", "Непал");
        asia.put("PK", "Пакистан");

        // Восточная Азия
        asia.put("CN", "Китай");
        //asia.put("HK", "Гонконг (КНР)");
        asia.put("JP", "Япония");
        asia.put("KP", "КНДР");
        asia.put("KR", "Республика Корея");
        asia.put("MN", "Монголия");
        asia.put("TW", "Тайвань");

        // Юго-Восточная Азия
        asia.put("BN", "Бруней");
        asia.put("ID", "Индонезия");
        asia.put("KH", "Камбоджа");
        asia.put("LA", "Лаос");
        asia.put("MM", "Мьянма");
        asia.put("MY", "Малайзия");
        asia.put("PH", "Филиппины");
        //asia.put("SG", "Сингапур");
        asia.put("TH", "Таиланд");
        asia.put("TL", "Восточный Тимор");
        asia.put("VN", "Вьетнам");

        // Центральная Азия
        asia.put("KZ", "Казахстан");
        asia.put("KG", "Киргизия");
        asia.put("TJ", "Таджикистан");
        asia.put("TM", "Туркменистан");
        asia.put("UZ", "Узбекистан");

        // Россия (азиатская часть)
        asia.put("RU", "Россия");
    }
    
    public void createChina(){
        china.put("CN-34", "Аньхой");
        china.put("CN-35", "Фуцзянь");
        china.put("CN-62", "Ганьсу");
        china.put("CN-44", "Гуандун");
        china.put("CN-52", "Гуйчжоу");
        china.put("CN-46", "Хайнань");
        china.put("CN-13", "Хэбэй");
        china.put("CN-41", "Хэнань");
        china.put("CN-23", "Хэйлунцзян");
        china.put("CN-43", "Хунань");
        china.put("CN-42", "Хубэй");
        china.put("CN-32", "Цзянсу");
        china.put("CN-36", "Цзянси");
        china.put("CN-22", "Цзилинь");
        china.put("CN-21", "Ляонин");
        china.put("CN-63", "Цинхай");
        china.put("CN-61", "Шэньси");
        china.put("CN-37", "Шаньдун");
        china.put("CN-14", "Шаньси");
        china.put("CN-51", "Сычуань");
        china.put("CN-71", "Тайвань (провинция КНР)*");
        china.put("CN-53", "Юньнань");
        china.put("CN-33", "Чжэцзян");
        china.put("CN-YN", "Юньнань (альтернативный код)");
        china.put("CN-ZJ", "Чжэцзян (альтернативный код)");

        // Автономные районы
        china.put("CN-45", "Гуанси-Чжуанский автономный район");
        china.put("CN-15", "Внутренняя Монголия");
        china.put("CN-64", "Нинся-Хуэйский автономный район");
        china.put("CN-65", "Синьцзян-Уйгурский автономный район");
        china.put("CN-54", "Тибетский автономный район");

        // Города центрального подчинения
        china.put("CN-11", "Пекин");
        china.put("CN-50", "Чунцин");
        china.put("CN-31", "Шанхай");
        china.put("CN-12", "Тяньцзинь");

        // Специальные административные регионы
        china.put("CN-91", "Гонконг (Сянган)");
        china.put("CN-92", "Макао (Аомынь)");
    }

    public void createAllGames(){
        allGamesList.put("worldIndiaLow", countryCodes);
        allGamesList.put("belarusLow", belarus);
        allGamesList.put("russiaHigh", russia);
        allGamesList.put("europeLow", europe);
        allGamesList.put("africaLow", africa);
        allGamesList.put("northAmericaLow", northAmerica);
        allGamesList.put("centralAmericaLow", centralAmerica);
        allGamesList.put("latinAmericaLow", latinAmerica);
        allGamesList.put("usaLow", usa);
        allGamesList.put("asiaLow", asia);
        allGamesList.put("chinaLow", china);
    }


}
