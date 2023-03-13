
package lesson8;

public class Lesson8 {

        public static void main(String[] args) {
                
                Test test = new Test(100, 300);
                
                System.out.println(test.A + test.B);
        }
}

class Test {
        
        public final int A;
        public final int B;

        public Test(int A, int B) {
                this.A = A;
                this.B = B;
        }
}
