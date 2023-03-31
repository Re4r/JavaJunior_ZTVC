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

    }

}
