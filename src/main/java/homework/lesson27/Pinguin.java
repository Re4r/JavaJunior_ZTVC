package homework.lesson27;

public class Pinguin extends Bird implements Speakable {

    private String name;

    public Pinguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void fly() {

    }

    @Override
    void eat() {

    }

    @Override
    void sleep() {

    }

    @Override
    public void speak() {
        super.speak();
    }

}
