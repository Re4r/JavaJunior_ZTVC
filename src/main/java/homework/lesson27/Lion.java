package homework.lesson27;

public class Lion extends Mammal {

    private String name;

    public Lion(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    void run() {
        System.out.println("Lion Runs");
    }

    @Override
    void eat() {
        System.out.println("Lion Eats");
    }

    @Override
    void sleep() {
        System.out.println("Lion Sleep");
    }

}
