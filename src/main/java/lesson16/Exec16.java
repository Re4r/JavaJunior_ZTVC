
package lesson16;

public class Exec16 {
        
        public static void main(String[] args) {
                
                String string = new String("abcdefgabcdefg");
                String string1 = "abcdefgabcdefg";
                
                int a = string.length();
                int b = string1.length();
                char c = string.charAt(b - 1);
                int d = string1.indexOf('e');
                int e = string.indexOf("g");
                int f = string.indexOf('a', 1);
                boolean g = string.startsWith("abc");
                boolean h = string1.startsWith("efg", 4);
                boolean a1 = string.endsWith("g");
                
                
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(f);
                System.out.println(g);
                System.out.println(h);
                System.out.println(a1);
                        
        }

}
