
package lesson18;

public class Exec18 {
        
        public static void main(String[] args) {
                
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder("HelloMeteor");
                StringBuilder sb3 = new StringBuilder("Type");
                StringBuilder sb4 = new StringBuilder(sb2);
                
                sb2.append(sb4);
                sb2.insert(7, sb3);
                
                //System.out.println(sb4.subSequence(0, 7));
                System.out.println(sb2);
                
                
                
               
        }

}
