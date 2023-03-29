package homework.lesson25_2;

public class Animal {

    private int eyesCount;

    public Animal(int eyesCount) {
        this.eyesCount = eyesCount;
        System.out.println("I am an Animal");
    }

    public void eat() {
        System.out.println("Animal Eat");
    }

    public void drink() {
        System.out.println("Animal Drink");
    }

}
