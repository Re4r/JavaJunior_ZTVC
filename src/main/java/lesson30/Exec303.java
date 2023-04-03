package lesson30;

public class Exec303 {
    
    private static final int A;
    private static final int B;
    private static final int C;
    
    static {
        System.out.println("Static Initializer Block");
        A = 10;
        B = 20;
        C = A + B;
    }
    
    {
        System.out.println("Non-Static Initializer Block");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
    
    public static void main(String[] args) {
        
        Exec303 ex = new Exec303();
        
    }

}
