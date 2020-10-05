import java.util.Random;

public class DoublyListUser {

    public static void main(String args[]) {

        DoublyLinkedList<Integer> d1 = new DoublyLinkedList<>();
        DoublyLinkedList<Integer> d2 = new DoublyLinkedList<>();
        for (int i = 0; i < 0; i++) {
            d1.addLast(i);
        }
        for (int i = 0; i < 0; i++) {
            d2.addLast(i);
        }

        System.out.println(d1.size());
        System.out.println(d1.toString());

        System.out.println(d2.size());
        System.out.println(d2.toString());

        System.out.println(d1.equals(d2));

    }

}
