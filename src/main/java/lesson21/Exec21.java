
package lesson21;

import java.util.ArrayList;
import java.util.Objects;

public class Exec21 {
        
        public static void main(String[] args) {
                
                ArrayList<Integer> list = new ArrayList<>();
                ArrayList<Integer> list2 = new ArrayList<>();
                ArrayList<StringBuilder> stringBuilders = new ArrayList<>();
                
                for (int i = 0; i < 10; i++) {
                        stringBuilders.add(i, new StringBuilder("*"));
                }
       
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
                
                list2.addAll(list);
                list.addAll(0, list2);
                
                for (int i = 0; i < list2.size(); i++) {
                        for (int j = 0; j < list.size(); j++) {
                                if (Objects.equals(list2.get(i), list.get(j))) {
                                        list.remove(j);
                                }
                        }
                }
                
                list.addAll(0, list2);
                
                for (StringBuilder sb : stringBuilders) {
                        sb.append('$');
                        sb.append('*');
                }
                
                list.clear();
                list2.clear();
                stringBuilders.clear();
                
                

                System.out.println(list);
                System.out.println(list2);
                System.out.println(stringBuilders);
                
                
        }

}
