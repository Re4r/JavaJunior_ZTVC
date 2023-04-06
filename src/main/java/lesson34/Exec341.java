package lesson34;

public class Exec341 {
    
    public static void main(String[] args) {
        
        example(x -> x.length());
        
    }
    
    static void example(Test t) {
        System.out.println(t.testmethod("Hello World"));
    }

}
@FunctionalInterface
interface Test {
    int testmethod(String s);
}
