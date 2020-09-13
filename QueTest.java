import java.util.Queue;
import java.util.*; 

public class QueTest {

    public static void main(String[] args){

        Queue<String> queue = new LinkedList<>();
        queue.offer("Fred");
        queue.offer("Jan");
        queue.offer("Jan");

        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.poll();
        Iterator<String> itr1 = queue.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}
