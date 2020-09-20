
class Outer {
    int a;

    public void show() {
        System.out.println("Outer Show");
    }

    class Inner {

        public void display() {
            System.out.println("Inner display");
        }
    }
}

public class OuterInner {

    public static void main(String args[]) {

        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}
