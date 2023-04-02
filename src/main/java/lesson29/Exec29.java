package lesson29;

public class Exec29 {

    public static void main(String[] args) {

    }

}

abstract class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public Employee(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(name + " sleeps");
    }

    abstract void work();

}

interface Helpable {

    void help();
}

class Driver extends Employee {

    public Driver(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("Driver " + this.getName() + " works");
    }

    @Override
    void sleep() {
        super.sleep();
    }

}
