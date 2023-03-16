
package lesson14;

public class Exec14 {
        
        public static void main(String[] args) {
                
                for (int x = (int)(Math.random() * 10); x <= 10; x++, showTen(10)) {
                        System.out.println(x);
                }
        }
        
        static void showTen(int x) {
                System.out.println(x);
        }

}
