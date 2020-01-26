package facade.elementy_samochodu;

public class Kluczyk {

    private String id = "12345ABC";
    public boolean przekrec(String identyfikator) {
        return identyfikator.equals(id);
    }
}
