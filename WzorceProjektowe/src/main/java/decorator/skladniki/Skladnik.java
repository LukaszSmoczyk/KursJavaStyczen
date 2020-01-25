package decorator.skladniki;

import decorator.Jedzenie;

public abstract class Skladnik implements Jedzenie {
    protected Jedzenie jedzenie;

    public Skladnik(Jedzenie jedzenie){
        this.jedzenie = jedzenie;
    }
}
