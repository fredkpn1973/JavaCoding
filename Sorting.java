public class Sorting {

    public static void main(String args[]) {

        int[] lijst = { 6, 3, 22, 8, 52, 961, 3, 55 };
        insertionSort(lijst);
        for (int i = 0; i < lijst.length; i++) {
            System.out.print(lijst[i] + ", ");
        }
    }

    public static void insertionSort(int[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {
            int cur = data[k];
            int j = k;
            while (j > 0 && data[j - 1] > cur) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = cur;
        }
    }

}
