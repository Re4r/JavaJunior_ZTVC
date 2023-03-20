
package homework;

public class Clock {
        
        public static void main(String[] args) {
                time();
        }
        
        static void time() {
                OUTER: for (int i = 0; i < 6; i++) {
                        MIDDLE: for (int j = 0; j < 60; j++) {
                                INNER: for (int k = 0; k < 60; k++) {
                                                System.out.println(i + ":" + j + ":" + k);
                                                if (i > 1 && j % 10 == 0) {
                                                        break OUTER;
                                                } else if (k * i > j) {
                                                        continue MIDDLE;
                                                }
                                        }
                        }
                }
        }

}
