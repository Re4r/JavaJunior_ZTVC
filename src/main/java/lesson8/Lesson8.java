
package lesson8;

public class Lesson8 {

        public static void main(String[] args) {
                
                Test test = new Test(100, 300);
                final Test test2 = new Test(250, 350);
                test = new Test(100, 1000);
                
                System.out.println(test.A + test.B);
                System.out.println(test2.A - test2.B);
                
                Class<Test> aClass = Test.class;
                System.out.println(aClass);
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
