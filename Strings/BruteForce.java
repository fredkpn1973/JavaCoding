import java.util.*;
import java.math.*;

public class BruteForce {

    public static void main(String args[]) {

        String text = "Dit is een zelf onz verzonnen stukje tekst het is eigenlijk onzi gewoon niets zeggendde onzin";

        String pattern = "onzin";
        int ja = findBrute(text.toCharArray(), pattern.toCharArray());
        System.out.println(ja);
        int nee = findBoyerMoore(text.toCharArray(), pattern.toCharArray());
        System.out.println(nee);

    }

    public static int findBrute(char[] text, char[] pattern) {
        int t1 = text.length;
        int p1 = pattern.length;

        /**
         * Zoek de hele tekst door. We hoeven niet tot het einde te zoeken. we moeten
         * stoppen voordat de zoek string het einde bereikt t1 - p1
         */
        for (int i = 0; i <= t1 - p1; i++) {
            int k = 0;
            /**
             * We hoeven de while natuurlijk alleen te doorlopen als de eerte * * letter van
             * het pattron gelijk is aan de letter van tekst op de positie waar we op dat
             * moment staan
             */
            while (k < p1 && text[i + k] == pattern[k]) {
                k++;
                if (k == p1)
                    return i;

            }

        }
        return -1;
    }

    public static int findBoyerMoore(char[] text, char[] pattern) {
        int t1 = text.length;
        int p1 = pattern.length;
        if (p1 == 0)
            return 0;
        Map<Character, Integer> last = new HashMap<>();
        for (int i = 0; i < t1; i++)
            last.put(text[i], -1);
        for (int k = 0; k < p1; k++)
            last.put(pattern[k], k);
        int i = p1 - 1;
        int k = p1 - 1;
        while (i < t1) {
            if (text[i] == pattern[k]) {
                if (k == 0)
                    return i;
                i--;
                k--;
            } else {
                i += p1 - Math.min(k, 1 + last.get(text[i]));
                k = p1 - 1;
            }
        }
        return -1;
    }
}