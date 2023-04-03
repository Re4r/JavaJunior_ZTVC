package lesson30;

public class Exec302 {

    private String name;

    public Exec302() {
        System.out.println("Empty Constructor");
    }

    public Exec302(String name) {
        this();
        this.name = name;
        System.out.println("Hello " + name + " from Constructor");
    }

    {
        System.out.println("Hello " + name + " from Initializer Block");
    }
    
    static {
        System.out.println("Hello from Static Initializer Block");
    }

    public static void main(String[] args) {

        Exec302 ex = new Exec302("Qwerty");
    }

}
