
package homework.lesson20hw;

import java.util.Arrays;

public class Exec20 {
        
        private static final String[] ARRAY1 = new String[10];
        private static final String[] ARRAY2 = new String[5];
        private static final String[] ARRAY3 = new String[10];
        
        public static void main(String[] args) {
                
                System.out.println(Arrays.toString(args));

                initialize(ARRAY1, ARRAY2, ARRAY3);
                
                System.out.println(Arrays.toString(example(ARRAY1, ARRAY2, ARRAY3)));
                
                String[] result = example(ARRAY1, ARRAY2, ARRAY3);
                
                for (int i = 0; i < args.length; i++) {
                        for (int j = 0; j < result.length; j++) {
                                if (args[i].equals(result[j])) {
                                        result[j] = null;
                        }
                }       
        }
                System.out.println(Arrays.toString(result));
}                
        
        static String[] example(String[] ... string) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String[] s : string) {
                        for (int i = 0; i < s.length; i++) {
                                stringBuilder.append(s[i]);
                        }
                }
                
                String[] s2 = new String[stringBuilder.length()];
                char[] c = new char[stringBuilder.length()];
                for (int i = 0; i < c.length; i++) {
                        c[i] = stringBuilder.charAt(i);
                }
                
                for (int i = 0; i < s2.length; i++) {
                        s2[i] = Character.toString(c[i]);
                }
                
                return s2;
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
