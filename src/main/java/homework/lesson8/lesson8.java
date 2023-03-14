
package homework.lesson8;

public class lesson8 {
        public static void main(String[] args) {
                
                Test.division(Test.multiply(2, 4, 6), 5);
                Test.remainder(Test.multiply(2, 4, 6), 5);
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
        
        static double circleLength(double radius) {
                return 2 * PI * radius;
        }
        
        public void info()
}
