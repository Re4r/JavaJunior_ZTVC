package homework.lesson27;

abstract class Fish extends Animal {

    private String name;

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("Fish Sleep");
    }
    
    abstract void swim();

}
