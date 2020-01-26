package command;

public class ThreadUtils {

    public static void sleep (long milisec) {
        try {
            Thread.sleep(milisec);
        } catch (InterruptedException e ) {
            e.printStackTrace();
        }
    }
}
