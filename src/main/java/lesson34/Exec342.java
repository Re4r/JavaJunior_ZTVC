package lesson34;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Exec342 {

    public static void main(String[] args) {
        
        ArrayList<Emploee> emploees = new ArrayList<>();
        emploees.add(new Emploee("Alex", "IT", 300));
        emploees.add(new Emploee("Susana", "Management", 150));
        emploees.add(new Emploee("Janet", "Administration", 130));
        emploees.add(new Emploee("Patrick", "Engeneering", 290));
        
        for (Emploee e : emploees) {
            showEmployeeInformation(e);
        }

    }

    static void showEmployeeInformation(Emploee e) {
        System.out.println("Name: " + e.getName());
        System.out.println("Department: " + e.getDepartment());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("------------------------");
    }
    
    

}

class Emploee {

    private String name;
    private String department;
    private int salary;

    public Emploee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

}
