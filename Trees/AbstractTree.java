import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public abstract class AbstractTree<E> implements Tree<E> {

    public class ElementIterator implements Iterator<E> {
        Iterator<Position<E>> postIterator = positions().iterator();

        public boolean hasNext() {
            return postIterator.hasNext();
        }

        public E next() {
            return postIterator.next().getElement();
        }

        public void remove() {
            postIterator.remove();
        }

    }

    public boolean isInternal(Position<E> p) {
        return numChilderen(p) > 0;
    }

    public boolean isExternal(Position<E> p) {
        return numChilderen(p) == 0;
    }

    public boolean isRoot(Position<E> p) {
        return p == root();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int depth(Position<E> p) {
        if (isRoot(p))
            return 0;
        else
            return 1 + depth(parent(p));
    }

    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    private void preorderSubtree(Position<E> p, List<Position<E>> snapshot) {
        snapshot.add(p);
        for (Position<E> c : childeren(p)) {
            preorderSubtree(c, snapshot);
        }
    }

    /** We krijgen dus een lijst van Position terug
     * Position opzich is een interface die 
    */
    public Iterable<Position<E>> positions() {
        return preorder();
    }

    public Iterable<Position<E>> preorder() {
        List<Position<E>> snapshot = new ArrayList<>();
        if (!isEmpty())
            preorderSubtree(root(), snapshot);
        return snapshot;
    }

}
