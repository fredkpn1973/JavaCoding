public class EventIterator implements Iterator<Position<E>> {
    private Position<E> cursor = first();
    private Position<E> recent = null;

    public boolean hasNext() {
        return (cursor != null);
    }

    public Position<E> next() throws NoSuchElementException {
        if (cursor == null)
            throw new NoSuchElementException("nothing left");
        recent = cursor;
        cursor = after(cursor);
        return recent;
    }

}
