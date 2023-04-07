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
        
//        showAllEmployeeInf(emploees);
        
        employeeFilter(emploees, (x) -> x.getDepartment().equals("IT"));
        employeeFilter(emploees, (x) -> x.getSalary() > 200);
        employeeFilter(emploees, (x) -> x.getName().startsWith("A"));
        employeeFilter(emploees, (x) -> x.getName().endsWith("a"));

    }

    static void showCurrentEmployeeInf(Emploee e) {
        System.out.println("Name: " + e.getName());
        System.out.println("Department: " + e.getDepartment());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("------------------------");
    }

    static void showAllEmployeeInf(ArrayList<Emploee> emploees) {
        for (Emploee e : emploees) {
            showCurrentEmployeeInf(e);
        }
    }
    
    static void employeeFilter(ArrayList<Emploee> es, Predicate<Emploee> p) {
        for (Emploee e : es) {
            if (p.test(e)) {
                showCurrentEmployeeInf(e);
            }
        }
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
