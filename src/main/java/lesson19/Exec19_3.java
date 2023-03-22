
package lesson19;

import java.util.Arrays;

public class Exec19_3 {
        
        private static int[] array = new int[10];
        
        public static void main(String[] args) {
                
                for (int i = 0; i < array.length; i++) {
                        array[i] = (int) (Math.random() * 10);
                }

                showMinMaxValue(array);
                showMinMaxValue2(array);
        }
        
        static void showMinMaxValue(int[] array) {
                int max = array[0];
                int min = array[0];
                for (int i = 0; i < array.length; i++) {
                        if (array[i] > max) {
                                max = array[i];
                        }
                        if (array[i] < min) {
                                min = array[i];
                        }
                }
                System.out.println("Source Array: " + Arrays.toString(array));
                System.out.println("Max Value: " + max);
                System.out.println("Min Value: " + min);
        }
        
        static void showMinMaxValue2(int[] array) {
                Arrays.sort(array);
                System.out.println("Source Array: " + Arrays.toString(array));
                System.out.println("Max Value: " + array[array.length - 1]);
                System.out.println("Min Value: " + array[0]);
        }

}
