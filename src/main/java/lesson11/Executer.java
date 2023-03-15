
package lesson11;

public class Executer {
        public static void main(String[] args) {
                
                Employee employee = new Employee("Trevor", 2000);
                
                System.out.println(employee.x2Salary());
                employee.giveSalary();
                System.out.println(employee.getSalary());
        }
}
