import java.util.Random;

public class SingleListUser {

    public static void main(String args[]) {

        SinglyLinkedList linkedList = new SinglyLinkedList();
        System.out.print(linkedList.size());
        String s1 = new String("Dit is de eerste");
        String s2 = new String("Dit is de tweede");
        String s3 = new String("Dit is de derde");
        String s4 = new String("Dit is de vierde");
        String s5 = new String("Dit is de vijfde");

        Random rand = new Random();
        for (int i = 0; i <= 0; i++) {
            System.out.println("i is nu: " + i);
            linkedList.addLast(i);
        }
        // linkedList.addLast(s2);

        // linkedList.addFirst(s1);
        System.out.println(linkedList.size());
        System.out.println("De getelde grootte is:" + linkedList.countSize());
        System.out.println(linkedList.toString());

    }

}
