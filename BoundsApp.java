import java.util.*;
class BoundsApp {

    public static void main(String args[]){
        List<B> listOfB = new ArrayList<>();
        listOfB.add(new B());

        Bounds<B> bounds = new Bounds<>(listOfB);
        bounds.addToList(Arrays.asList(new C())); // C past in this.list

        List<A> listOfA = new ArrayList<>();
        listOfA.add(new A());
        bounds.addFromList(listOfA); // elementen van this.list
    }
}
n