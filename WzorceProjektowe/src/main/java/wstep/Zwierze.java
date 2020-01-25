package wstep;

public abstract class Zwierze implements Istota {

    private String nazwa;

    public Zwierze(String nazwa) {
        this.nazwa = nazwa;
    }

    public void jedz(String posilek){
        System.out.println("Jem " + posilek);
    }

    public void przedstawSie(){
        System.out.println("Jestem " + nazwa);
    }
}
