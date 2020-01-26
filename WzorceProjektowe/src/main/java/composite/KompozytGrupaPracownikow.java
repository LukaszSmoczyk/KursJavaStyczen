package composite;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class KompozytGrupaPracownikow implements IComponent {

    private List<IComponent> listaPracownikow = new ArrayList<>();

    @Override
    public void pracuj() {
        for (IComponent pracownik: listaPracownikow){
            pracownik.pracuj();
        }
    }

    public void dodajPracownika(IComponent pracownik){
        listaPracownikow.add(pracownik);
    }
    public void usunPracownika(IComponent pracownik){
        listaPracownikow.remove(pracownik);
    }
}
