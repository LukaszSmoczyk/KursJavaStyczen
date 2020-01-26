package flyweight;

public class Znak {
    private String id;
    private char litera;
    private String color;
    private int wielkosc;
    private String czcionka;

    public Znak(char litera, String color, int wielkosc, String czcionka) {
        this.litera = litera;
        this.color = color;
        this.wielkosc = wielkosc;
        this.czcionka = czcionka;
        this.id = litera + color + wielkosc + czcionka;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Znak){
            Znak znak = (Znak) obj;
            return znak.id.equals(this.id);
        }
        return false;
    }

    public String getId() {
        return id;
    }

    // ID = C BLACK 12 ARIAL
}
