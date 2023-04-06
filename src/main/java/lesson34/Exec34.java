package lesson34;

import java.util.ArrayList;

public class Exec34 {

    public static void main(String[] args) {

        var robots = Robot.factory(10);
        Robot.showItems(robots);
        var filteredRobots = Robot.weightFilter(robots, ((r) -> r.getWeight() > 100 && r.getWeight() < 300));
        Robot.showItems(filteredRobots);

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

    static ArrayList<Robot> factory(final int quantity) {
        ArrayList<Robot> robots = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            robots.add(new Robot(i * ((int) (Math.random() * 99))));
        }
        return robots;
    }

    static ArrayList<Robot> weightFilter(ArrayList<Robot> alr, Filtration filtration) {
        ArrayList<Robot> frs = new ArrayList<>();
        for (Robot r : alr) {
            if (filtration.filter(r)) {
                frs.add(r);
            }
        }
        return frs;
    }

    static void showItems(ArrayList<Robot> robots) {
        ArrayList<Integer> is = new ArrayList<>();
        for (Robot r : robots) {
            is.add(r.getWeight());
        }
        System.out.println(is.toString());
    }

}

@FunctionalInterface
interface Filtration {

    boolean filter(Robot robot);
}
