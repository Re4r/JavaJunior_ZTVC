
package homework;

import java.util.Arrays;


public class Lesson3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] result = new int[10];
        int[] result2 = new int[10];
        
        for (int i = 0; i < 10; i++) {
            a--;
            b++;
            result[i] = a | b;
            result2[i] = a & b;
            
        }
        
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
        
        boolean[] bool = new boolean[10];
        
        for (int i = 0; i < 10; i++) {
            bool[i] = result[i] > result2[i];
        }
        System.out.println(Arrays.toString(bool));
    }
}
