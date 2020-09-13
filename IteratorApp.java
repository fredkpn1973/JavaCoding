import java.util.*;

public class IteratorApp {

    public static void main (String args[]){

        Collection<String> c = Arrays.asList(args);
        Iterator<String> iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase());
        }
    }
}