
package lesson5;

public class Lesson5 {
        
        public static void main(String[] args) {
                
                Summator summator = new Summator();
                int result = summator.sum(50, 60, 70);
                System.out.println(result);
                
                Car car = new Car();
                
                car.color = "Red";
                car.engine = "V6";
                car.speed = 60;
                
                car.acc(result);
                car.brake(50);
                car.info();
        }
    
   
}

class Summator {
        
        int sum(int x, int y, int z) {
                return x + y + z;
        }
}

class Car {
        
        String color;
        String engine;
        int speed;
        
        int acc(int x) {
                return speed += x;
        }
        
        int brake(int x) {
                return speed -= x;
        }
        
        void info() {
                System.out.println(color + " " + engine + " " + speed);
        }
}

