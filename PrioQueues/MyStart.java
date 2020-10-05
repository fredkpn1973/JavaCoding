import java.util.*;

public class MyStart {

    private static int[] lijst;

    public static void main(String args[]) {

        lijst = new int[3];
        lijst[0] = 5;
        lijst[1] = 2;
        lijst[2] = 3;
        for (int i = 0; i < lijst.length; i++) {
            System.out.println(lijst[i]);
        }

        voegToe(12);
        for (int i = 0; i < lijst.length; i++) {
            System.out.println(lijst[i]);
        }


    }

    public static void voegToe(int i) {

        int j = lijst.length - 1;
        while (j > 0 && lijst[j - 1] < i) {
            lijst[j] = lijst[j - 1];
            j--;
        }

        lijst[j] = i;

    }


    public static void sorteer() {
        int teller = lijst.length;
        for (int i = 0; i < lijst.length - 1; i++) {
            int huidig = lijst[i];
            if (huidig > huidig + 1) {
                int volgende = 
            }
        }


    }
}