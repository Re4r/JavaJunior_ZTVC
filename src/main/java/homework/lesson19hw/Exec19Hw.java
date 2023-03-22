
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
                int[] array2 = array.clone();
                int min = array2[0];
                for (int i = 0; i < array2.length; i++) {
                        for (int j = 0; j < 10; j++) {
                                
                        }
                            
                }
                return arraySource;
        }

}
