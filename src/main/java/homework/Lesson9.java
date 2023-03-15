
package homework;

public class Lesson9 {
        public static void main(String[] args) {
                
                Test test1 = new Test();
                Test test2 = new Test();
                Test test3 = new Test();
                Test test4 = new Test();
                Test test5 = new Test();
                Test test6 = new Test();
                Test test7 = new Test();
                Test test8 = new Test();
                Test test9 = new Test();
                
                test1 = null;
                test2 = test1;
                test3 = test2;
                test4 = test3;
                test5 = test4;
                test6 = test5;
                test7 = test6;
                
                System.out.println(test9);
                System.out.println(test8);
                
                System.out.println("--------------------------------------------------------------------------------------------------");
                
                test8.abc(3);
                Test.abcd(5);
                test9.abcde(4);
                
                
        }
}

class Test {
        
        int a = 1;
        static int b = 2;
        
        void abc(int a) {
                System.out.println(a);
                System.out.println(this.a);
        }
        
        static void abcd(final int a) {
                System.out.println(a);
                System.out.println(b);
        }
        
        void abcde(int a) {
                System.out.println(b);
                System.out.println(a);
                System.out.println(this.a);
        }
}
