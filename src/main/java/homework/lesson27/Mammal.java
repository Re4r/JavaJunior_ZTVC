package homework.lesson27;

abstract class Mammal extends Animal implements Speakable{

    private String name;

    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();

}
