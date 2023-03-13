
package homework;

public class Lesson5 {
        public static void main(String[] args) {
                BankAccount account = new BankAccount(123, "Joseph", 234.75);
                account.refillBalance(45.9);
                account.withdrawal(63.2);
        }
}

class BankAccount {
        
        int id;
        String name;
        double balance;
        
        BankAccount(int id, String name, double balance) {
                this.id = id;
                this.name = name;
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
