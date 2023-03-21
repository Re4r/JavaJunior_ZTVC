
package homework.lesson18hw;

public class Equality {
        
        private static StringBuilder s1 = new StringBuilder("HelloRave");
        private static StringBuilder s2 = new StringBuilder("HelloRave");
        
        public static void main(String[] args) {
                System.out.println(compare(s1, s2));
        }
        
        static boolean compare(StringBuilder sb1, StringBuilder sb2) {
                String str1 = new String(sb1);
                String str2 = new String(sb2);
                return str1.equals(str2);
        }

}
