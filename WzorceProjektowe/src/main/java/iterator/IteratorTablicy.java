package iterator;

public class IteratorTablicy<T> implements Iterator<T> {

    private T[] tablica;
    private int pozycja = 0;

    public IteratorTablicy(T[] tablica){
        this.tablica = tablica;
    }
    @Override
    public boolean hasNext() {
        return pozycja < tablica.length && tablica[pozycja] != null;
    }

    @Override
    public T next() {
        if (hasNext()){
            return tablica[pozycja++];
        }
        return null;
    }
}
