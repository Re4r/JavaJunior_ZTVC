
package lesson12;

public class Exec {
        public static void main(String[] args) {
                
                Car car1 = new Car(8, 4);
                Car car2 = new Car(6, 2);
                
                if (car1.getEngine() > car2.getEngine()) {
                        if (car1.getDoorCount() > car2.getDoorCount()) {
                                Car.setGrade(100);
                        } else {
                                Car.setGrade(50);
                        }
                } else {
                        Car.setGrade(80);
                }
                
                System.out.println(Car.getGrade());
        }
}
