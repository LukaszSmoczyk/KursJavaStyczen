package command;

public class PolecenieBramaWjazdowa implements Polecenie {

    private BramaWjazdowa bramaWjazdowa;

    public PolecenieBramaWjazdowa(BramaWjazdowa bramaWjazdowa) {
        this.bramaWjazdowa = bramaWjazdowa;
    }

    @Override
    public void wykonaj() {
        if (bramaWjazdowa.czyZamknieta()) {
            bramaWjazdowa.otworz();
        } else {
            bramaWjazdowa.zamknij();
        }
    }
}
