
package lesson14;

public class Clock {
        
        public static void main(String[] args) {
                
                time();
              
        }
        
        static void time() {
                for (int i = 0; i < 24; i++) {
                        System.out.println("start of outer loop...");
                        for (int j = 0; j < 60; j++) {
                                System.out.println(i + " : " + j);
                        }
                        System.out.println("end of outer loop");
                }
        }
}
