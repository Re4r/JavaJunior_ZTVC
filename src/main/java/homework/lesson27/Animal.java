package homework.lesson27;

abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void eat();

    abstract void sleep();

}
