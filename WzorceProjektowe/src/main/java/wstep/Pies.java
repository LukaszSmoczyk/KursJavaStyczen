package wstep;

public class Pies extends Zwierze {
    public Pies(String nazwa) {
        super(nazwa);
    }

    public void przyniesc(String przedmiot){
        System.out.println("Przynieś " + przedmiot);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("hau hau");
    }

}
