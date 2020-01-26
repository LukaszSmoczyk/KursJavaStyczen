package flyweight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MenadzerZnakow {

    private Map<String, Znak> map = new HashMap<>();

    public void dodajZnak(char litera, String color, int wielkosc, String czcionka) {
        Znak znak = new Znak(litera, color, wielkosc, czcionka);
        map.put(znak.getId(), znak);
    }

    public void dodajTekst(String tekst, String color, int wielkosc, String czcionka) {
        for (char litera : tekst.toCharArray()) {
            dodajZnak(litera, color, wielkosc, czcionka);
        }
    }

    public int wielkoscBazy() {
        return map.size();
    }

}
