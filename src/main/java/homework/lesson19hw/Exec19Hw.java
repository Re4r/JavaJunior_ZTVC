
package homework.lesson19hw;

import java.util.Arrays;

public class Exec19Hw {
        
        private static int[] arraySource = new int[10];
        private static int[][] arraySource2 = new int[5][5];
        
        public static void main(String[] args) {
                
                showArray(arraySource2);

                System.out.println(Arrays.toString(bubbleSortArray(arraySource)));
                
        }
        
 
        static int[] bubbleSortArray(int[] array) {
                 for (int i = 0; i < arraySource.length; i++) {
                        arraySource[i] = (int) (Math.random() * 10);
                }
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
        
        static void showArray(int[][] array) {
                  for (int i = 0; i < arraySource2.length; i++) {
                        for (int j = 0; j < arraySource2[i].length; j++) {
                                arraySource2[i][j] = (int) (Math.random() * 10);
                        }
                }
                
                for (int i = 0; i < arraySource2.length; i++) {
                        System.out.println(Arrays.toString(arraySource2[i]));
                }
        }

}
