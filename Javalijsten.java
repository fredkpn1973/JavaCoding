import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.List;
import java.util.*;

public class Javalijsten {


    public static void main(String args[]){

        List<String> listA = new ArrayList<>();
        List<String> listB = new LinkedList<>();
        List<String> listC = new Vector<>();
        List<String> listD = new Stack<>();
        
        listA.add("element 1");
        listA.add(0, "element 2");
        listA.add("element 3");
        listA.add("element 2");
        listA.add("element 9");

        for(String a: listA){
            System.out.println(a);
        }
        System.out.println(listA.indexOf("element 2"));
        System.out.println(listA.lastIndexOf("element 2"));

        Iterator<String> iter = listA.iterator();
        System.out.println(iter);
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}