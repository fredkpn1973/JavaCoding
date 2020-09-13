import java.util.*;

public class MapTest {
    public static void main(String arg[]){

        Map<String, String> mapje = new HashMap<>();

        mapje.put("Koala", "Bamboo");
        mapje.put("Lion", "Meat");
        mapje.put("Giraffe", "Leaf");

        System.out.println("A Koala eats" + mapje.get("Koala"));
        
    }
}