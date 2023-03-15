
package lesson11;

public class Executer {
        
        public static void main(String[] args) {
                
                Employee employee = new Employee("Trevor", 2000);
                
                System.out.println(employee.x2Salary());
                employee.giveSalary();
                System.out.println(employee.getSalary());
                
                Student student1 = new Student("Jannet", 3, 4.5);
                Student student2 = new Student("Falcon", 4, 3.8);
        }
}
