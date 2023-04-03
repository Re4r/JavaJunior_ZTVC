package lesson30;

public class Exec304 {

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

}
