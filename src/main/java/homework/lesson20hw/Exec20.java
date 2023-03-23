
package homework.lesson20hw;

import java.util.Arrays;

public class Exec20 {
        
        private static final String[] ARRAY1 = new String[10];
        private static final String[] ARRAY2 = new String[5];
        private static final String[] ARRAY3 = new String[20];
        
        public static void main(String[] args) {
                
                initialize(ARRAY1, ARRAY2, ARRAY3);
 
        }
        
        static String[] example(String[] ... s) {
                
                
                
        }
        
        static void initialize(String[] ... array) {
                for (String[] s : array) {
                        for (int i = 0; i < s.length; i++) {
                                s[i] = Integer.toString((int) (Math.random() * 10));
                        }
                        System.out.println(Arrays.toString(s));
                }
        }

}
