
package lesson21;

import java.util.*;

public class Exec21_3 {
        
        public static void main(String[] args) {
                
                ArrayList<Integer> list = new ArrayList<>();
                
                for (int i = 0; i < 10; i++) {
                        list.add(i * ((int)(Math.random() * 10)));
                }
                
                Iterator<Integer> iterator = list.iterator();
                while (iterator.hasNext()) {
                        System.out.print(iterator.next() + " ");
                }
        }

}
