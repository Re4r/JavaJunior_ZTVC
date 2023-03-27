
package homework.lesson21hw;

import java.util.*;
import lesson7.A;

public class Exec21Hw {
        
        public static void main(String[] args) {
                
                showResult(stringArrayGenerator());
  
        }
        
        static void showResult(String ... string) {
                
                ArrayList<String> list = new ArrayList<>();

                for (String item : string) {
                        list.add(item);
                }
                
                System.out.println(list);
                
                for (int i = 0; i < list.size(); i++) {
                        for (int j = 1; j < list.size(); j++) {
                                if (list.get(i).equals(list.get(j))) {
                                        list.remove(j);     
                                }
                        }
                }
                Collections.sort(list);
                System.out.println(list);    
        }
        
        static String stringGenerator() {              
               StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 5; i++) {
                        sb.append(i * ((int)(Math.random() * 10)));       
                }
                return new String(sb); 
        }
        
        static String[] stringArrayGenerator() {
                String[] str = new String[5];
                for (int i = 0; i < 5; i++) {
                        str[i] = stringGenerator();
                }
                return str;
        }

}
