
package lesson3;


public class Lesson3 {
    public static void main(String[] args) {
        byte b = 0;
        for (int i = 0; i < 10; i++) {
            b += i;
        }
        System.out.println(b);
        
        short s = 100;
        for (int i = 0; i < 10; i++) {
            s -= i;
        }
        System.out.println(s);
        
        int i = 100;
        for (int j = 1; j < 10; j++) {
            i *= j;
        }
        System.out.println(i);
        
        long l = 1_000_000;
        for (int j = 1; j < 10; j++) {
            l /= j;
        }
        System.out.println(l);
  
    }
}
