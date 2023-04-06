package lesson34;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Comparator;

public class Exec34 {

    public static void main(String[] args) {

        var robots = Robot.factory(20);
        System.out.println(Robot.showItems(robots));
        robots.sort(Comparator.comparing(Robot::getWeight));
        System.out.println(Robot.showItems(robots));
        robots.sort(Comparator.comparing(Robot::getWeight).reversed());
        System.out.println(Robot.showItems(robots));
        var filteredRobots = Robot.weightFilter(robots, ((r) -> r.getWeight() > 100 && r.getWeight() < 500));
        System.out.println(Robot.showItems(filteredRobots));
        System.out.println("------------------------------------------------");
        var experimet = Robot.factory(20);
        experimet.sort(Comparator.comparing(Robot::getWeight));
        System.out.println(Robot.showItems(experimet).toString());
        experimet.removeIf((x) -> x.getWeight() > 300);
        System.out.println(Robot.showItems(experimet));

    }

}

class Robot {

    private final int weight;

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

    static ArrayList<Robot> weightFilter(ArrayList<Robot> alr, Predicate<Robot> predicate) {
        ArrayList<Robot> frs = new ArrayList<>();
        for (Robot r : alr) {
            if (predicate.test(r)) {
                frs.add(r);
            }
        }
        return frs;
    }

    static ArrayList<Integer> showItems(ArrayList<Robot> robots) {
        ArrayList<Integer> is = new ArrayList<>();
        for (Robot r : robots) {
            is.add(r.getWeight());
        }
        return is;
    }

}
