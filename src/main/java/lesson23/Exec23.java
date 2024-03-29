
package lesson23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exec23 {
        
        public static void main(String[] args) {
                
                ArrayList<Integer> list1 = new ArrayList<>();
                ArrayList<Integer> list2 = new ArrayList<>();
                ArrayList<Integer> list3 = new ArrayList<>();
                ArrayList<Integer> list4 = new ArrayList<>();
                
                
                initializeOfLIst(list1);
                initializeOfLIst(list2);
                initializeOfLIst(list3);
                initializeOfLIst(list4);
                
                Object[] array = list1.toArray();
                Integer[] array2 = list2.toArray(Integer[]::new);
                
                System.out.println(Arrays.toString(array));
                System.out.println(Arrays.toString(array2));
                System.out.println("-----------------------------------------");

                List<Integer> subList = list1.subList(0, 3);
                System.out.println(subList);
                System.out.println("-----------------------------------------");
                
                System.out.println(list1);
                System.out.println(list2);
                list1.removeAll(list2);
                System.out.println(list1);
                System.out.println("-----------------------------------------");

                System.out.println(list3);
                System.out.println(list4);
                list3.retainAll(list4);
                System.out.println(list3);
                System.out.println("-----------------------------------------");
                
                System.out.println(list1.containsAll(list2));
                System.out.println(list3.containsAll(list4));
                System.out.println("-----------------------------------------");
                
                List list5 = List.of(list1, list2, list3, list4);
                System.out.println(list5);
                List list6 = List.copyOf(list5);
                System.out.println(list6);
                System.out.println("-----------------------------------------");
                
                Map<Integer, String> map = new HashMap<>();
                int count = 0;
                while(count < 10) {
                        map.put(((int)(Math.random() * 10)), "one");
                        count++;
                }
                
                System.out.println(map);
                
                

        }
        
        static void initializeOfLIst(ArrayList<Integer> list) {
                for (int i = 0; i < 5; i++) {
                        list.add((int)(Math.random() * 10));
                }
        }

}
