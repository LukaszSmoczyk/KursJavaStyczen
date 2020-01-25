package decorator.skladniki;

import decorator.Jedzenie;

public class Ketchup extends Skladnik {
    public Ketchup(Jedzenie jedzenie) {
        super(jedzenie);
    }

    @Override
    public double cena() {
        return jedzenie.cena() + 0.1;
    }
}
