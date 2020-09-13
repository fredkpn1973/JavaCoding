
class Ex {

    public static void main (String args[]) {
        method(5);
    }



    public static void method(long n) {
        if ( n== 1) System.out.print("*.");
        else {
            method(n-1 );
            System.out.print("*");
            
        }
    }
    
}