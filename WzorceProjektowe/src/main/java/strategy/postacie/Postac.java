package strategy.postacie;

import strategy.bronie.Bron;
import strategy.bronie.Piesc;

public abstract class Postac {
    private Bron bron;

    public Postac(){
        bron = new Piesc();
    }

    public void walcz(){
        bron.uzyj();
    }

    public void ustawBron(Bron bron){
        this.bron = bron;
    }

}
