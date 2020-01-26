package command;

public class MalyPilot {

    private Polecenie slot1;
    private Polecenie slot2;

    public void ustawSlot1(Polecenie polecenie) {
        slot1 = polecenie;
    }

    public void nacisnijPrzyciskSlotu1() {
        slot1.wykonaj();
    }

    public void ustawSlot2(Polecenie polecenie) {
        slot2 = polecenie;
    }

    public void nacisnijPrzyciskSlotu2() {
        slot2.wykonaj();
    }
}
