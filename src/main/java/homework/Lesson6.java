
package homework;

public class Lesson6 {
        
        public static void main(String[] args) {
                
                Summator summator = new Summator();
                System.out.println(summator.sum());
                System.out.println(summator.sum(1));
                System.out.println(summator.sum(1, 2));
                System.out.println(summator.sum(1, 2, 3));
                System.out.println(summator.sum(1, 2, 3, 4));
                
        }

}

class Summator {
        
        int sum() {
                return 0;
        }
        
        int sum(int a) {
                return a;
        }
        
        int sum(int a, int b) {
                return a + b;
        }
        
        int sum(int a, int b, int c) {
                return a + b + c;
        }
        
        int sum (int a, int b, int c, int d) {
                return a + b + c + d;
        }
}
