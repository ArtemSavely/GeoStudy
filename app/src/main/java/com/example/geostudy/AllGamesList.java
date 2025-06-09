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
    public Map<String, String> australia = new HashMap<>();
    public Map<String, String> bulgaria = new HashMap<>();
    public Map<String, String> czech = new HashMap<>();
    public Map<String, String> denmark = new HashMap<>();
    public Map<String, String> estonia = new HashMap<>();
    public Map<String, String> finland = new HashMap<>();
    public Map<String, String> france = new HashMap<>();
    public Map<String, String> germany = new HashMap<>();
    public Map<String, String> greece = new HashMap<>();
    public Map<String, String> hungary = new HashMap<>();
    public Map<String, String> italy = new HashMap<>();
    public Map<String, String> netherlands = new HashMap<>();
    public Map<String, String> poland = new HashMap<>();
    public Map<String, String> switzerland = new HashMap<>();
    public Map<String, String> uk = new HashMap<>();
    public Map<String, String> argentina = new HashMap<>();
    public Map<String, String> brazil = new HashMap<>();
    public Map<String, String> canada = new HashMap<>();
    public Map<String, String> caribbean = new HashMap<>();
    public Map<String, String> mexico = new HashMap<>();
    public Map<String, String> india = new HashMap<>();
    public Map<String, String> indonesia = new HashMap<>();
    public Map<String, String> japan = new HashMap<>();
    public Map<String, String> southKorea = new HashMap<>();
    public Map<String, String> turkey = new HashMap<>();
    public Map<String, String> uae = new HashMap<>();
    public Map<String, String> oceania = new HashMap<>();
    public Map<String, String> newCaledonia = new HashMap<>();
    public Map<String, String> newZealand = new HashMap<>();
    public Map<String, String> egypt = new HashMap<>();
    public Map<String, String> southAfrica = new HashMap<>();

    public AllGamesList(){}

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
            case "australiaLow":
                createAustralia();
                break;
            case "bulgariaLow":
                createBulgaria();
                break;
            case "czechLow":
                createCzech();
                break;
            case "denmarkLow":
                createDenmark();
                break;
            case "estoniaLow":
                createEstonia();
                break;
            case "finlandLow":
                createFinland();
                break;
            case "franceLow":
                createFrance();
                break;
            case "germanyLow":
                createGermany();
                break;
            case "greeceLow":
                createGreece();
                break;
            case "hungaryLow":
                createHungary();
                break;
            case "italyLow":
                createItaly();
                break;
            case "netherlandsLow":
                createNetherlands();
                break;
            case "polandLow":
                createPoland();
                break;
            case "switzerlandLow":
                createSwitzerland();
                break;
            case "ukLow":
                createUk();
                break;
            case "argentinaLow":
                createArgentina();
                break;
            case "brazilLow":
                createBrazil();
                break;
            case "canadaLow":
                createCanada();
                break;
            case "caribbeanLow":
                createCaribbean();
                break;
            case "mexicoLow":
                createMexico();
                break;
            case "indiaLow":
                createIndia();
                break;
            case "indonesiaHigh":
                createIndonesia();
                break;
            case "japanHigh":
                createJapan();
                break;
            case "southKoreaLow":
                createSouthKorea();
                break;
            case "turkeyLow":
                createTurkey();
                break;
            case "unitedArabEmiratesLow":
                createUAE();
                break;
            case "oceaniaHigh":
                createOceania();
                break;
            case "newCaledoniaLow":
                createNewCaledonia();
                break;
            case "newZealandLow":
                createNewZealand();
                break;
            case "egyptLow":
                createEgypt();
                break;
            case "southAfricaLow":
                createSouthAfrica();
                break;
        }
        createAllGames();
    }

    public void createSouthAfrica(){
        southAfrica.put("LS", "Лесото");
        southAfrica.put("ZA-EC", "Восточно-Капская провинция");
        southAfrica.put("ZA-FS", "Свободное Государство");
        southAfrica.put("ZA-GT", "Гаутенг");
        southAfrica.put("ZA-LP", "Лимпопо");
        southAfrica.put("ZA-MP", "Мпумаланга");
        southAfrica.put("ZA-NC", "Северо-Западная Капская провинция");
        southAfrica.put("ZA-NL", "Квазулу-Натал");
        southAfrica.put("ZA-NW", "Северо-Западная провинция");
        southAfrica.put("ZA-WC", "Западно-Капская провинция");
    }

    public void createEgypt(){
        egypt.put("EG-ASN", "Асьют");
        egypt.put("EG-AST", "Асуан");
        egypt.put("EG-BNS", "Бени-Суэйф");
        egypt.put("EG-FYM", "Файюм");
        egypt.put("EG-KN", "Кена");
        egypt.put("EG-MN", "Эль-Минья");
        egypt.put("EG-LX", "Луксор");
        egypt.put("EG-WAD", "Новая Долина");
        egypt.put("EG-SHG", "Сохаг");
        egypt.put("EG-SUZ", "Суэц");
        egypt.put("EG-ALX", "Александрия");
        egypt.put("EG-DK", "Дакахлия");
        egypt.put("EG-BH", "Бехера");
        egypt.put("EG-GH", "Гарбия");
        egypt.put("EG-KB", "Кальюбия");
        egypt.put("EG-MNF", "Менуфия");
        egypt.put("EG-IS", "Исмаилия");
        egypt.put("EG-SHR", "Шаркия");
        egypt.put("EG-PTS", "Порт-Саид");
        egypt.put("EG-DT", "Думьят");
        egypt.put("EG-GZ", "Гиза");
        egypt.put("EG-HT", "Хелуан");
        egypt.put("EG-JS", "Южный Синай");
        egypt.put("EG-SIN", "Северный Синай");
        egypt.put("EG-BA", "Красное Море");
        egypt.put("EG-C", "Каир");
        egypt.put("EG-KFS", "Кафр-эш-Шейх");
        egypt.put("EG-MT", "Матрух");
        egypt.put("EG-TER", "6 октября");
    }

    public void createNewZealand(){
        newZealand.put("NZ-AUK", "Окленд");
        newZealand.put("NZ-BOP", "Бей-оф-Пленти");
        newZealand.put("NZ-GIS", "Гисборн");
        newZealand.put("NZ-HKB", "Хокс-Бей");
        newZealand.put("NZ-MWT", "Манавату-Уангануи");
        newZealand.put("NZ-NTL", "Нортленд");
        newZealand.put("NZ-TKI", "Таранаки");
        newZealand.put("NZ-WKO", "Уаикато");
        newZealand.put("NZ-WGN", "Веллингтон");
        newZealand.put("NZ-CAN", "Кентербери");
        newZealand.put("NZ-MBH", "Марлборо");
        newZealand.put("NZ-NSN", "Нельсон");
        newZealand.put("NZ-OTA", "Отаго");
        newZealand.put("NZ-STL", "Саутленд");
        newZealand.put("NZ-TAS", "Тасман");
        newZealand.put("NZ-WTC", "Уэст-Кост");
        newZealand.put("NZ-CIT", "Острова Чатем");
    }

    public void createNewCaledonia(){
        newCaledonia.put("NC-NO", "Северная провинция");
        newCaledonia.put("NC-SU", "Южная провинция");
        newCaledonia.put("NC-IL", "Провинция Луайоте");
    }

    public void createOceania(){
//        oceania.put("AS", "Американское Самоа");
        oceania.put("AU", "Австралия");
        oceania.put("BN", "Бруней");
//        oceania.put("CC", "Кокосовые острова");
//        oceania.put("CX", "Остров Рождества");
        oceania.put("FJ", "Фиджи");
//        oceania.put("FM", "Микронезия");
//        oceania.put("GU", "Гуам");
//        oceania.put("HM", "Остров Херд и острова Макдональд");
        oceania.put("ID", "Индонезия");
//        oceania.put("IO", "Британская территория Индийского океана");
        oceania.put("KI", "Кирибати");
//        oceania.put("MH", "Маршалловы острова");
//        oceania.put("MO", "Макао");
        oceania.put("MP", "Северные Марианские острова");
//        oceania.put("MU", "Маврикий");
        oceania.put("NC", "Новая Каледония");
//        oceania.put("NF", "остров Норфолк");
//        oceania.put("NR", "Науру");
//        oceania.put("NU", "Ниуэ");
        oceania.put("NZ", "Новая Зеландия");
        oceania.put("PG", "Папуа — Новая Гвинея");
        oceania.put("PH", "Филиппины");
//        oceania.put("PW", "Палау");
        oceania.put("RE", "Реюньон");
        oceania.put("SB", "Соломоновы острова");
//        oceania.put("SC", "Сейшельские острова");
//        oceania.put("SG", "Сингапур");
        oceania.put("TF", "Французские Южные Территории");
//        oceania.put("TK", "Токелау");
        oceania.put("TL", "Восточный Тимор");
//        oceania.put("TO", "Тонга");
//        oceania.put("TV", "Тувалу");
//        oceania.put("UM-81", "Джонстон Атолл");
//        oceania.put("UM-84", "Мидуэй Атолл");
//        oceania.put("UM-67", "Атолл Бейкер");
//        oceania.put("UM-71", "Атолл Уэйк");
//        oceania.put("UM-79", "Атолл Кингмен Риф");
        oceania.put("VU", "Вануату");
//        oceania.put("WF", "Уоллис и Футуна");
//        oceania.put("WS", "Самоа");
    }

    public void createUAE(){
        uae.put("AE-AJ", "Аджман");
        uae.put("AE-AZ", "Абуль-Кубейс");
        uae.put("AE-DU", "Дубай");
        uae.put("AE-FU", "Фуджейра");
        uae.put("AE-RK", "Рас-эль-Хайма");
        uae.put("AE-SH", "Шарджа");
        uae.put("AE-UQ", "Ум-эль-Кайвайн");
        uae.put("OM-MU", "Мустандер");
        uae.put("AE-NZ1", "Нассибат-Заират-1");
        uae.put("AE-NZ2", "Нассибат-Заират-2");
    }

    public void createTurkey(){
        turkey.put("TR-35", "Измир");
        turkey.put("TR-09", "Айдын");
        turkey.put("TR-20", "Денизли");
        turkey.put("TR-17", "Чанаккале");
        turkey.put("TR-10", "Балыкесир");
        turkey.put("TR-16", "Бурса");
        turkey.put("TR-06", "Анкара");
        turkey.put("TR-03", "Афьонкарахисар");
        turkey.put("TR-07", "Анталья");
        turkey.put("TR-15", "Бурдур");
        turkey.put("TR-33", "Мерсин");
        turkey.put("TR-31", "Хатай");
        turkey.put("TR-32", "Ичель");
        turkey.put("TR-34", "Стамбул");
        turkey.put("TR-41", "Коджаэли");
        turkey.put("TR-54", "Сакарья");
        turkey.put("TR-22", "Эдирне");
        turkey.put("TR-39", "Кыркларели");
        turkey.put("TR-21", "Диярбакыр");
        turkey.put("TR-44", "Малатья");
        turkey.put("TR-58", "Сивас");
        turkey.put("TR-71", "Кырыккале");
        turkey.put("TR-70", "Караман");
        turkey.put("TR-38", "Кайсери");
        turkey.put("TR-69", "Байбурт");
        turkey.put("TR-75", "Ардахан");
        turkey.put("TR-08", "Артвин");
        turkey.put("TR-76", "Игдыр");
        turkey.put("TR-68", "Аксарай");
        turkey.put("TR-74", "Бартын");
        turkey.put("TR-72", "Батман");
        turkey.put("TR-61", "Трабзон");
        turkey.put("TR-60", "Токат");
        turkey.put("TR-59", "Текирдаг");
        turkey.put("TR-57", "Синоп");
        turkey.put("TR-56", "Сиирт");
        turkey.put("TR-55", "Самсун");
        turkey.put("TR-53", "Ризе");
        turkey.put("TR-52", "Орду");
        turkey.put("TR-51", "Нигде");
        turkey.put("TR-50", "Невшехир");
        turkey.put("TR-49", "Муш");
        turkey.put("TR-48", "Мугла");
        turkey.put("TR-47", "Мардин");
        turkey.put("TR-46", "Кахраманмараш");
        turkey.put("TR-45", "Маниса");
        turkey.put("TR-43", "Кютахья");
        turkey.put("TR-42", "Конья");
        turkey.put("TR-40", "Кыршехир");
        turkey.put("TR-37", "Кастамону");
        turkey.put("TR-36", "Карс");
        turkey.put("TR-30", "Хаккяри");
        turkey.put("TR-29", "Гюмюшхане");
        turkey.put("TR-28", "Гиресун");
        turkey.put("TR-27", "Газиантеп");
        turkey.put("TR-26", "Эскишехир");
        turkey.put("TR-25", "Эрзурум");
        turkey.put("TR-24", "Эрзинджан");
        turkey.put("TR-23", "Элязыг");
        turkey.put("TR-19", "Чорум");
        turkey.put("TR-18", "Чанкыры");
        turkey.put("TR-14", "Болу");
        turkey.put("TR-13", "Битлис");
        turkey.put("TR-12", "Бингёль");
        turkey.put("TR-11", "Биледжик");
        turkey.put("TR-05", "Амасья");
        turkey.put("TR-04", "Агры");
        turkey.put("TR-02", "Адыяман");
        turkey.put("TR-01", "Адана");
        turkey.put("TR-63", "Шанлыурфа");
        turkey.put("TR-62", "Тунджели");
        turkey.put("TR-64", "Ушак");
        turkey.put("TR-65", "Ван");
        turkey.put("TR-66", "Йозгат");
        turkey.put("TR-67", "Зонгулдак");
        turkey.put("TR-73", "Ширнак");
        turkey.put("TR-77", "Ялова");
        turkey.put("TR-78", "Карабюк");
        turkey.put("TR-79", "Килис");
        turkey.put("TR-80", "Османие");
        turkey.put("TR-81", "Дюздже");
    }

    public void createSouthKorea(){
        southKorea.put("KR-11", "Сеул");
        southKorea.put("KR-26", "Бучеон");
        southKorea.put("KR-27", "Чеджу");
        southKorea.put("KR-28", "Инчхон");
        southKorea.put("KR-29", "Кванджоу");
        southKorea.put("KR-30", "Соннам");
        southKorea.put("KR-31", "Суон");
        southKorea.put("KR-41", "Кёнгидо");
        southKorea.put("KR-42", "Канвондо");
        southKorea.put("KR-43", "Чхунчхон-Намдо");
        southKorea.put("KR-44", "Чхунчхон-Пукто");
        southKorea.put("KR-45", "Чолла-Намдо");
        southKorea.put("KR-46", "Чолла-Пукто");
        southKorea.put("KR-47", "Кёнсан-Намдо");
        southKorea.put("KR-48", "Кёнсан-Пукто");
        southKorea.put("KR-49", "Дэгу");
        southKorea.put("KR-50", "Тэджон");
    }

    public void createJapan(){
        japan.put("JP-01", "Хоккайдо");
        japan.put("JP-02", "Аомори");
        japan.put("JP-03", "Иватэ");
        japan.put("JP-04", "Мияги");
        japan.put("JP-05", "Акита");
        japan.put("JP-06", "Ямагата");
        japan.put("JP-07", "Фукусима");
        japan.put("JP-08", "Ибараки");
        japan.put("JP-09", "Тотиги");
        japan.put("JP-10", "Гумма");
        japan.put("JP-11", "Сайтама");
        japan.put("JP-12", "Тиба");
        japan.put("JP-13", "Токио");
        japan.put("JP-14", "Канагава");
        japan.put("JP-15", "Ниигата");
        japan.put("JP-16", "Тояма");
        japan.put("JP-17", "Исикава");
        japan.put("JP-18", "Фукуи");
        japan.put("JP-19", "Яманаси");
        japan.put("JP-20", "Нагано");
        japan.put("JP-21", "Гифу");
        japan.put("JP-22", "Сидзуока");
        japan.put("JP-23", "Айти");
        japan.put("JP-24", "Миэ");
        japan.put("JP-25", "Сига");
        japan.put("JP-26", "Киото");
        japan.put("JP-27", "Осака");
        japan.put("JP-28", "Хёго");
        japan.put("JP-29", "Нара");
        japan.put("JP-30", "Вакаяма");
        japan.put("JP-31", "Тоттори");
        japan.put("JP-32", "Симанэ");
        japan.put("JP-33", "Окаяма");
        japan.put("JP-34", "Хиросима");
        japan.put("JP-35", "Ямагути");
        japan.put("JP-36", "Токусима");
        japan.put("JP-37", "Кагава");
        japan.put("JP-38", "Эхимэ");
        japan.put("JP-39", "Коти");
        japan.put("JP-40", "Фукуока");
        japan.put("JP-41", "Сага");
        japan.put("JP-42", "Нагасаки");
        japan.put("JP-43", "Кумамото");
        japan.put("JP-44", "Оита");
        japan.put("JP-45", "Миядзаки");
        japan.put("JP-46", "Кагосима");
        japan.put("JP-47", "Окинава");
    }

    public void createIndonesia(){
        indonesia.put("ID-AC", "Ачех");
        indonesia.put("ID-BA", "Бали");
        indonesia.put("ID-BB", "Банка-Белитунг");
        indonesia.put("ID-BE", "Бенкулу");
        indonesia.put("ID-BT", "Бантен");
        indonesia.put("ID-GO", "Горонтало");
        indonesia.put("ID-JA", "Джамби");
        indonesia.put("ID-JB", "Западная Ява");
        indonesia.put("ID-JI", "Восточная Ява");
        indonesia.put("ID-JK", "Джакарта");
        indonesia.put("ID-JT", "Центральная Ява");
        indonesia.put("ID-KB", "Западный Калимантан");
        indonesia.put("ID-KI", "Восточный Калимантан");
        indonesia.put("ID-KR", "Острова Риау");
        indonesia.put("ID-KS", "Южный Калимантан");
        indonesia.put("ID-KT", "Центральный Калимантан");
        indonesia.put("ID-KU", "Северный Калимантан");
        indonesia.put("ID-LA", "Лампунг");
        indonesia.put("ID-MA", "Молуккские острова");
        indonesia.put("ID-MU", "Северное Малуку");
        indonesia.put("ID-NB", "Западные Малые Зондские острова");
        indonesia.put("ID-NT", "Восточные Малые Зондские острова");
        indonesia.put("ID-PA", "Папуа");
        indonesia.put("ID-PB", "Западное Папуа");
        indonesia.put("ID-RI", "Риау");
        indonesia.put("ID-SA", "Северный Сулавеси");
        indonesia.put("ID-SB", "Западный Суматра");
        indonesia.put("ID-SG", "Юго-Восточный Сулавеси");
        indonesia.put("ID-SN", "Южный Сулавеси");
        indonesia.put("ID-SR", "Западный Сулавеси");
        indonesia.put("ID-SS", "Южная Суматра");
        indonesia.put("ID-ST", "Центральный Сулавеси");
        indonesia.put("ID-SU", "Северная Суматра");
        indonesia.put("ID-YO", "Джокьякарта");
        indonesia.put("TL", "Восточный Тимор");
        indonesia.put("MY-12", "Саравак (Малайзия)");
        indonesia.put("MY-13", "Сабах (Малайзия)");
        indonesia.put("BN", "Бруней");
    }

    public void createIndia(){
        india.put("IN-AN", "Андаманские и Никобарские острова");
        india.put("IN-AP", "Андхра-Прадеш");
        india.put("IN-AR", "Аруначал-Прадеш");
        india.put("IN-AS", "Ассам");
        india.put("IN-BR", "Бихар");
        india.put("IN-CH", "Чандигарх");
        india.put("IN-CT", "Чхаттисгарх");
        india.put("IN-DD", "Дадра и Нагар-Хавели и Даман и Диу");
        india.put("IN-DL", "Делийский национальный столичный округ");
        india.put("IN-DN", "Дадра и Нагар Хавели");
        india.put("IN-GA", "Гоа");
        india.put("IN-GJ", "Гуджарат");
        india.put("IN-HP", "Химачал-Прадеш");
        india.put("IN-HR", "Харьяна");
        india.put("IN-JH", "Джаркханд");
        india.put("IN-LK", "Лакшадвип");
        india.put("IN-KA", "Карнатака");
        india.put("IN-KL", "Керала");
        india.put("IN-LD", "Ладакх");
        india.put("IN-MH", "Махараштра");
        india.put("IN-ML", "Мегхалая");
        india.put("IN-MN", "Манипур");
        india.put("IN-MP", "Мадхья-Прадеш");
        india.put("IN-MZ", "Мизорам");
        india.put("IN-NL", "Нагаленд");
        india.put("IN-OR", "Одиша");
        india.put("IN-PB", "Пенджаб");
        india.put("IN-PY", "Пудучерри");
        india.put("IN-RJ", "Раджастхан");
        india.put("IN-SK", "Сикким");
        india.put("IN-TG", "Телангана");
        india.put("IN-TN", "Тамилнад");
        india.put("IN-TR", "Трипура");
        india.put("IN-UP", "Уттар-Прадеш");
        india.put("IN-UT", "Уттаракханд");
        india.put("IN-WB", "Западная Бенгалия");
        india.put("IN-JK", "Джамму и Кашмир");
    }

    public void createMexico(){
        mexico.put("MX-AGU", "Агуаскальентес");
        mexico.put("MX-BCN", "Нижняя Калифорния");
        mexico.put("MX-BCS", "Южная Нижняя Калифорния");
        mexico.put("MX-CAM", "Кампече");
        mexico.put("MX-CHP", "Чьяпас");
        mexico.put("MX-CHH", "Чиуауа");
        mexico.put("MX-COA", "Коауила");
        mexico.put("MX-COL", "Колима");
        mexico.put("MX-DIF", "Федеральный округ (Мехико)");
        mexico.put("MX-DUR", "Дуранго");
        mexico.put("MX-GUA", "Гуанахуато");
        mexico.put("MX-GRO", "Герреро");
        mexico.put("MX-HID", "Идальго");
        mexico.put("MX-JAL", "Халиско");
        mexico.put("MX-MEX", "Мехико");
        mexico.put("MX-MIC", "Мичоакан");
        mexico.put("MX-MOR", "Морелос");
        mexico.put("MX-NAY", "Наярит");
        mexico.put("MX-NLE", "Нуэво-Леон");
        mexico.put("MX-OAX", "Оахака");
        mexico.put("MX-PUE", "Пуэбла");
        mexico.put("MX-QUE", "Керетаро");
        mexico.put("MX-ROO", "Кинтана-Роо");
        mexico.put("MX-SLP", "Сан-Луис-Потоси");
        mexico.put("MX-SIN", "Синалоа");
        mexico.put("MX-SON", "Сонора");
        mexico.put("MX-TAB", "Табаско");
        mexico.put("MX-TAM", "Тамаулипас");
        mexico.put("MX-TLA", "Тласкала");
        mexico.put("MX-VER", "Веракрус");
        mexico.put("MX-YUC", "Юкатан");
        mexico.put("MX-ZAC", "Сакатекас");
    }

    public void createCaribbean(){
        caribbean.put("AG", "Антигуа и Барбуда");
        caribbean.put("BS", "Багамские Острова");
        caribbean.put("BB", "Барбадос");
        caribbean.put("CU", "Куба");
        caribbean.put("DM", "Доминика");
        caribbean.put("DO", "Доминиканская Республика");
        caribbean.put("GD", "Гренада");
        caribbean.put("HT", "Гаити");
        caribbean.put("JM", "Ямайка");
        caribbean.put("KN", "Сент-Китс и Невис");
        caribbean.put("LC", "Сент-Люсия");
        caribbean.put("TT", "Тринидад и Тобаго");
        caribbean.put("VC", "Сент-Винсент и Гренадины");
        caribbean.put("AI", "Ангилья (Великобритания)");
        caribbean.put("AW", "Аруба (Нидерланды)");
        caribbean.put("BL", "Сен-Бартелеми (Франция)");
        caribbean.put("BQ", "Карибские Нидерланды");
        caribbean.put("CW", "Кюрасао (Нидерланды)");
        caribbean.put("GP", "Гваделупа (Франция)");
        caribbean.put("KY", "Каймановы Острова (Великобритания)");
        caribbean.put("MF", "Сен-Мартен (Франция)");
        caribbean.put("MQ", "Мартиника (Франция)");
        caribbean.put("MS", "Монтсеррат (Великобритания)");
        caribbean.put("PR", "Пуэрто-Рико (США)");
        caribbean.put("SX", "Синт-Мартен (Нидерланды)");
        caribbean.put("TC", "Острова Тёркс и Кайкос (Великобритания)");
        caribbean.put("VG", "Виргинские Острова (Великобритания)");
        caribbean.put("VI", "Виргинские Острова (США)");
    }

    public void createCanada(){
        canada.put("CA-AB", "Альберта");
        canada.put("CA-BC", "Британская Колумбия");
        canada.put("CA-MB", "Манитоба");
        canada.put("CA-NB", "Нью-Брансуик");
        canada.put("CA-NL", "Ньюфаундленд и Лабрадор");
        canada.put("CA-NS", "Новая Шотландия");
        canada.put("CA-ON", "Онтарио");
        canada.put("CA-PE", "Остров Принца Эдуарда");
        canada.put("CA-QC", "Квебек");
        canada.put("CA-SK", "Саскачеван");
        canada.put("CA-NT", "Северо-Западные территории");
        canada.put("CA-NU", "Нунавут");
        canada.put("CA-YT", "Юкон");
    }

    public void createBrazil(){
        brazil.put("BR-AC", "Акри");
        brazil.put("BR-AL", "Алагоас");
        brazil.put("BR-AM", "Амазонас");
        brazil.put("BR-AP", "Амапа");
        brazil.put("BR-BA", "Баия");
        brazil.put("BR-CE", "Сеара");
        brazil.put("BR-DF", "Федеральный округ");
        brazil.put("BR-ES", "Эспириту-Санту");
        brazil.put("BR-GO", "Гояс");
        brazil.put("BR-MA", "Мараньян");
        brazil.put("BR-MG", "Минас-Жерайс");
        brazil.put("BR-MS", "Мату-Гросу-ду-Сул");
        brazil.put("BR-MT", "Мату-Гросу");
        brazil.put("BR-PA", "Пара");
        brazil.put("BR-PB", "Параиба");
        brazil.put("BR-PE", "Пернамбуку");
        brazil.put("BR-PI", "Пиауи");
        brazil.put("BR-PR", "Парана");
        brazil.put("BR-RJ", "Рио-де-Жанейро");
        brazil.put("BR-RN", "Риу-Гранди-ду-Норти");
        brazil.put("BR-RO", "Рондония");
        brazil.put("BR-RR", "Рорайма");
        brazil.put("BR-RS", "Риу-Гранди-ду-Сул");
        brazil.put("BR-SC", "Санта-Катарина");
        brazil.put("BR-SE", "Сержипи");
        brazil.put("BR-SP", "Сан-Паулу");
        brazil.put("BR-TO", "Токантинс");
    }

    public void createArgentina(){
        argentina.put("AR-B", "Буэнос-Айрес");
        argentina.put("AR-K", "Катамарка");
        argentina.put("AR-H", "Чако");
        argentina.put("AR-U", "Чубут");
        argentina.put("AR-C", "Сьюдад-де-Буэнос-Айрес");
        argentina.put("AR-X", "Кордова");
        argentina.put("AR-W", "Корриентес");
        argentina.put("AR-E", "Энтре-Риос");
        argentina.put("AR-P", "Формоса");
        argentina.put("AR-Y", "Жужуй");
        argentina.put("AR-L", "Ла-Пампа");
        argentina.put("AR-F", "Ла-Риоха");
        argentina.put("AR-M", "Мендоса");
        argentina.put("AR-N", "Мисьонес");
        argentina.put("AR-Q", "Неукен");
        argentina.put("AR-R", "Рио-Негро");
        argentina.put("AR-A", "Сальта");
        argentina.put("AR-Z", "Санта-Крус");
        argentina.put("AR-G", "Сантьяго-дель-Эстеро");
        argentina.put("AR-S", "Санта-Фе");
        argentina.put("AR-J", "Сан-Хуан");
        argentina.put("AR-D", "Сан-Луис");
        argentina.put("AR-V", "Тьерра-дель-Фуэго");
        argentina.put("AR-T", "Тукуман");
    }

    public void createUk(){
        uk.put("GB-BD", "Бедфордшир");
        uk.put("GB-BK", "Беркшир");
        uk.put("GB-BU", "Бэкингемшир");
        uk.put("GB-CH", "Чешир");
        uk.put("GB-CM", "Камбриджшир");
        uk.put("GB-CO", "Корнуолл");
        uk.put("GB-CU", "Камбрия");
        uk.put("GB-DB", "Дербишир");
        uk.put("GB-DH", "Дарэм");
        uk.put("GB-DS", "Дорсет");
        uk.put("GB-DV", "Девон");
        uk.put("GB-EX", "Эссекс");
        uk.put("GB-GC", "Глостершир");
        uk.put("GB-GL", "Большой Лондон");
        uk.put("GB-HA", "Хэмпшир");
        uk.put("GB-HD", "Хартфордшир");
        uk.put("GB-HT", "Херефордшир");
        uk.put("GB-KE", "Кент");
        uk.put("GB-LA", "Ланкашир");
        uk.put("GB-LE", "Лестершир");
        uk.put("GB-LI", "Линкольншир");
        uk.put("GB-NA", "Нортгемптоншир");
        uk.put("GB-NB", "Нортумберленд");
        uk.put("GB-NF", "Норфолк");
        uk.put("GB-NI", "Северный Йоркшир");
        uk.put("GB-NT", "Ноттингемшир");
        uk.put("GB-OX", "Оксфордшир");
        uk.put("GB-RT", "Ратленд");
        uk.put("GB-SC", "Стаффордшир");
        uk.put("GB-SF", "Саффолк");
        uk.put("GB-SM", "Сомерсет");
        uk.put("GB-SP", "Шропшир");
        uk.put("GB-SR", "Суррей");
        uk.put("GB-ST", "Восточный Суссекс");
        uk.put("GB-SX", "Западный Суссекс");
        uk.put("GB-WA", "Уорикшир");
        uk.put("GB-WL", "Уилтшир");
        uk.put("GB-WO", "Вустершир");
        uk.put("GB-WR", "Йоркшир");
        uk.put("GB-YK", "Восточный райдинг Йоркшира");
        uk.put("IE", "Ирландия");
    }

    public void createSwitzerland(){
        switzerland.put("CH-AG", "Аргау");
        switzerland.put("CH-AI", "Аппенцелль-Иннерроден");
        switzerland.put("CH-AR", "Аппенцелль-Ауссерроден");
        switzerland.put("CH-BE", "Берн");
        switzerland.put("CH-BL", "Базель-Ланд");
        switzerland.put("CH-BS", "Базель-Штадт");
        switzerland.put("CH-FR", "Фрибур");
        switzerland.put("CH-GE", "Женева");
        switzerland.put("CH-GL", "Гларус");
        switzerland.put("CH-GR", "Граубюнден");
        switzerland.put("CH-JU", "Юра");
        switzerland.put("CH-LU", "Люцерн");
        switzerland.put("CH-NE", "Невшатель");
        switzerland.put("CH-NW", "Нидвальден");
        switzerland.put("CH-OW", "Обвальден");
        switzerland.put("CH-SG", "Санкт-Галлен");
        switzerland.put("CH-SH", "Шаффхаузен");
        switzerland.put("CH-SO", "Золотурн");
        switzerland.put("CH-SZ", "Швиц");
        switzerland.put("CH-TG", "Тургау");
        switzerland.put("CH-TI", "Тичино");
        switzerland.put("CH-UR", "Ури");
        switzerland.put("CH-VD", "Во");
        switzerland.put("CH-VS", "Вале");
        switzerland.put("CH-ZG", "Цуг");
        switzerland.put("CH-ZH", "Цюрих");
    }

    public void createPoland(){
        poland.put("PL-DS", "Нижнесилезское");
        poland.put("PL-KP", "Куявско-Поморское");
        poland.put("PL-LD", "Лодзинское");
        poland.put("PL-LU", "Люблинское");
        poland.put("PL-LB", "Любушское");
        poland.put("PL-MA", "Малопольское");
        poland.put("PL-MZ", "Мазовецкое");
        poland.put("PL-OP", "Опольское");
        poland.put("PL-PK", "Подкарпатское");
        poland.put("PL-PD", "Подляское");
        poland.put("PL-PM", "Поморское");
        poland.put("PL-SL", "Силезское");
        poland.put("PL-SK", "Свентокшиское");
        poland.put("PL-WN", "Варминьско-Мазурское");
        poland.put("PL-WP", "Великопольское");
        poland.put("PL-ZP", "Западно-Поморское");
    }

    public void createNetherlands(){
        netherlands.put("NL-DR", "Дренте");
        netherlands.put("NL-FL", "Флеволанд");
        netherlands.put("NL-FR", "Фрисландия");
        netherlands.put("NL-GE", "Гелдерланд");
        netherlands.put("NL-GR", "Гронинген");
        netherlands.put("NL-LI", "Лимбург");
        netherlands.put("NL-NB", "Северный Брабант");
        netherlands.put("NL-NH", "Северная Голландия");
        netherlands.put("NL-OV", "Оверэйссел");
        netherlands.put("NL-UT", "Утрехт");
        netherlands.put("NL-ZE", "Зеландия");
        netherlands.put("NL-ZH", "Южная Голландия");
    }

    public void createItaly(){
        italy.put("IT-65", "Абруццо");
        italy.put("IT-77", "Базиликата");
        italy.put("IT-78", "Калабрия");
        italy.put("IT-72", "Кампания");
        italy.put("IT-45", "Эмилия-Романья");
        italy.put("IT-36", "Фриули-Венеция-Джулия");
        italy.put("IT-62", "Лацио");
        italy.put("IT-42", "Лигурия");
        italy.put("IT-25", "Ломбардия");
        italy.put("IT-57", "Марке");
        italy.put("IT-67", "Молизе");
        italy.put("IT-21", "Пьемонт");
        italy.put("IT-75", "Апулия");
        italy.put("IT-88", "Сардиния");
        italy.put("IT-82", "Сицилия");
        italy.put("IT-52", "Тоскана");
        italy.put("IT-32", "Трентино-Альто-Адидже");
        italy.put("IT-55", "Умбрия");
        italy.put("IT-23", "Валле-д'Аоста");
        italy.put("IT-34", "Венето");
    }

    public void createHungary(){
        hungary.put("HU-BK", "Бач-Кишкун");
        hungary.put("HU-BA", "Баранья");
        hungary.put("HU-BE", "Бекеш");
        hungary.put("HU-BC", "Бекешчаба");
        hungary.put("HU-BZ", "Боршод-Абауй-Земплен");
        hungary.put("HU-BU", "Будапешт");
        hungary.put("HU-CS", "Чонград-Чанад");
        hungary.put("HU-DE", "Дебрецен");
        hungary.put("HU-DU", "Дунауйварош");
        hungary.put("HU-EG", "Эгер");
        hungary.put("HU-FE", "Фейер");
        hungary.put("HU-GY", "Дьёр");
        hungary.put("HU-GS", "Дьёр-Мошон-Шопрон");
        hungary.put("HU-HB", "Хайду-Бихар");
        hungary.put("HU-HE", "Хевеш");
        hungary.put("HU-HV", "Ходмезёвашархей");
        hungary.put("HU-JN", "Яс-Надькун-Сольнок");
        hungary.put("HU-KV", "Капошвар");
        hungary.put("HU-KM", "Кечкемет");
        hungary.put("HU-KE", "Комаром-Эстергом");
        hungary.put("HU-MI", "Мишкольц");
        hungary.put("HU-NK", "Надьканижа");
        hungary.put("HU-NO", "Ноград");
        hungary.put("HU-NY", "Ньиредьхаза");
        hungary.put("HU-PS", "Печ");
        hungary.put("HU-PE", "Пешт");
        hungary.put("HU-SO", "Шомодь");
        hungary.put("HU-SN", "Шопрон");
        hungary.put("HU-SZ", "Сабольч-Сатмар-Берег");
        hungary.put("HU-SD", "Сегед");
        hungary.put("HU-SF", "Секешфехервар");
        hungary.put("HU-SK", "Сольнок");
        hungary.put("HU-SH", "Сомбатхей");
        hungary.put("HU-TB", "Татабанья");
        hungary.put("HU-TO", "Тольна");
        hungary.put("HU-VA", "Ваш");
        hungary.put("HU-VE", "Веспрем (медье)");
        hungary.put("HU-VM", "Веспрем (город)");
        hungary.put("HU-ZA", "Зала");
        hungary.put("HU-ZE", "Залаэгерсег");
    }

    public void createGreece(){
        greece.put("GR-A", "Аттика");
        greece.put("GR-B", "Центральная Греция");
        greece.put("GR-C", "Центральная Македония");
        greece.put("GR-D", "Крит");
        greece.put("GR-E", "Македония и Фракия");
        greece.put("GR-F", "Эпир");
        greece.put("GR-G", "Ионические острова");
        greece.put("GR-H", "Северные Эгейские острова");
        greece.put("GR-I", "Пелопоннес");
        greece.put("GR-J", "Южные Эгейские острова");
        greece.put("GR-K", "Фессалия");
        greece.put("GR-L", "Западная Греция");
        greece.put("GR-M", "Западная Македония");
        greece.put("GR-69", "Афон");
    }

    public void createGermany(){
        germany.put("DE-BW", "Баден-Вюртемберг");
        germany.put("DE-BY", "Бавария");
        germany.put("DE-BE", "Берлин");
        germany.put("DE-BB", "Бранденбург");
        germany.put("DE-HB", "Бремен");
        germany.put("DE-HH", "Гамбург");
        germany.put("DE-HE", "Гессен");
        germany.put("DE-MV", "Мекленбург — Передняя Померания");
        germany.put("DE-NI", "Нижняя Саксония");
        germany.put("DE-NW", "Северный Рейн-Вестфалия");
        germany.put("DE-RP", "Рейнланд-Пфальц");
        germany.put("DE-SL", "Саар");
        germany.put("DE-SN", "Саксония");
        germany.put("DE-ST", "Саксония-Анхальт");
        germany.put("DE-SH", "Шлезвиг-Гольштейн");
        germany.put("DE-TH", "Тюрингия");
    }

    public void createFrance(){
        france.put("FR-ARA", "Овернь — Рона — Альпы");
        france.put("FR-BFC", "Бургундия — Франш-Конте");
        france.put("FR-BRE", "Бретань");
        france.put("FR-CVL", "Центр — Долина Луары");
        france.put("FR-COR", "Корсика");
        france.put("FR-GES", "Гранд-Эст");
        france.put("FR-HDF", "О-де-Франс");
        france.put("FR-IDF", "Иль-де-Франс");
        france.put("FR-NOR", "Нормандия");
        france.put("FR-NAQ", "Новая Аквитания");
        france.put("FR-OCC", "Окситания");
        france.put("FR-PDL", "Пеи-де-ла-Луар");
        france.put("FR-PAC", "Прованс — Альпы — Лазурный Берег");
    }

    public void createFinland(){
        finland.put("FI-01", "Аландские острова");
        finland.put("FI-02", "Южная Карелия");
        finland.put("FI-03", "Южная Похьянмаа");
        finland.put("FI-04", "Южная Савония");
        finland.put("FI-05", "Канта-Хяме");
        finland.put("FI-06", "Кайнуу");
        finland.put("FI-07", "Кюменлааксо");
        finland.put("FI-08", "Лапландия");
        finland.put("FI-09", "Пирканмаа");
        finland.put("FI-10", "Похьянмаа");
        finland.put("FI-11", "Пяйят-Хяме");
        finland.put("FI-12", "Сатакунта");
        finland.put("FI-13", "Северная Карелия");
        finland.put("FI-14", "Северная Похьянмаа");
        finland.put("FI-15", "Северная Савония");
        finland.put("FI-16", "Уусимаа");
        finland.put("FI-17", "Центральная Похьянмаа");
        finland.put("FI-18", "Центральная Финляндия");
        finland.put("FI-19", "Варсинайс-Суоми");
    }

    public void createEstonia(){
        estonia.put("EE-37", "Харьюмаа");
        estonia.put("EE-39", "Хийумаа");
        estonia.put("EE-44", "Ида-Вирумаа");
        estonia.put("EE-49", "Йыгевамаа");
        estonia.put("EE-51", "Ярвамаа");
        estonia.put("EE-57", "Ляэне-Вирумаа");
        estonia.put("EE-59", "Ляэнемаа");
        estonia.put("EE-65", "Пылвамаа");
        estonia.put("EE-67", "Пярнумаа");
        estonia.put("EE-70", "Рапламаа");
        estonia.put("EE-74", "Сааремаа");
        estonia.put("EE-78", "Тартумаа");
        estonia.put("EE-82", "Валгамаа");
        estonia.put("EE-84", "Вильяндимаа");
        estonia.put("EE-86", "Вырумаа");
    }

    public void createDenmark(){
        denmark.put("DK-84", "Столичный регион");
        denmark.put("DK-82", "Центральная Ютландия");
        denmark.put("DK-81", "Северная Ютландия");
        denmark.put("DK-85", "Зеландия");
        denmark.put("DK-83", "Южная Дания");
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
//        countryCodes.put("SJ", "Шпицберген и Ян-Майен");
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
        latinAmerica.put("BZ", "Белиз");
        latinAmerica.put("CR", "Коста-Рика");
        latinAmerica.put("GT", "Гватемала");
        latinAmerica.put("HN", "Гондурас");
        latinAmerica.put("MX", "Мексика");
        latinAmerica.put("NI", "Никарагуа");
        latinAmerica.put("PA", "Панама");
        latinAmerica.put("SV", "Сальвадор");
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
        europe.put("IS", "Исландия");
        europe.put("IE", "Ирландия");
        europe.put("HU", "Венгрия");
        europe.put("HR", "Хорватия");
        europe.put("GR", "Греция");
        europe.put("GE", "Грузия");
        europe.put("FR", "Франция");
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
        europe.put("AL", "Албания");
        europe.put("IT", "Италия");
        europe.put("KZ", "Казахстан");
        europe.put("AD", "Андорра");
    }

    public void createBulgaria(){
        bulgaria.put("BG-01", "Благоевград");
        bulgaria.put("BG-02", "Бургас");
        bulgaria.put("BG-03", "Варна");
        bulgaria.put("BG-04", "Велико-Тырново");
        bulgaria.put("BG-05", "Видин");
        bulgaria.put("BG-06", "Враца");
        bulgaria.put("BG-07", "Габрово");
        bulgaria.put("BG-08", "Добрич");
        bulgaria.put("BG-09", "Кырджали");
        bulgaria.put("BG-10", "Кюстендил");
        bulgaria.put("BG-11", "Ловеч");
        bulgaria.put("BG-12", "Монтана");
        bulgaria.put("BG-13", "Пазарджик");
        bulgaria.put("BG-14", "Перник");
        bulgaria.put("BG-15", "Плевен");
        bulgaria.put("BG-16", "Пловдив");
        bulgaria.put("BG-17", "Разград");
        bulgaria.put("BG-18", "Русе");
        bulgaria.put("BG-19", "Силистра");
        bulgaria.put("BG-20", "Сливен");
        bulgaria.put("BG-21", "Смолян");
        bulgaria.put("BG-22", "София-град");
        bulgaria.put("BG-23", "София");
        bulgaria.put("BG-24", "Стара-Загора");
        bulgaria.put("BG-25", "Тырговиште");
        bulgaria.put("BG-26", "Хасково");
        bulgaria.put("BG-27", "Шумен");
        bulgaria.put("BG-28", "Ямбол");
    }

    public void createCzech(){
        czech.put("CZ-JC", "Южночешский край");
        czech.put("CZ-JM", "Южноморавский край");
        czech.put("CZ-KA", "Карловарский край");
        czech.put("CZ-KR", "Краловеградецкий край");
        czech.put("CZ-LI", "Либерецкий край");
        czech.put("CZ-MO", "Моравскосилезский край");
        czech.put("CZ-OL", "Оломоуцкий край");
        czech.put("CZ-PA", "Пардубицкий край");
        czech.put("CZ-PL", "Пльзеньский край");
        czech.put("CZ-PR", "Прага");
        czech.put("CZ-ST", "Среднечешский край");
        czech.put("CZ-US", "Устецкий край");
        czech.put("CZ-VY", "Высочина");
        czech.put("CZ-ZL", "Злинский край");
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
        russia.put("RU-LUG", "Луганская Народная Республика");
        russia.put("RU-DON", "Донецкая Народная Республика");
        russia.put("RU-ZP", "Запорожская область");
        russia.put("RU-HR", "Херсонская область");
        russia.put("RU-CR", "Республика Крым");
        russia.put("RU-SEV", "Севастополь");
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
        asia.put("BD", "Бангладеш");
        asia.put("BT", "Бутан");
        asia.put("IN", "Индия");
        asia.put("LK", "Шри-Ланка");
        asia.put("NP", "Непал");
        asia.put("PK", "Пакистан");
        asia.put("CN", "Китай");
        asia.put("JP", "Япония");
        asia.put("KP", "КНДР");
        asia.put("KR", "Республика Корея");
        asia.put("MN", "Монголия");
        asia.put("TW", "Тайвань");
        asia.put("BN", "Бруней");
        asia.put("ID", "Индонезия");
        asia.put("KH", "Камбоджа");
        asia.put("LA", "Лаос");
        asia.put("MM", "Мьянма");
        asia.put("MY", "Малайзия");
        asia.put("PH", "Филиппины");
        asia.put("TH", "Таиланд");
        asia.put("TL", "Восточный Тимор");
        asia.put("VN", "Вьетнам");
        asia.put("KZ", "Казахстан");
        asia.put("KG", "Киргизия");
        asia.put("TJ", "Таджикистан");
        asia.put("TM", "Туркменистан");
        asia.put("UZ", "Узбекистан");
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
        china.put("CN-71", "Тайвань");
        china.put("CN-53", "Юньнань");
        china.put("CN-33", "Чжэцзян");
        china.put("CN-45", "Гуанси-Чжуанский автономный район");
        china.put("CN-15", "Внутренняя Монголия");
        china.put("CN-64", "Нинся-Хуэйский автономный район");
        china.put("CN-65", "Синьцзян-Уйгурский автономный район");
        china.put("CN-54", "Тибетский автономный район");
        china.put("CN-11", "Пекин");
        china.put("CN-50", "Чунцин");
        china.put("CN-31", "Шанхай");
        china.put("CN-12", "Тяньцзинь");
        china.put("CN-91", "Гонконг (Сянган)");
    }

    public void createAustralia(){
        australia.put("AU-NT", "Северная территория");
        australia.put("AU-WA", "Западная Австралия");
        australia.put("AU-ACT", "Австралийская столичная территория");
        australia.put("AU-NSW", "Новый Южный Уэльс");
        australia.put("AU-SA", "Южная Австралия");
        australia.put("AU-VIC", "Виктория");
        australia.put("AU-QLD", "Квинсленд");
        australia.put("AU-TAS", "Тасмания");
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
        allGamesList.put("australiaLow", australia);
        allGamesList.put("bulgariaLow", bulgaria);
        allGamesList.put("czechLow", czech);
        allGamesList.put("denmarkLow", denmark);
        allGamesList.put("estoniaLow", estonia);
        allGamesList.put("finlandLow", finland);
        allGamesList.put("franceLow", france);
        allGamesList.put("germanyLow", germany);
        allGamesList.put("greeceLow", greece);
        allGamesList.put("hungaryLow", hungary);
        allGamesList.put("italyLow", italy);
        allGamesList.put("netherlandsLow", netherlands);
        allGamesList.put("polandLow", poland);
        allGamesList.put("switzerlandLow", switzerland);
        allGamesList.put("ukLow", uk);
        allGamesList.put("argentinaLow", argentina);
        allGamesList.put("brazilLow", brazil);
        allGamesList.put("canadaLow", canada);
        allGamesList.put("caribbeanLow", caribbean);
        allGamesList.put("mexicoLow", mexico);
        allGamesList.put("indiaLow", india);
        allGamesList.put("indonesiaHigh", indonesia);
        allGamesList.put("japanHigh", japan);
        allGamesList.put("southKoreaLow", southKorea);
        allGamesList.put("turkeyLow", turkey);
        allGamesList.put("unitedArabEmiratesLow", uae);
        allGamesList.put("oceaniaHigh", oceania);
        allGamesList.put("newCaledoniaLow", newCaledonia);
        allGamesList.put("newZealandLow", newZealand);
        allGamesList.put("egyptLow", egypt);
        allGamesList.put("southAfricaLow", southAfrica);
    }


}
