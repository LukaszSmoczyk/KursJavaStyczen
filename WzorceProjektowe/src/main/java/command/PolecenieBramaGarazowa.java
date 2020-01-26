package command;

public class PolecenieBramaGarazowa implements Polecenie{
    private BramaGarazowa bramaGarazowa;

    public PolecenieBramaGarazowa(BramaGarazowa bramaGarazowa) {
        this.bramaGarazowa = bramaGarazowa;
    }

    @Override
    public void wykonaj() {
        if (bramaGarazowa.czyZamknieta()) {
            bramaGarazowa.otworz();
        } else {
            bramaGarazowa.zamknij();
        }
    }
}
