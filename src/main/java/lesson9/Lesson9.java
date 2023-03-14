
package lesson9;

import java.util.logging.Logger;

public class Lesson9 {
        public static void main(String[] args) {
                
                Car car1 = new Car("Red", "V8", 2500);
                car1.showColor();
                car1.changePrice("Orange");
                car1.setColor("Grey");
                System.out.println(car1.getColor());
               
        }
}

class Car {
        
        private static int count;
        private String color;
        private String engine;
        private int price;

        public Car(String color, String engine, int price) {
                this.color = color;
                this.engine = engine;
                this.price = price;
                count++;
        }

        public String getColor() {
                return color;
        }

        public String getEngine() {
                return engine;
        }

        public int getPrice() {
                return price;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public void setEngine(String engine) {
                this.engine = engine;
        }

        public void setPrice(int price) {
                this.price = price;
        }
        
        
        
        public void showColor() {
                System.out.println("Color: " + color);
        }
        
        public void changePrice(String color) {
                this.color = color;
                price += 1000;
                System.out.println("New color: " + color);
                System.out.println("New price: " + price);
        }

} 
