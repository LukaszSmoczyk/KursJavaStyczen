package factory;

import factory.method.AbstrakcyjnaFabryka;
import factory.samochody.Audi;
import factory.samochody.Seat;
import factory.samochody.Skoda;
import factory.simple.AmerykanskaFabrykaSamochodow;
import factory.simple.ProstaFabryka;

public class MainFactory {
    public static void main(String[] args) {

        AbstrakcyjnaFabryka prostaFabryka = new AmerykanskaFabrykaSamochodow();

        Samochod samochod = prostaFabryka.utworz("AUDI");
        samochod.uruchom();
    }
}
