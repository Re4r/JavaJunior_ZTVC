package homework.lesson27;

public class Pinguin extends Bird {

    private String name;

    public Pinguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void fly() {
        System.out.println("Pinguin Fly");
    }

    @Override
    void eat() {
        System.out.println("Pinguin Eats");
    }

    @Override
    void sleep() {
        System.out.println("Pinguin Sleeps");
    }

    @Override
    public void speak() {
        super.speak();
    }

}
