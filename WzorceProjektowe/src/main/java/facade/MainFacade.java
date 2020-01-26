package facade;

import facade.elementy_samochodu.Kluczyk;

public class MainFacade {

    public static void main(String[] args) {
        FasadaSamochodu fasadaSamochodu = new FasadaSamochodu();

        Kluczyk kluczyk = new Kluczyk();
        fasadaSamochodu.uruchomSilnik(kluczyk);
    }
}
