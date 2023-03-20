
package lesson16;

public class CarColor {
        
        private String color;

        public CarColor(String color) {
                this.color = color;
        }

        public String getColor() {
                return color;
        }
        
        
        
        CarColor changeColorObject(String color) {
                CarColor car = new CarColor(color);
                return car;
        }
       

}
