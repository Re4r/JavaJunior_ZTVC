
package lesson19;

public class Exec19_3 {
        
        private static int[] array = new int[10];
        
        public static void main(String[] args) {
                
                for (int i = 0; i < array.length; i++) {
                        array[i] = (int) (Math.random() * 10);
                }
                
        }
        
        static void showMinMaxValue(int[] array) {
                
        }

}
