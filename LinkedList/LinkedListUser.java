public class LinkedListUser {

    public static void main(String[] args) {

        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        String s4 = "Dit is een tekst s4";
        String s1 = "Dit is een tekst s1";
        String s2 = "Dit is een tekst s2";
        String s3 = "Dit is een tekst s3";
        linkedList.addFirst(s1);
        linkedList.addLast(s2);
        linkedList.addLast(s3);
        linkedList.addLast(s4);
        System.out.print(linkedList.size());  
        System.out.print("\n Dit is de eerste tekst: " + linkedList.first() + "\n Dit is de laatste tekst: " + linkedList.last());


   }

}
