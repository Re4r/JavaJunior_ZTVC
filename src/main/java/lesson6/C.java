
package lesson6;

import lesson7.B;

public class C extends  B  {
        
        public static void main(String[] args) {
                C c = new C(100);
                c.show();
                B b = new B(100, 200, 200.8, 900);
                b.show();
                
        }

        public C(int id) {
                super(id);
        }
        
}
