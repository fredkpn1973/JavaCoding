import java.util.*;
import java.util.function.Predicate;
import java.util.function.BiPredicate;

class FilterApp {
    public static void main(String args[]){
        List<String> woorden = Arrays.asList(args);
        List<String> gefilterd = geldig(woorden, woord -> woord.length()>4);
        System.out.println(gefilterd);
        gefilterd = geldig(woorden, woord -> woord.indexOf("i")>0);
        System.out.println(gefilterd);
        
        // Zo mag het ook
        Predicate<String> p1 = woord -> woord.length()>4;
        System.out.println(p1.test("Jantje"));

        //Endan twee string met elkaar vergelijken
        BiPredicate<String, String> bi1 = (s1, s2) -> s1.equals(s2);
        System.out.println(bi1.test("Jan","Jan"));
        System.out.println(bi1.test("Jan","Piet"));



    }

    static List<String> geldig(List<String> invoer, Predicate<String> filter) {
        List<String> uitvoer = new ArrayList<>();
        for(String woord:invoer){
            if(filter.test(woord)){
                uitvoer.add(woord);
            }
        }
        return uitvoer;
    }
}