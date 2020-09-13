import java.util.*;

public class Reken {

    public static void main (String args[]){
        
        int[] numbers = {1,3,5,7,9,8,8,0,2,5,2,13};
        Arrays.sort(numbers);
        for(int i : numbers) {
            System.out.print(i+", ");
        }
        System.out.println();

        int[] num = new int[10];
        Arrays.fill(num, 5);
        for(int i : num) {
            System.out.print(i+", ");
        }
        System.out.println();
        int[] copy = Arrays.copyOf(numbers, 5);
        for(int i : copy) {
            System.out.print(i+", ");
        }
        System.out.println(Arrays.toString(copy));
        int next = (5 *8 + 3)%7;
        System.out.println(next);
    }

}