
package lesson21;

import java.util.ArrayList;

public class Exec21 {
        
        public static void main(String[] args) {
                
                ArrayList<Integer> list = new ArrayList<>();
                ArrayList<Integer> list2 = new ArrayList<>();
                
                for (int i = 0; i < 10; i++) {
                        list.add(i);
                }
                
                list.add(list.size(), (int)(Math.random() * 10));
                list.add(0, (int)(Math.random() * 10));
                
                for (int i = 0; i < list.size(); i++) {
                        list2.add(list.get(i));
                }
                
                for (int i = 0; i < list.size(); i++) {
                        list.set(i, i + 10);
                }
                
                for (int i = 0; i < list2.size(); i++) {
                        if (list2.get(i) % 2 == 0 && list.get(i) % 2 != 0) {
                                list2.remove(i);
                                list.remove(i);
                        }
                }
                
                
                
                System.out.println(list);
                System.out.println(list2);
                
                
        }

}
