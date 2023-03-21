
package lesson19;

import java.util.Arrays;

public class Exec19_2 {
        
        public static void main(String[] args) {
                
                int[] array = new int[10];
                
                for (int i = 0; i < array.length; i++) {
                        array[i] = (int) (Math.random() * 10);
                }
                System.out.println(Arrays.toString(array));
                
                Arrays.sort(array);
                
                System.out.println(Arrays.toString(array));
                
        }

}
