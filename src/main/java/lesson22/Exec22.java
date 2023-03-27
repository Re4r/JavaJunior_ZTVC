
package lesson22;

import java.util.Arrays;

public class Exec22 {
        
        public static void main(String[] args) {
                
                int[] a = new int[5];
                int[] b = new int[7];
                int[] c = new int[9];
                
                initializeOfArray(a);
                initializeOfArray(b);
                initializeOfArray(c);
                
                System.out.println(Arrays.toString(a));
                System.out.println(Arrays.toString(b));
                System.out.println(Arrays.toString(c));
                
                System.out.println(Arrays.compare(a, b));
                System.out.println(Arrays.compare(b, c));
                System.out.println(Arrays.compare(c, a));
                
                System.out.println(Arrays.mismatch(a, b));
                System.out.println(Arrays.mismatch(b, c));
                System.out.println(Arrays.mismatch(c, a));

        }
        
        static int[] initializeOfArray(int[] array) {
                for (int i = 0; i < array.length; i++) {
                        array[i] = i * 10;
                }
                return array;
        }
                

}
