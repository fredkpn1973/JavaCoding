
public class Getal {

    public static void main(String args[]) {

        System.out.println(isGeheelGetal(
                "2432342414214124124214124124141241244124124124124412432414124124144124141234124124124124124124124124126345543747325236125676126534726G"));

        System.out.println(isGeheelGetal1(
                "G2432342414214124124214124124141241244124124124124412432414124124144124141234124124124124124124124124126345543747325236125676126534726G"));
    }

    public static boolean isGeheelGetal(String s) {
        if (s.length() == 0)
            return false;
        if (s.length() == 1)
            return Character.isDigit(s.charAt(0));
        else
            return Character.isDigit(s.charAt(0)) && isGeheelGetal(s.substring(1));
    }

    public static boolean isGeheelGetal1(String s) {
        boolean getal = false;
        boolean done = false;
        while (done == false) {
            for (int i = 0; i < s.length() - 1; i++) {
                System.out.println(s.charAt(i));
                if (Character.isDigit(s.charAt(i)))
                    getal = true;
                else {
                    getal = false;
                    done = true;
                    i = (s.)
                }
                if (i == (s.length() - 1))
                    done = true;
            }

        }
        return getal;
    }

}