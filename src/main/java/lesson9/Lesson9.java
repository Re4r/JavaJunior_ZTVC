
package lesson9;

public class Lesson9 {
        public static void main(String[] args) {
                
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
        
        public void changePrice() {
                
        }
        
        
} 
