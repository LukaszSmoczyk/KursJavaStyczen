package command;

public class MainCommand {
    public static void main(String[] args) {
        BramaGarazowa bramaGarazowa = new BramaGarazowa();
        PolecenieBramaGarazowa polecenieBramaGarazowa = new PolecenieBramaGarazowa(bramaGarazowa);

        BramaWjazdowa bramaWjazdowa = new BramaWjazdowa();
        PolecenieBramaWjazdowa polecenieBramaWjazdowa = new PolecenieBramaWjazdowa(bramaWjazdowa);

        MalyPilot malyPilot = new MalyPilot();
        malyPilot.ustawSlot1(polecenieBramaGarazowa);

        System.out.println("Chcę wjechać");
        ThreadUtils.sleep(3000);
        malyPilot.nacisnijPrzyciskSlotu1();
        ThreadUtils.sleep(3500);
        System.out.println("Wjechaliśmy");
        ThreadUtils.sleep(3000);
        malyPilot.nacisnijPrzyciskSlotu1();

        System.out.println();

        ThreadUtils.sleep(1000);
        System.out.println("Chcę wyjechać");
    }
}
