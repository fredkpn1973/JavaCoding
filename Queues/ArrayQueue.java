public class ArrayQueue<E> implements Queue<E> {
    private static final int CAPACITY = 5;
    private E[] data;
    private int position = 0;
    private int size = 0;

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(E e) throws IllegalStateException {
        if (size == data.length) {
            throw new IllegalStateException("Vol is vol");
        }
        int avail = (position + size) % data.length;
        data[avail] = e;
        size++;
    }

    public E first() {
        if (isEmpty())
            return null;
        return data[position];
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E answer = data[position];
        data[position] = null;
        position = (position + 1) % data.length;
        size--;
        System.out.println(position);
        return answer;

    }

}
