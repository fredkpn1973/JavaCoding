import java.util.Random;

public class LinkedListUser {

    public static void main(String args[]) {

        SinglyLinkedList linkedList = new SinglyLinkedList();
        System.out.print(linkedList.size());
        String s1 = new String("Dit is de eerste");
        String s2 = new String("Dit is de tweede");
        String s3 = new String("Dit is de derde");
        String s4 = new String("Dit is de vierde");
        String s5 = new String("Dit is de vijfde");
        Random rand = new Random();
        for (int i = 0; i < 999999999; i++) {
            // linkedList.addFirst(rand.nextInt(999));
            linkedList.addLast(i);

        }

        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());
        System.out.println(linkedList.next(32));
        System.out.println(linkedList.secondLast());

    }

}
