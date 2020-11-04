import java.util.*;

public class MyLinkedPos {

    public static void main(String args[]) {

        LinkedPositionalList<String> pos1 = new LinkedPositionalList<>();
        Position<String> p1 = pos1.addFirst("tekst1");

        System.out.println(p1.getElement());
        System.out.println(pos1.addFirst("tekst2").getElement());
        System.out.println(pos1.addFirst("tekst3").getElement());
        System.out.println(pos1.addFirst("tekst4").getElement());
        System.out.println(pos1.addFirst("tekst5").getElement());
        pos1.addBefore(p1, "tekst0");
        Position<String> voor = pos1.before(p1);
        System.out.println(voor.getElement());

        Iterator<String> lijst = pos1.iterator();
        while (lijst.hasNext()) {
            System.out.println(lijst.next());
        }

    }

}
