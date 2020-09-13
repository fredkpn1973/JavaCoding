

import java.util.function.BiConsumer;

public class JavaBiConsumer2 {

    public static void main(String[] args) {

        //addTwo(1, 2, (x, y) -> System.out.println(x + y));          // 3
        addTwo("Node", ".js", (x, y) -> System.out.println(x + y)); // Node.js

    }

    static <T> void addTwo(String a1, String a2, BiConsumer<String, String> c) {
        c.accept(a1, a2);
    }

}