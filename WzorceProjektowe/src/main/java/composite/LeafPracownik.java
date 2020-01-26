package composite;

public class LeafPracownik implements IComponent {
    private String nazwisko;

    public LeafPracownik(String nazwisko){
        this.nazwisko = nazwisko;
    }

    @Override
    public void pracuj() {
        System.out.println(nazwisko + " odmeldowuje się, pracuje...");
    }
}
