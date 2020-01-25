package observer;

public class MainObserver {
    public static void main(String[] args) {
        KontoUzytkownika kontoUzytkownika = new KontoUzytkownika();

        Follower janKowalski = new Follower ("Jan Kowalski");
        Follower alicjaBanicja = new Follower ("Alicja Banicja");

        kontoUzytkownika.dodajFollowersa(janKowalski);

        kontoUzytkownika.umiescPost("Cześć. Zapraszam was na zajęcia ze wzorców!");

        kontoUzytkownika.dodajFollowersa(alicjaBanicja);

        kontoUzytkownika.umiescPost("Pamiętajcie! Widzimy się na wzorcach");

        kontoUzytkownika.wyslijWiadomosc("Przesyłam wam notatki z zajęć");

        kontoUzytkownika.usunFollowersa(alicjaBanicja);

        kontoUzytkownika.umiescPost("Czy ktoś widział Alicję?");
    }
}
