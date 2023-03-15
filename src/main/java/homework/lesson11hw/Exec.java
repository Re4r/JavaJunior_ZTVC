
package homework.lesson11hw;

public class Exec {
        public static void main(String[] args) {
                
                Car car1 = new Car("Black", "V8", 4);
                Car car2 = new Car("Purple", "V6", 2);
                
                car1.changeNumbersOfDoors(8);
                car2.changeNumbersOfDoors(16);
                
                System.out.println(car1.getNumberOfDoors());
                System.out.println(car2.getNumberOfDoors());
        }
}
