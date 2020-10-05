import java.util.*;

public class HasCode {

    public static void main(String args[]) {

        Phone p1 = new Phone("Piet", 12345);
        Phone p2 = new Phone("Jan", 12345);
        Phone p3 = new Phone("Kees", 12345);
        Phone p4 = new Phone("Klaas", 12345);
        Phone p5 = new Phone("Karel", 12345);

        Map<Phone, String> map = new HashMap<>();
        map.put(p1, "Rotterdam");
        map.put(p2, "Amsterdam");
        map.put(p3, "Amsterdam");

        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        System.out.println(map.size());
    }

}