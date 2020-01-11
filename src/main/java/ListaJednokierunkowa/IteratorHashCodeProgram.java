package ListaJednokierunkowa;

public class IteratorHashCodeProgram {

    public static void main(String[] args) {

        IteratorKolejnoscHashCode iteratorHashCode = new IteratorKolejnoscHashCode();

        if (iteratorHashCode.hasNext()){
            System.out.println("Iterator ma next");
        } else {
            System.out.println("Iterator nie ma next");
        }

        iteratorHashCode.add(11);
        iteratorHashCode.add(22);
        iteratorHashCode.add(21);
        iteratorHashCode.add(221);
        iteratorHashCode.add(12);

        iteratorHashCode.initialize();


        System.out.println(iteratorHashCode.next());
        System.out.println(iteratorHashCode.next());
        System.out.println(iteratorHashCode.next());
        System.out.println(iteratorHashCode.next());
        System.out.println(iteratorHashCode.next());
        System.out.println(iteratorHashCode.next());


        if (iteratorHashCode.hasNext()){
            System.out.println("Iterator ma next");
            System.out.println(iteratorHashCode.next());
        } else {
            System.out.println("Iterator nie ma next");
        }
    }
}

