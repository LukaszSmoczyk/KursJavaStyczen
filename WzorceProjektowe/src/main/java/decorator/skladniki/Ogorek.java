package decorator.skladniki;

import decorator.Jedzenie;

public class Ogorek extends Skladnik {
    public Ogorek(Jedzenie jedzenie) {
        super(jedzenie);
    }

    @Override
    public double cena() {
        return jedzenie.cena() + 0.50;
    }
}
