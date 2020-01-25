package factory.samochody;

import factory.Samochod;

public class Skoda implements Samochod {
    @Override
    public void uruchom() {
        System.out.println("Skoda robi: Brum brum");
    }
}
