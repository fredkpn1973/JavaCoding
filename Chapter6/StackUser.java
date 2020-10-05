import java.util.Random;

public class StackUser {

    public static void main(String args[]) {

        LinkedStack<Integer> stackA = new LinkedStack<>();
        System.out.println("De grootte is: " + stackA.size());
        System.out.println("Staat er wat op?: " + stackA.isEmpty());
        System.out.println("Wat is de top: " + stackA.top());

        for (int i = 0; i <= 10; i++) {
            stackA.push(i);
        }

        System.out.println("De grootte is: " + stackA.size());
        System.out.println("Staat er wat op?: " + stackA.isEmpty());
        System.out.println("Wat is de top: " + stackA.top());

        LinkedStack<Integer> stackB = new LinkedStack<>();
        stackB = stackA.kopie();
    }

}
