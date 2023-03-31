package homework.lesson27;

public class Exec27 {

    public static void main(String[] args) {

        SwordFish swordFish = new SwordFish("Aalto");
        swordFish.eat();
        swordFish.swim();
        swordFish.sleep();
        System.out.println(swordFish.getName());

        Speakable pinguin = new Pinguin("Joip");
        pinguin.speak();

        Animal lion = new Lion("Figot");
        System.out.println(lion.getName());
        lion.eat();
        lion.sleep();

        Mammal lion2 = new Lion("Shotreu");
        System.out.println(lion2.getName());
        lion2.eat();
        lion2.run();
        lion2.speak();
        lion2.sleep();

    }

}
