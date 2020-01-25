package decorator;

import decorator.skladniki.Cebulka;
import decorator.skladniki.Ketchup;
import decorator.skladniki.Ogorek;

public class MainDecorator {
    public static void main(String[] args) {
        Jedzenie hotdog = new Hotdog();
        System.out.println("Hotdog: " + hotdog.cena() +" zł");

        Jedzenie hotdogZCebulka = new Cebulka(hotdog);
        System.out.println("Hotdog z cebulką: " + hotdogZCebulka.cena() +" zł");

        // Hotdog na zamówienie - 2x Ogorek, 1 x Cebulka
        Jedzenie hotdogNaZamowienie = new Ogorek(new Ogorek(new Cebulka(new Hotdog())));
        System.out.println("Hotdog na zamówienie: " + hotdogNaZamowienie.cena()+" zł");

        // Hotdog na zamówienie z keczupem
        hotdogNaZamowienie = new Ketchup(hotdogNaZamowienie);
        System.out.println("Hotdog na zamówienie: " + hotdogNaZamowienie.cena()+" zł");

    }
}
