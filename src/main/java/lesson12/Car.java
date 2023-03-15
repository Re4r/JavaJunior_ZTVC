
package lesson12;

public class Car {
        
        private static int grade;
        
        private int engine;
        private int doorCount;

        public Car(int engine, int doorCount) {
                this.engine = engine;
                this.doorCount = doorCount;
        }

        public int getEngine() {
                return engine;
        }

        public int getDoorCount() {
                return doorCount;
        }

        public static int getGrade() {
                return grade;
        }

        public static void setGrade(int grade) {
                Car.grade = grade;
        }
        
        
        

}
