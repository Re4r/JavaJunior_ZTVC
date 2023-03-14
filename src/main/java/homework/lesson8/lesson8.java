
package homework.lesson8;

public class lesson8 {
        public static void main(String[] args) {
                
                Test.division(Test.multiply(2, 4, 6), 5);
        }
}

class Test {
        
        protected static int multiply(int a, int b, int c) {
                return a * b * c;
        }
        
        protected static void division(int x, int y) {
                System.out.println(x / y);
        }
}
