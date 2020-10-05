import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class Pets {

    public static void main(String args[]) {

        List<Dog> dogs;

        dogs = new ArrayList<>();
        dogs.add(new Dog("Rakker", "Pitbul", 5));
        dogs.add(new Dog("Rakker", "German Shepperd", 15));
        dogs.add(new Dog("Appie", "German Shepperd", 3));
        dogs.add(new Dog("Baantjer", "German Shepperd", 12));
        Iterator<Dog> honden = dogs.iterator();
        while (honden.hasNext()) {
            System.out.println(honden.next());
        }

        Collections.sort(dogs);
        Iterator<Dog> honden2 = dogs.iterator();
        while (honden2.hasNext()) {
            System.out.println(honden2.next());
        }

        System.out.println(dogs.get(0).compareTo(dogs.get(1)));
        Comparator<Dog> byAge = (d1, d2) -> d1.getAge() - d2.getAge();
        System.out.println(" "
        );
        Collections.sort(dogs, byAge);
        for (Dog hond : dogs) {
            System.out.println((hond));
        }

    }
}