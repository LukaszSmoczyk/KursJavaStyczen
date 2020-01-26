package zadanie_kwaczka.metoda;

import zadanie_kwaczka.Kwaczka;
import zadanie_kwaczka.ZliczanieKwaczekDekorator;
import zadanie_kwaczka.typyKaczek.DomowaKaczka;
import zadanie_kwaczka.typyKaczek.DzikaKaczka;
import zadanie_kwaczka.typyKaczek.KaczyWabik;

public class GeneratorKaczek {
    public Kwaczka utworz (String typ) {
        if (typ.equals("DZIKA")) {
            return new ZliczanieKwaczekDekorator( new DzikaKaczka());
        } else if (typ.equals("DOMOWA")) {
            return new ZliczanieKwaczekDekorator(new DomowaKaczka());
        } else if (typ.equals("WABIK")) {
            return new ZliczanieKwaczekDekorator(new KaczyWabik());
        }
        return null;
    }
}
