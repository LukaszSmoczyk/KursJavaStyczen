package factory.simple;

import factory.Samochod;
import factory.method.AbstrakcyjnaFabryka;
import factory.samochody.Audi;
import factory.samochody.AudiAmerykanskie;
import factory.samochody.Seat;
import factory.samochody.Skoda;

public class AmerykanskaFabrykaSamochodow implements AbstrakcyjnaFabryka {
    @Override
    public Samochod utworz(String typ) {
        if(typ.equals("AUDI")){
            return new AudiAmerykanskie();
        } else if (typ.equals("SKODA")){
            return new Skoda();
        } else if (typ.equals("SEAT")){
            return new Seat();
        }
        return null;
    }
}

