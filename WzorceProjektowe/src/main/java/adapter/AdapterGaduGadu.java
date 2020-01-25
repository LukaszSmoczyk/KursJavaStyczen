package adapter;

public class AdapterGaduGadu implements IMessenger {
    private GaduGadu gg;

    public AdapterGaduGadu(GaduGadu gg){
        this.gg = gg;
    }

    @Override
    public void wyslijWiadomosc(String odKogo, String doKogo, String tekst) {
        gg.napisz(odKogo + " napisał: ", tekst);
    }
}
