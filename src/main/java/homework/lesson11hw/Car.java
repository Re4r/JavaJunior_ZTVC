
package homework.lesson11hw;

public class Car {
        
        private String color;
        private String engine;
        private int numberOfDoors;

        public Car(String color, String engine, int numberOfDoors) {
                this.color = color;
                this.engine = engine;
                this.numberOfDoors = numberOfDoors;
        }

        public String getColor() {
                return color;
        }

        public int getNumberOfDoors() {
                return numberOfDoors;
        }
        
        public void changeNumbersOfDoors(int number) {
                this.numberOfDoors = number;
        }
        
        public static void changeColorsOfCars(Car car1, Car car2) {
                Car car3 = new Car(null, null, 0);
                car3.color = car1.color;
                car1.color = car2.color;
                car2.color = car3.color;
        }
}
