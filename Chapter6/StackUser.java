import java.util.Random;

public class StackUser {

    public static void main(String args[]) {

        Stack<Integer> stackA = new LinkedStack<>();
        System.out.println("De grootte is: " + stackA.size());
        System.out.println("Staat er wat op?: " + stackA.isEmpty());
        System.out.println("Wat is de top: " + stackA.top());

        for (int i = 0; i <= 10; i++) {
            stackA.push(i);
        }

        System.out.println("De stack bevat: " + stackA.toString());

        System.out.println("De grootte is: " + stackA.size());
        System.out.println("Staat er wat op?: " + stackA.isEmpty());
        System.out.println("Wat is de top: " + stackA.top());

        Stack<Integer> stackB = new LinkedStack<>();
        transfer(stackA, stackB);

        System.out.println("De stack bevat: " + stackA.toString());
        System.out.println("De stack bevat: " + stackB.toString());
        stackB.cleanStack();
        System.out.println("De stack bevat: " + stackB.toString());

    }

    private static void transfer(Stack s, Stack t) {
        while (!s.isEmpty())
            t.push(s.pop());
    }

}
