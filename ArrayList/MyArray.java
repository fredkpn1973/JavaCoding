import java.util.List;
import java.util.ArrayList;

public class MyArray {

    public static void main(String arg[]) {

        List<String> lijst = new ArrayList<>();
        lijst.add("a");
        lijst.add(0, "b");
        for (String l : lijst) {
            System.out.println(l);
        }

    }

}
