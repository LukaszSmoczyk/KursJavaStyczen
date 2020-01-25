package observer;

import java.util.ArrayList;
import java.util.List;

public class KontoUzytkownika implements Obserwowany {

    private List<Obserwator> followersi = new ArrayList<>();

    @Override
    public void dodajFollowersa(Obserwator obserwator) {
        int index = followersi.indexOf(obserwator);
        if (index < 0){
            followersi.add(obserwator);
        }
    }

    @Override
    public void usunFollowersa(Obserwator obserwator) {
            followersi.remove(obserwator);
    }

    @Override
    public void powiadomWszystkichFollowersow(String wiadomosc) {
        for(Obserwator follower: followersi){
            follower.powiadom(wiadomosc);
        }
    }

    public void wyslijWiadomosc (String wiadomosc){
        powiadomWszystkichFollowersow("otrzymałeś wiadomość: " + wiadomosc);
    }

    public void umiescPost(String tekst){
        powiadomWszystkichFollowersow("umieszczono nowy post: " + tekst);
    }
}
