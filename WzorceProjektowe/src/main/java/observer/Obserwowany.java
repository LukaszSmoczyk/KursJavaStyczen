package observer;

public interface Obserwowany {
    void dodajFollowersa(Obserwator obserwator);
    void usunFollowersa(Obserwator obserwator);
    void powiadomWszystkichFollowersow(String wiadomosc);
}
