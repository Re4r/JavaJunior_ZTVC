
package lesson7;

public class A {
        
        public static void main(String[] args) {
                B b = new B(100, 200, 345.98, 456);
                b.show();
                b.setYear(1000);
                System.out.println(b.getYear());
        }
}
