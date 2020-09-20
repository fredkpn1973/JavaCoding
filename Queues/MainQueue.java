public class MainQueue {

    public static void main(String[] args) {

        // ArrayQueue<String> aQueue = new ArrayQueue<>();
        LinkedQueue<String> aQueue = new LinkedQueue<>();
        System.out.print(aQueue.isEmpty());
        String s1 = "Tekst s1";
        String s2 = "Tekst s2";
        String s3 = "Tekst s3";
        String s4 = "Tekst s4";
        String s5 = "Tekst s5";
        String s6 = "Tekst s6";
        aQueue.enqueue(s1);
        aQueue.enqueue(s2);
        aQueue.enqueue(s3);
        aQueue.enqueue(s4);
        aQueue.enqueue(s5);

        System.out.println(aQueue.isEmpty());
        System.out.println(aQueue.size());

        System.out.println(aQueue.dequeue());
        System.out.println(aQueue.dequeue());
        System.out.println(aQueue.dequeue());
        System.out.println(aQueue.dequeue());
        System.out.println(aQueue.dequeue());
        System.out.println(aQueue.dequeue());

    }

}
