package lesson30;

public class Exec304 {

    public static void main(String[] args) {
        Lion lion = new Lion(true, 2, 4);
        System.out.println(lion.isFur());
        System.out.println(lion.getPawCount());
        System.out.println(lion.getEyeCount());
    }
}

class Animal {

    private int pawCount;

    public Animal(int pawCount) {
        this.pawCount = pawCount;
        System.out.println("Constructor of Animal");
    }

    static {
        System.out.println("Ststic Init Of Animal");
    }

    {
        System.out.println("Non-Static Init of Animal");
    }

    public int getPawCount() {
        return pawCount;
    }

}

class Mammal extends Animal {

    private int eyeCount;

    public Mammal(int eyeCount, int pawCount) {
        super(pawCount);
        this.eyeCount = eyeCount;
        System.out.println("Constructor Of Mammal");
    }

    static {
        System.out.println("Ststic Init Of Mammal");
    }

    {
        System.out.println("Non-Static Init of Mammal");
    }

    public int getEyeCount() {
        return eyeCount;
    }

}

class Lion extends Mammal {

    private boolean fur;

    public Lion(boolean fur, int eyeCount, int pawCount) {
        super(eyeCount, pawCount);
        this.fur = fur;
        System.out.println("Constructor Of Lion");
    }

    static {
        System.out.println("Ststic Init Of Lion");
    }

    {
        System.out.println("Non-Static Init of Lion");
    }

    public boolean isFur() {
        return fur;
    }

}
