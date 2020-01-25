package decorator.skladniki;

import decorator.Jedzenie;

public class Cebulka extends Skladnik {
    public Cebulka(Jedzenie jedzenie) {
        super(jedzenie);
    }

    @Override
    public double cena() {
        return jedzenie.cena() + 0.50;
    }
}
