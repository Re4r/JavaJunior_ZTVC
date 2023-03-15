
package lesson10;

import lesson9.Car;
import lesson8.*;

public class Lesson10 {
        public static void main(String[] args) {
                
                Car car = new Car("Red", "V6", 3400);
                car.showColor();
                
                Tesv tesv = new Tesv(45, 78);
                tesv.info();
                
                System.out.println(Lesson8.AXV);
                
                
        }
}
