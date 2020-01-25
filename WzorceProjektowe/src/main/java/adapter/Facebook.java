package adapter;

public class Facebook implements IMessenger {
    @Override
    public void wyslijWiadomosc(String odKogo, String doKogo, String tekst) {
        String wiadomosc = przygotujWiadomosc(odKogo, doKogo, tekst);
        odtworzDzwiek();
        System.out.println(wiadomosc);

    }

    private String przygotujWiadomosc(String odKogo, String doKogo, String tekst){
        String wiadomosc = String.format("%s otrzmałeś wiadomość od %s o treści: %s"
                , doKogo, odKogo, tekst);
        return wiadomosc;
    }

    private void odtworzDzwiek(){
        System.out.println("BYMP");
    }
}
