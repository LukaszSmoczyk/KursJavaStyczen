package command;

public class BramaWjazdowa {
    private boolean zamknieta = true;

    public void otworz(){
        if (!zamknieta) {
            return;
        }
        System.out.println("Trwa otwieranie bramy wjazdowej ...");
        ThreadUtils.sleep(2000);
        System.out.println("Brama wjazowa otwarta");
        zamknieta = false;
    }

    public void zamknij() {
        if (zamknieta) {
            return;
        }
        System.out.println("Trwa zamykanie bramy wjazdowej...");
        ThreadUtils.sleep(1500);
        System.out.println("Brama wjazdowa zamknięta");
        zamknieta = true;
    }

    public boolean czyZamknieta() {
        return zamknieta;
    }

}
