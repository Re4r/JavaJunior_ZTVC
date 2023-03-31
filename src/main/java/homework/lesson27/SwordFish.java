package homework.lesson27;

public class SwordFish extends Fish {

    private String name;

    public SwordFish(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    void swim() {
        System.out.println("SwordFish Swims");
    }

    @Override
    void eat() {
        System.out.println("SwordFish Eats");
    }

}
