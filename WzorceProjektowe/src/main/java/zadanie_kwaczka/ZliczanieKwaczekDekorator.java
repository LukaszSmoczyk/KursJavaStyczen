package zadanie_kwaczka;

public class ZliczanieKwaczekDekorator implements Kwaczka {
    private int iloscKwakniec = 0;
    private Kwaczka kwaczka;

    public ZliczanieKwaczekDekorator(Kwaczka kwaczka) {
        this.kwaczka = kwaczka;

    }

    @Override
    public void kwacz() {
        kwaczka.kwacz();
        iloscKwakniec++;
        System.out.println("Kwaczka kwaknęła " + iloscKwakniec + " razy");
    }
}
