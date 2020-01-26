package command;

public class BramaGarazowa {
    private boolean zamknieta = true;

    public void otworz(){
        if (!zamknieta) {
            return;
        }
        System.out.println("Trwa otwieranie bramy ...");
        ThreadUtils.sleep(2000);
        System.out.println("Garaż otwarty");
        zamknieta = false;
    }

    public void zamknij() {
        if (zamknieta) {
            return;
        }
        System.out.println("Trwa zamykanie bramy...");
        ThreadUtils.sleep(1500);
        System.out.println("Garaż zamknięty");
        zamknieta = true;
    }

    public boolean czyZamknieta() {
        return zamknieta;
    }
}
