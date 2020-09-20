public class ReverseString {

    public static void main(String args[]) {

        System.out.println(keerom(" Dit is een stukje tekst"));

    }

    public static String keerom(String s) {

        if (s.length() == 1)
            return s;
        else {
            char eerste = s.charAt(0);
            String rest = s.substring(1);
            String omgekeerd = keerom(rest);
            String res = omgekeerd + eerste;
            return res;
        }

    }
}