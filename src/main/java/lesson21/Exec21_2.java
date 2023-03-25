
package lesson21;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.Arrays;

public class Exec21_2 {
        
        public static void main(String[] args) {
                
                StringBuilder sb = new StringBuilder("AA");
                StringBuilder sb2 = new StringBuilder("B");
                StringBuilder sb3 = new StringBuilder("C");
                           
                ArrayList<StringBuilder> list = new ArrayList<>();
                
                list.add(sb);
                list.add(sb2);
                list.add(sb3);
                
                ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list.clone();
                
                System.out.println(list);
                System.out.println(list2);
                System.out.println(list == list2);
                System.out.println(list.get(0) == list2.get(0));
                
                Object[] obj = list.toArray();
                StringBuilder[] sba = list2.toArray(new StringBuilder[5]);
                
                for (Object o : obj) {
                        System.out.println(o);
                }
                
                for (StringBuilder s : sba) {
                        System.out.println(s);
                }
                
                StringBuilder [] array = {sb, sb2, sb3};
                List<StringBuilder> list4 = Arrays.asList(sba);
                
                System.out.println(list4);
                
                
                
                
        }

}
