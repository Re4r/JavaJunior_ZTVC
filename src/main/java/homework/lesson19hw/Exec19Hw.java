
package homework.lesson19hw;

import java.util.Arrays;

public class Exec19Hw {
        
        private static int[] arraySource = new int[10];
        
        public static void main(String[] args) {
                
                for (int i = 0; i < arraySource.length; i++) {
                        arraySource[i] = (int) (Math.random() * 10);
                }
                
                System.out.println(Arrays.toString(arraySource));
                System.out.println(Arrays.toString(sortArray(arraySource)));
                
        }
        
        static int[] sortArray(int[] array) {
                int[] array2 = new int[array.length];
                int min = array[0];
                for (int i = 0; i < array.length; i++) {
                        if (array[i] < min) {
                                min = array[i];
                                array2[i] = min;
                        }
                }
                return array2;
        }

}
