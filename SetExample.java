import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> setA = new HashSet<>();
        NavigableSet<Integer> setB = new TreeSet<>();
        NavigableSet<Integer> reverse = new TreeSet<>();

        setA.add(9);
        setA.add(1);
        setA.add(7);
        setA.add(5);
        setA.add(3);
        setA.add(13);
        setA.add(17);
        setA.add(23);
        setA.add(31);
        setA.add(37);

        setB.add(9);
        setB.add(1);
        setB.add(7);
        setB.add(5);
        setB.add(3);
        setB.add(13);
        setB.add(17);
        setB.add(23);
        setB.add(31);
        setB.add(37);

        for(Integer integer: setA){
            System.out.print(integer + " ");
        }
        System.out.println(" ");

        Iterator<Integer> itB = setB.iterator();
        while(itB.hasNext()){
            System.out.print(itB.next() + " ");
        }
        System.out.println(" ");

       

        
        reverse = setB.descendingSet();
        Iterator<Integer> itReverse = reverse.iterator();
        while(itReverse.hasNext()){
            System.out.print(itReverse.next() + " ");
        }
        System.out.println(" ");

        Iterator<Integer> rv = setB.descendingIterator();
        while(rv.hasNext()){
            System.out.print(rv.next() + " ");
        }
        System.out.println(" ");

        System.out.println(setB.higher(8));
        System.out.println(setB.ceiling(20));
        System.out.println(setB.floor(8));
        System.out.println(setB.lower(20));
        //System.out.println(setB.addAll(setB.descendingSet()));


    }

    


}