
package lesson14;

public class Exec14 {
        
        public static void main(String[] args) {
                
                for (int i = 0; i < 100; i++) {
                        if (i == 50) {
                                break;
                        } else if (i % 2 == 0) {
                                System.out.println(i);
                        }
                }
        }
}
