
package lesson8;

public class Tesv {
        
        private final int A;
        private final int B;
        
        private static int x;
        private static int y;

        public Tesv(int A, int B) {
                this.A = A;
                this.B = B;
        }
        
        public void info() {
                System.out.println(this.A);
                System.out.println(this.B);
        }
        
        public static int sum(int x, int y) {
                return x + y;
        }

}
