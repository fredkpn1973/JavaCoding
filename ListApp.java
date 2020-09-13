import java.util.*;

class ListApp {
    
    public static void main(String args[]){
        Collection<String> c = new ArrayList<>();
        c.add("A");
        c.add("b");
        c.add("A");
        c.add("C");
        c.addAll(Arrays.asList("B", "D")); // [A, b, A, C, B, D]
        c.removeAll(Arrays.asList("A")); // [b, C, B, D]
        c.retainAll(Arrays.asList("b", "D")); // [b, D]
        for(String s: c) {
            System.out.print(s);
        }

        Iterator<String> iter = c.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next());
        }

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("C");
        set.add("D");
        System.out.println("\n" + set.isEmpty());
        System.out.println("\n" + set.size());
        System.out.println("\n" + set.contains("D"));


    }
}