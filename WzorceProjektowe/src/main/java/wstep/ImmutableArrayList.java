package wstep;

import java.util.ArrayList;
import java.util.List;

public class ImmutableArrayList<T> {

    private List<T> lista = new ArrayList<T>();

    public void add(T element){
        lista.add(element);
    }

    public T get (int index){
        return lista.get(index);
    }

    public boolean isEmpty(){
        return lista.isEmpty();
    }
}
