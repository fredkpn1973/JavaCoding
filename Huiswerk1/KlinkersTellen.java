import java.lang.Math;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import jdk.dynalink.linker.support.SimpleLinkRequest;

public class KlinkersTellen {

    static int klinkerCount = 0;

    public static void main(String[] args) {

        String s = "aabbbb ";
        System.out.println("wat is het nu: " + klinkers(s));

    }

    public static boolean klinkers(String s) {
        if (s.length() == 0)
            return false;
        if (isKlinker(s.charAt(0)))
            klinkerCount++;
        klinkers(s.substring(1));
        return klinkerCount > (s.length() / 2);
    }

    public static boolean isKlinker(char c) {
        char[] klinker = { 'a', 'e', 'i', 'o', 'u' };
        int teller = 0;
        while (teller < klinker.length) {
            if (c == klinker[teller]) {
                return true;
            }
            teller++;
        }
        return false;
    }
}
