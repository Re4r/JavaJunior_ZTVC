
package lesson16;

public class Exec16_3 {
        
        public static void main(String[] args) {
                
                String string = "  HelloMeteor  ";
                String string1 = "TechnoRave";
                
                String string2 = string.trim().replace("Hello", string1.substring(0, 6));
                System.out.println(string2);
        }

}
