package composite;

public class MainComposite {
    public static void main(String[] args) {
        LeafPracownik pracownik1 = new LeafPracownik("Kowalski");
        LeafPracownik pracownik2 = new LeafPracownik("Nowak");
        LeafPracownik pracownik3 = new LeafPracownik("Michalik");
        LeafPracownik pracownik4 = new LeafPracownik("Lewandowski");
        LeafPracownik pracownik5 = new LeafPracownik("Puszkin");


        KompozytGrupaPracownikow kompozytGrupaPracownikow = new KompozytGrupaPracownikow();

        kompozytGrupaPracownikow.dodajPracownika(pracownik1);
        kompozytGrupaPracownikow.dodajPracownika(pracownik2);
        kompozytGrupaPracownikow.pracuj();

        System.out.println();

        kompozytGrupaPracownikow.dodajPracownika(pracownik3);
        kompozytGrupaPracownikow.pracuj();
        System.out.println("\n Mała robótka do wykonania:");

        IComponent robotaDoWykonania = pracownik1;
        robotaDoWykonania.pracuj();

        System.out.println("\n spora robota do wykonania");
        robotaDoWykonania = kompozytGrupaPracownikow;
        robotaDoWykonania.pracuj();
    }
}
