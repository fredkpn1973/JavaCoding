import java.util.Random;

class Rand {

    public static void main(String args[]) {

        int[] lijst = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 6, 43, 63, 6456, 35, 355, 25 };
        while (lijst.length > 0) {
            Random rand = new Random();
            int randomGetal = rand.nextInt(lijst.length);
            lijst = removeItem(lijst, randomGetal);
            for (int i : lijst) {
                System.out.print(i + ", ");
            }
            System.out.println("");
        }

    }

    public static int[] removeItem(int[] lijst, int index) {
        int[] nieuwLijst = new int[lijst.length - 1];
        for (int i = 0, k = 0; i < lijst.length; i++) {
            if (i == index) {
                continue;
            }
            nieuwLijst[k++] = lijst[i];
        }
        return nieuwLijst;
    }
}