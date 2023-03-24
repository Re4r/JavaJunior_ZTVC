
package lesson21;

import java.util.ArrayList;

public class Exec21 {
        
        public static void main(String[] args) {
                
                ArrayList<Integer> list = new ArrayList<>();
                ArrayList<Integer> list2 = new ArrayList<>();
                
                for (int i = 0; i < 10; i++) {
                        list.add(i);
                }
                
                list.add(list.size(), 999);
                list.add(0, 111);
                
                for (int i = 0; i < list.size(); i++) {
                        list2.add(list.get(i));
                }
                
                System.out.println(list);
                System.out.println(list2);
                
                
        }

}
