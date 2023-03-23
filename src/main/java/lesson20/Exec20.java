
package lesson20;

import java.util.Arrays;

public class Exec20 {
        
        private static final int[][] sourceArray = new int[10][];
        
        public static void main(String[] args) {
                
                initialization(sourceArray);
                show(sourceArray);
                
                
        }
        
        static void initialization(int[][] array) {
                for (int i = 0; i < array.length; i++) {
                        array[i] = new int[(int) (Math.random() * 10)];
                }
                for (int[] a : array) {
                        for (int i = 0; i < a.length; i++) {
                                a[i] = (int) (Math.random() * 10);
                        }
                }

        }
        
        static void show(int[][] array) {
                for (int[] arr : array) {
                        System.out.println(Arrays.toString(arr));
                }
        }
        
        

}
