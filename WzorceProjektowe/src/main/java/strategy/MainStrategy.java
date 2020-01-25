package strategy;

import strategy.bronie.Miecz;
import strategy.postacie.Postac;
import strategy.postacie.Rycerz;

public class MainStrategy {
    public static void main(String[] args) {
        Postac postac = new Rycerz();
        postac.walcz();

        Miecz miecz = new Miecz();
        postac.ustawBron(miecz);

        postac.walcz();
    }
}
