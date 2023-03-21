
package lesson18;

public class Exec18 {
        
        public static void main(String[] args) {
                
                StringBuilder sb1 = new StringBuilder("/////////");
                StringBuilder sb2 = new StringBuilder("HelloMeteor");
                StringBuilder sb3 = new StringBuilder("Type");
                StringBuilder sb4 = new StringBuilder(sb2);
                
                sb2.append(sb4);
                sb2.insert(7, sb3);
                sb2.insert(sb2.length(), sb1);
                sb2.delete(3, 8);
                sb2.deleteCharAt(11);
                sb2.reverse();
                sb2.replace(2, 5, "Pool");
                
                //System.out.println(sb4.subSequence(0, 7));
                System.out.println(sb2);
                System.out.println(sb2.capacity());
                System.out.println(sb2.length());
                System.out.println(sb4.capacity());
                System.out.println(sb3.capacity());
                
                
                
               
        }

}
