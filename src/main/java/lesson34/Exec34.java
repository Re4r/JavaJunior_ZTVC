package lesson34;

import java.util.ArrayList;

public class Exec34 {

    public static void main(String[] args) {

        Robot.factory(10);

    }

}

class Robot {

    private int weight;

    public Robot(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    static void factory(final int quantity) {
        ArrayList<Robot> robots = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            robots.add(new Robot(i * ((int) (Math.random() * 100))));
        }
        System.out.println(robots.get(0).getWeight());
    }

}
