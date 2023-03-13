
package lesson8;

public class Lesson8 {

        public static void main(String[] args) {
                
                Test test = new Test();
                
                System.out.println(test.A + test.B);

        }

}

class Test {
        
        public final int A = 10;
        public final int B = 20;
}
