
package lesson5;

public class Lesson5 {
        
        public static void main(String[] args) {
                
                Summator summator = new Summator();
                
                int result = summator.sum(50, 60, 70);
                int result2 = summator.average(10, 20, 30);
                
                System.out.println(result);
                System.out.println(result2);
                
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
        
        int average(int x, int y, int z) {
                return sum(x, y, z) / 3;
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

