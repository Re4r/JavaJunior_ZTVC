
package lesson19;

import java.util.Arrays;

public class Exec19 {
     
        public static void main(String[] args) {
                
                // Static Initialization:
                int[] array1 = new int[2];
                array1[0] = 10;
                array1[1] = 20;
                System.out.println(Arrays.toString(array1));
                
                // Dynamic Initialization:
                int[][] array = new int[3][];
                
                array[0] = new int[5];
                array[1] = new int[7];
                array[2] = new int[9];
                
                for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                                array[i][j] = j;
                        }
                }
        }
}
