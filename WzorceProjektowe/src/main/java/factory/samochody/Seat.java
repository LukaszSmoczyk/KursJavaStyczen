package factory.samochody;

import factory.Samochod;

public class Seat implements Samochod {
    @Override
    public void uruchom() {
        System.out.println("Seat robi: wrrrrrrrrrrrrrrrrrrrrrrr");
    }
}
