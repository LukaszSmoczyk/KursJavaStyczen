package iterator;

public class MainIterator {
    public static void main(String[] args) {
        String[] tab = {"ala", "ma", "kota", "!"};

//        for (int i = 0; i < tab.length; i++) {
//            System.out.println(tab[i] + " ");
//        }

        Iterator<String> iteratorTablicy = new IteratorTablicy<>(tab);
        while (iteratorTablicy.hasNext()){
            System.out.println(iteratorTablicy.next() + " ");
        }
    }
}
