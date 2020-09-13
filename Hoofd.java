public class Hoofd {
    
    public static void main(String args[]){
        Generic<String> voorbeeld = new Generic<>();
        voorbeeld.setValue("test");
        System.out.println(voorbeeld.getValue().toUpperCase());
    }
}