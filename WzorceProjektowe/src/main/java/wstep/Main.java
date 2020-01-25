package wstep;

public class Main {

    public static void main(String[] args) {
        Pies pies = new Pies("Reksio");
        Kon kon = new Kon("Rafał");
//
//        pies.przedstawSie();
//        pies.jedz("kość");
//
//        kon.przedstawSie();
//        kon.jedz("jabłko");

        Zwierze zwierze;

        zwierze = new Pies("pies");
        zwierze.przedstawSie();

        zwierze = new Kon("konik");
        zwierze.przedstawSie();

        zwierze = pies;
        zwierze.przedstawSie();

        Istota istota = zwierze;
        istota.wydajDzwiek();

        ///////////////////////////////////////////////
        // niemutowalna lista

        ImmutableArrayList<Zwierze> immutableArrayList = new ImmutableArrayList<>();
        immutableArrayList.add(pies);
        immutableArrayList.add(kon);
    }
}
