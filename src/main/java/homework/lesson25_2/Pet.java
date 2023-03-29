package homework.lesson25_2;

public class Pet extends Animal {

    private String name;
    private boolean tail;
    private int pawCount;

    public Pet(String name, boolean tail, int pawCount, int eyesCount) {
        super(eyesCount);
        this.name = name;
        this.tail = tail;
        this.pawCount = pawCount;
        System.out.println("I am a Pet");
    }
    
    public void run() {
        System.out.println("Pet Runs");
    }
    
    public void jump() {
        System.out.println("Pet Jumps");
    }
    
    

}
