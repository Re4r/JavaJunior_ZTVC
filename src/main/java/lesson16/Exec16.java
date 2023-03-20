
package lesson16;

public class Exec16 {
        
        public static void main(String[] args) {
                
                String string = new String("Hello");
                String string1 = "Hello";
                
                int a = string.length();
                int b = string1.length();
                char c = string.charAt(b - 1);
                int d = string1.indexOf('e');
                int e = string.indexOf("llo");
                
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                        
        }

}
