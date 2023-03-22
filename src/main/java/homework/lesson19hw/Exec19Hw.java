
package homework.lesson19hw;

import java.util.Arrays;

public class Exec19Hw {
        
        private static int[] arraySource = new int[10];
        
        public static void main(String[] args) {
                
                for (int i = 0; i < arraySource.length; i++) {
                        arraySource[i] = (int) (Math.random() * 10);
                }
                
                System.out.println(Arrays.toString(arraySource));
                System.out.println(Arrays.toString(bubbleSortArray(arraySource)));
                
        }
        
 
        static int[] bubbleSortArray(int[] array) {
                for (int i = 0; i < array.length; i++) {
                        for (int j = i + 1; j < array.length; j++) {
                                int temp = 0;
                                if (array[i] > array[j]) {
                                        temp = array[i];
                                        array[i] = array[j];
                                        array[j] = temp;
                                }
                        }
                }
                return array;
        }

}
