package homework.lesson25_2;

public class Dog extends Pet{

    public Dog(String name, boolean tail, int pawCount, int eyesCount) {
        super(name, tail, pawCount, eyesCount);
    }
    
    public void play() {
        System.out.println("Dog Plays");
    }

}
