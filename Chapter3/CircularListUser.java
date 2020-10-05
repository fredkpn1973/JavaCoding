import java.util.Random;

public class CircularListUser {

    public static void main(String args[]) {

        CircularlyLinkedList cList1 = new CircularlyLinkedList();
        System.out.print(cList1.size());
        CircularlyLinkedList cList2 = new CircularlyLinkedList();
        System.out.print(cList2.size());

        for (int i = 0; i <= 5; i++) {
            cList1.addLast(i);
        }

        for (int i = 0; i <= 5; i++) {
            cList2.addLast(i);
        }

        System.out.println("De size is: " + cList1.size());
        System.out.println("De list size is:" + cList1.listSize());
        cList1.rotate();
        System.out.println(cList1.toString());

        System.out.println("De size is: " + cList2.size());
        System.out.println("De list size is:" + cList2.listSize());
        cList2.rotate();
        System.out.println(cList2.toString());
        System.out.println(cList1.equals(cList2));
        System.out.println(cList2.equals(cList1));
        System.out.println(cList1.equals(cList1));

    }

}
