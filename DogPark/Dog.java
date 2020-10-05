
import java.util.*;

public class Dog implements Comparable<Dog> {

    private String name;
    private String bread;
    private int age;

    Dog(String name, String bread, int age) {
        this.name = name;
        this.bread = bread;
        this.age = age;
    }

    public int compareTo(Dog dog) {
        return name.compareTo(dog.name);
    }

    public String toString() {
        return "The dogs name is: " + name + " The dogs bread is: " + bread + " and the age is: " + age;
    }

    public int getAge() {
        return age;
    }

}