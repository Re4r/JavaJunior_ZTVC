
package homework.lesson8;

public class lesson8 {
        public static void main(String[] args) {
                
                Test.division(Test.multiply(2, 4, 6), 5);
                Test.remainder(Test.multiply(2, 4, 6), 5);
                
                Test2 test2 = new Test2();
                System.out.println(test2.circleArea(50));
                Test2.circleLength(60);
                test2.info(70);
        }
}

class Test {
        
        protected static int multiply(int a, int b, int c) {
                return a * b * c;
        }
        
        protected static void division(int x, int y) {
                System.out.println(x / y);
        }
        
        protected static void remainder(int x, int y) {
                System.out.println(x % y);
        }
}

class Test2 {
        
        public static final double PI = 3.14;
        
        public  double circleArea(double radius) {
                return PI * Math.pow(radius, 2);
        }
        
        public static double circleLength(double radius) {
                return 2 * PI * radius;
        }
        
        public void info(double radius) {
                System.out.println(circleArea(radius));
                System.out.println(circleLength(radius));
        }
}
