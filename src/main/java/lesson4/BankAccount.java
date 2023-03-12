
package lesson4;

public class BankAccount {
    
        int id;
        String name;
        double balance;
        
    public static void main(String[] args) {
       
        BankAccount bankAccount = new BankAccount();
        
        bankAccount.id = 100;
        bankAccount.name = "John";
        bankAccount.balance = 324.45;
        
        System.out.println(bankAccount);
       
    }
}
