public class StackUser {

    public static void main (String args[]) {

        ArrayStack<String> stapel = new ArrayStack<>();
        System.out.println("Is de lijst leeg? " + stapel.isEmpty());
        System.out.println("Is de lijst leeg? " + stapel.size());
        String s4 = "Dit is een tekst s4";
        String s1 = "Dit is een tekst s1";
        String s2 = "Dit is een tekst s2";
        String s3 = "Dit is een tekst s3";
        stapel.push(s1);
        System.out.println("Is de lijst leeg? " + stapel.top());
        
    }

   

}