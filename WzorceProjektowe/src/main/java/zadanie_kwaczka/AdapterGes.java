package zadanie_kwaczka;

import adapter.AdapterGaduGadu;

public class AdapterGes implements Kwaczka {

    private Ges ges;

    public AdapterGes(Ges ges) {
        this.ges = ges;
    }


    @Override
    public void kwacz() {
        ges.gegaj();
    }
}
