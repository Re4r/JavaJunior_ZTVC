
package lesson16;

public class Exec16_2 {
        
        public static void main(String[] args) {
                
                String string = new String("HelloMeteor");
                
                String s = string.substring(3);
                String s1 = string.substring(3, 5);
                String s2 = string.replace('e', 'A');
                String s3 = string.replace("Hello", "GoodBye");
                String s4 = string.concat(s3);
                String s5 = s4.toLowerCase();
                
                System.out.println(s);
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
                System.out.println(s4);
                System.out.println(s5);
        }

}
