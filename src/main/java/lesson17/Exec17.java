
package lesson17;

public class Exec17 {
        
        public static void main(String[] args) {
                String s1 = "          Hello          ";
                System.out.println(s1.isBlank());
                String s2 = "         ";
                System.out.println(s2.isBlank());
                String s3 = "";
                System.out.println(s3.isEmpty());
                System.out.println(s1.strip());
                System.out.println(s1.stripLeading());
                System.out.println(s1.stripTrailing());
                
        }

}
