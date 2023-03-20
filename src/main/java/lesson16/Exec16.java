
package lesson16;

public class Exec16 {
        
        public static void main(String[] args) {
                CarColor carColor = new CarColor("Orange");
                CarColor carColor1 = carColor.changeColorObject("Red");
                
                System.out.println(carColor.getColor());
                System.out.println(carColor1.getColor());
                
                
        }

}
