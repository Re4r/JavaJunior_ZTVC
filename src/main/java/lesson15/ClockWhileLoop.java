
package lesson15;

public class ClockWhileLoop {
        
        public static void main(String[] args) {
                time();
        }
        
        private static void time() {
                int hour = 0;
                OUTER: do {
                        int minute = 0;
                        INNER: while (minute < 60) {
                                System.out.println(hour + ":" + minute);
                                minute++;
                        }
                        hour++;
                } while (hour < 24);
        }

}
