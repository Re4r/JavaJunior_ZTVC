package homework.lesson25_2;

public class Cat extends Pet{

    public Cat(String name, boolean tail, int pawCount, int eyesCount) {
        super(name, tail, pawCount, eyesCount);
    }
    
    public void sleep() {
        System.out.println("Cat Sleeps");
    }

}
