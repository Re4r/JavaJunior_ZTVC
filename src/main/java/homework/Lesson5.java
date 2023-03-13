
package homework;

public class Lesson5 {
        
        public static void main(String[] args) {
                
                BankAccount account = new BankAccount(123, 234.75);
                account.refillBalance(45.9);
                account.withdrawal(63.2);
                
                Student student = new Student(3.4, 4.8, 3.9);
                student.average();
                
                Employee employee = new Employee(3456789, 5400);
                employee.salaryDoublePump();
        }
}

class BankAccount {
        
        int id;
        double balance;
        
        BankAccount(int id, double balance) {
                this.id = id;
                this.balance = balance;
        }
        
        void refillBalance(double x) {
                balance += x;
                System.out.println("Account: " + id +  " replenished: " + "+" + x);
                System.out.println("Balance: " + balance);
        }
        
        void withdrawal(double x) {
                balance -= x;
                System.out.println("Account: " + id +  " withdrawal: " + "-" + x);
                System.out.println("Balance: " + balance);
        }       
}

class Student {
        
        double mathematicsAv;
        double physicsAv;
        double literatureAv;
        
        Student(double m, double p, double l) {
                this.mathematicsAv = m;
                this.physicsAv = p;
                this.literatureAv = l;
        }
        
        void average() {
                System.out.println("Average: " + (mathematicsAv + physicsAv + literatureAv));
        }
                
}

class Employee {
        
        int id;
        double salary;
        
        Employee(int id, double salary) {
                this.id = id;
                this.salary = salary;
        }
        
        void salaryDoublePump() {
                salary *= 2;
                System.out.println("id: " + id + "new salary: " + salary);
        }
}
