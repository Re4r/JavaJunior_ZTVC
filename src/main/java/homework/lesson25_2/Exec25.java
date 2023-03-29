package homework.lesson25_2;

public class Exec25 {
    public static void main(String[] args) {
        Dog dog = new Dog("Tiny", true, 4, 2);
        Cat cat = new Cat("Boon", true, 4, 2);
        
        dog.eat();
        dog.drink();
        dog.run();
        dog.jump();
        dog.play();
    }

}
