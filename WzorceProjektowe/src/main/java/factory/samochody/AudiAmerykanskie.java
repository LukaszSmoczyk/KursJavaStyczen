package factory.samochody;

import factory.Samochod;

public class AudiAmerykanskie implements Samochod {
    @Override
    public void uruchom() {
        System.out.println("Amerykańskie Audi: wrum wrum i strzela z M16");
    }
}
