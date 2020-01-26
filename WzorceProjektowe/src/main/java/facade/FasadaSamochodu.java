package facade;

import facade.elementy_samochodu.Drzwi;
import facade.elementy_samochodu.Kluczyk;
import facade.elementy_samochodu.Reflektory;
import facade.elementy_samochodu.Silnik;

public class FasadaSamochodu {
    private Silnik silnik;
    private Drzwi drzwi;
    private Reflektory reflektory;

    public FasadaSamochodu(){
        silnik = new Silnik();
        drzwi = new Drzwi();
        reflektory = new Reflektory();
    }

    public void uruchomSilnik (Kluczyk kluczyk) {
        if (kluczyk.przekrec("12345ABC")){
            silnik.sprawdzUklad();
            silnik.wlaczPompePaliwa();
            silnik.zaplon();
            reflektory.wlacz();
            drzwi.zamknij();
        }
    }
}
