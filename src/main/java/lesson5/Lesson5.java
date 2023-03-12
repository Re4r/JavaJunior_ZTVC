
package lesson5;

public class Lesson5 {
        
        public static void main(String[] args) {
                
                Summator summator = new Summator();
                int result = summator.sum(4, 4, 4);
                System.out.println(result);
                
        }
    
   
}

class Summator {
        
        int sum(int x, int y, int z) {
                return x + y + z;
        }
}

