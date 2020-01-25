package adapter;

public class MainAdapter {
    public static void main(String[] args) {
        GaduGadu gaduGadu = new GaduGadu();
        gaduGadu.napisz("343125", "Cześć, poklikasz?");

        Facebook facebook = new Facebook();
        facebook.wyslijWiadomosc("Lukasz", "Norber", "Mówisz, że też masz 12 lat?");

        System.out.println();

        AdapterGaduGadu adapterGaduGadu = new AdapterGaduGadu(gaduGadu);
        adapterGaduGadu.wyslijWiadomosc("Lukasz", "Norbert", "Mówisz, że też masz 12 lat?");
    }
}
