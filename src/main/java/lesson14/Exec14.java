
package lesson14;

public class Exec14 {
        
        public static void main(String[] args) {
                
                for (int x = (int)(Math.random() * 10); x <= 10; x++, delimeter()) {
                        System.out.println(x + showTen(10));
                }
        }
        
        static int showTen(int x) {
                return x;
        }
        
        static void delimeter() {
                System.out.println("-----");
        }

}
