
package lesson14;

public class Clock {
        
        public static void main(String[] args) {
                
                time();
              
        }
        
        static void time() {
                OUTER: for (int i = 0; i < 24; i++) {
                        System.out.println("start of outer loop...");
                        INNER: for (int j = 0; j < 60; j++) {
                                
                                if (j == 40) {
                                        continue INNER;
                                }
                                
                                System.out.println(i + " : " + j);
                                
                                if (j == 50) {
                                        break OUTER;
                                }
                        }
                        System.out.println("end of outer loop");
                }
        }
}
