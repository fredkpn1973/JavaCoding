import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.time.*;
import java.util.Iterator;

public class R31 {

    public static void main(String args[]) {

        List<Integer> getallen = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            // rand.setSeed(63);
            getallen.add(rand.nextInt(999));
        }

        Iterator<Integer> iter = getallen.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + ",");
        }

        while (!getallen.isEmpty()) {
            getallen.remove(rand.nextInt(getallen.size()));
        }

        System.out.print("Nog een regel");

        Iterator<Integer> iter2 = getallen.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next() + ",");
        }

    }
}