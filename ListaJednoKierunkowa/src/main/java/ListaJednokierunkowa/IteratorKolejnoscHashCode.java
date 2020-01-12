package ListaJednokierunkowa;

import java.util.Objects;

    public class IteratorKolejnoscHashCode<T> {


        private IteratorItem head;
        private IteratorItem tail;
        private IteratorItem current;
        private boolean isCurrentIsInitialized;


        public void add(T obj) {
            IteratorItem iteratorItem = new IteratorItem(obj);

            int hashCode = Objects.hashCode(obj);

            if (head == null) {

                head = iteratorItem;
                tail = iteratorItem;

            } else {

                if(head.item.hashCode() >= iteratorItem.item.hashCode()) {

                    iteratorItem.setNext(head);
                    head = iteratorItem;
                } else if ( tail.item.hashCode() <= iteratorItem.item.hashCode()) {

                    tail = iteratorItem;
                    tail.setNext(iteratorItem);
                } else {

                    IteratorItem tmp = head;
                    while (tmp.getNext() != null && tmp.getNext().hashCode() < iteratorItem.hashCode()) {

                        tmp = tmp.getNext();
                    }

                    IteratorItem next = tmp.getNext();
                    if (next != null) {

                        tmp.setNext(next);
                    }

                    tmp.setNext(iteratorItem);
                }

                tail.next = iteratorItem;
                tail = iteratorItem;
            }
        }

        public boolean hasNext() {

            if (isCurrentIsInitialized == false){
                if (head != null) {
                    return true;
                }
            }
            if (current == null) {
                return false;
            }

            if (current.next == null) {
                return false;
            }
            return true;
        }

        public T next() {
            if (isCurrentIsInitialized == false) {
                current = head;
                isCurrentIsInitialized = true;
                return current.item;
            }

            if (hasNext()) {
                current = current.next;
                T result = current.item;
                return result;
            }
            return null;
        }

        public void initialize() {
            isCurrentIsInitialized = false;
        }


        private class IteratorItem {
             T item;
            private IteratorItem next;

            public IteratorItem(T item) {
                this.item = item;
            }

            public void setNext(IteratorItem next) {
                this.next = next;
            }
            public IteratorItem getNext() {
                return this.next;
            }
            public IteratorItem getHead() {
                return head;
            }

            public IteratorItem getTail() {
                return tail;
            }
        }
}
