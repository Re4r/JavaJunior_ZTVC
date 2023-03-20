
package lesson15;

public class ClockWhileLoop {
        
        public static void main(String[] args) {
                time();
                //time2();
                //time3();
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
        
        private static void time2() {
                int hour = 0;
                OUTER: while(hour < 24) {
                        int minute = 0;
                        INNER: while (minute < 60) {
                                System.out.println(hour + ":" + minute);
                                minute++;
                        }
                        hour++;
                }
        }
        
        private static void time3() {
                for (int i = 0; i < 24; i++) {
                        int j = 0;
                        while (j < 60) {                                
                                System.out.println(i + ":" + j);
                                j++;
                        }
                }
        }

}
