
package lesson11;

public class Employee {
        
        private final String name;
        private double salary;

        public Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
        }

        public double getSalary() {
                return salary;
        }
        

        public double x2Salary() {
                return Math.pow(salary, 2);
        }
        
        public void giveSalary() {
                this.salary = x2Salary();
        }
}
