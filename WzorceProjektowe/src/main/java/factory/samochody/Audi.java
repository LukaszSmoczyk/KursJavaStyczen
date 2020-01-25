package factory.samochody;

import factory.Samochod;

public class Audi implements Samochod {
    @Override
    public void uruchom() {
        System.out.println("Audi robi: Wruuuuuuuuuuuuuuuuuuum");
    }
}
