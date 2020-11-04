
import java.util.NoSuchElementException;

public class Test123 {

    public class EvenIterator implements Iterator<Position<E>> {
        private Position<E> cursor = first();
        private Position<E> recent = null;

        public boolean hasNext() {
            return (cursor != null);
        }

        public Position<E> next() throws NoSuchElementException {
            if (cursor == null)
                throw new IllegalStateException("Nothin Left");
            recent = cursor;
            cursor = after(cursor);
            return recent;
        }
    }

    private class PositionIterable implements Iterable<Poistion<E>> {
        public Iterator<Position<E>> iterator() {
            return new PositionIterator();
        }
    }

    public Iterable<Position<E>> positions() {
        return new PositionIterable();
    }

    public class ElementIterator implements Iterator<E> {
        Iterator<Position<E>> posIter = new PositionIterator();

        public boolean hasNext() {
            return posIterator.hasNext();
        }

        public E next() {
            return posIterator.next().getElement();
        }

        public void remove() {
            posIterator.remove();
        }
    }

    public Iterator<E> iterator() {
        return new ElementIterator();
    }
}
