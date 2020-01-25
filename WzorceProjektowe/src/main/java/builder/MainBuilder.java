package builder;

public class MainBuilder {

    public static void main(String[] args) {

        Osoba osoba = new Osoba.Builder()
                .ustawImie("Jędrek")
                .ustawNazwisko("SamWieszKto")
                .ustawWiek(90)
                .build();

        System.out.println(osoba.getImie());
        System.out.println(osoba.getNazwisko());
        System.out.println(osoba.getWiek());

        // BUILDER ROZSZERZONY
        OsobaRozszerzona osobaRozszerzona = OsobaRozszerzona.rozpocznijBudowanie()
                .ustawImie("Janek")
                .ustawNazwisko("Dzbanek")
                .ustawWiek(18)
                .ustawAdres("ul. Muzykalna 8")
                .build();
    }
}