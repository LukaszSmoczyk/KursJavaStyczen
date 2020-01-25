package observer;

public class Follower implements Obserwator {
   private String nazwaUzytkownika;

    public Follower(String nazwaUzytkownika) {
        this.nazwaUzytkownika = nazwaUzytkownika;
    }

    @Override
    public void powiadom(String wiadomosc) {
        System.out.println(nazwaUzytkownika + ": " + wiadomosc);
    }
}
