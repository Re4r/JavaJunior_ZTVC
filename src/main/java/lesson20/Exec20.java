
package lesson20;

import java.util.Arrays;

public class Exec20 {
        
        private static final int[][] sourceArray = new int[3][10];
        
        public static void main(String[] args) {
                
                initialization(sourceArray);
                //show(sourceArray);
                System.out.println(Arrays.toString(sourceArray[0]));
                
        }
        
        static void initialization(int[][] array) {
                for (int[] arr : array) {
                        for (int item : arr) {
                                item = (int) (Math.random() * 10);
                                System.out.println(item);
                        }
                        System.out.println(Arrays.toString(arr));
                }
        }
        
        static void show(int[][] array) {
                for (int[] arr : array) {
                        System.out.println(Arrays.toString(arr));
                }
        }
        
        

}
