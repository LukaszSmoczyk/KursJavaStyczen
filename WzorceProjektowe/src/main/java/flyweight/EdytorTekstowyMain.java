package flyweight;

public class EdytorTekstowyMain {
    public static void main(String[] args) {
        MenadzerZnakow menadzerZnakow = new MenadzerZnakow();
        int wielkosc = 12;
        String color = "BLACK";
        String czcionka = "ARIAL";

        String tytul = "Pan Tadeusz (fragmenty poematu)";

        menadzerZnakow.dodajTekst(tytul, color, wielkosc, czcionka);

        wielkosc = 12;
        czcionka = "Times New Roman";

        String tekst = "Sam pan Tadeusz został w armii adiutantem,\n" +
                "Regent — pisarzem, Sędzia — zboża liwerantem,\n" +
                "Hrabia dowodzi nowych ułanów szwadronem;\n" +
                "Wszystko się pociągnęło za Napoleonem,\n" +
                "Poszło w marsz... W domu smętne wzdychają małżonki\n" +
                "Pani Tadeuszowa odmawia koronki,\n" +
                "Nowenny; Telimena klnie domową ciszę,\n" +
                "Smętek mgieł — patrzy w okna, wzdycha, listy pisze\n" +
                "Albo z książką francuską idzie w szary kątek\n" +
                "Pod piec — i tonie w smętnych bałwanach pamiątek.\n" +
                "Wojski także — niezdolny do rycerskich czynów —\n" +
                "Został, dogląda w domu kobiet... i kominów.\n" +
                "Tymczasem nadchodziła ta okropna zima —\n" +
                "Twarda, groźna, iskrząca się komet oczyma,\n" +
                "Którą w Litwie przeczuwał wcześnie naród cały;\n" +
                "Niebo bladło, szron iskrzył, gwiazdy czerwieniały,\n" +
                "Miesięczne tęcze całe stawały w kolorach,\n" +
                "Mroźne kameleony przy chatach, oborach.";
        menadzerZnakow.dodajTekst(tekst, color, wielkosc, czcionka);

        ///////////////////////////////////
        // SPRAWDZAMY
        int iloscObiektowNomralnie = tytul.length() + tekst.length();
        int iloscObiektowFlyweight = menadzerZnakow.wielkoscBazy();

        System.out.println("Ilość obiektów normalnie: " + iloscObiektowNomralnie);
        System.out.println("Ilość obiektów flyweight: " + iloscObiektowFlyweight);

        menadzerZnakow.wypiszKlucze();

    }
}
