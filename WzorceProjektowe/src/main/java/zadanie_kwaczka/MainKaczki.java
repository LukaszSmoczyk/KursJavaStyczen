package zadanie_kwaczka;

import zadanie_kwaczka.metoda.GeneratorKaczek;
import zadanie_kwaczka.typyKaczek.DomowaKaczka;
import zadanie_kwaczka.typyKaczek.DzikaKaczka;
import zadanie_kwaczka.typyKaczek.KaczyWabik;

public class MainKaczki {
    public static void main(String[] args) {
        GeneratorKaczek generatorKaczek = new GeneratorKaczek();
        Kwaczka dzikaKaczka = generatorKaczek.utworz("DZIKA");
        Kwaczka domowaKaczka = generatorKaczek.utworz("DOMOWA");
        Kwaczka kaczyWabik = generatorKaczek.utworz("WABIK");
        Kwaczka ges = new ZliczanieKwaczekDekorator(new AdapterGes(new Ges()));

        dzikaKaczka.kwacz();
        domowaKaczka.kwacz();
        kaczyWabik.kwacz();
        ges.kwacz();

    }
}
