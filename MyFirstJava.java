import java.util.*;


public class MyFirstJava {

    public static void main(String args[]){

        // String[] bugs = {"cricet", "beetle", "ladybug"};
        // String[] alias = bugs;
        // System.out.println(bugs.equals(alias));
        // System.out.println(bugs.toString());
        
        // int[] numbers = new int[10];
        // for (int i =0; i < numbers.length; i++){
        //     numbers[i] = i + 5;
        // }
        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);

        // int[] test = {9,7,5,3,2,1};
        // for(int t: test){
        //     System.out.println(Arrays.binarySearch(test, t));
        // }        
        // Arrays.sort(test);
        // for(int i = 0; i < test.length; i++){
        //     System.out.print(test[i] + "  ");
        // }
        // System.out.println("\n" + Arrays.binarySearch(test, 3));

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.size());
        System.out.println(birds.set(0,"Robin"));



    
    }
}