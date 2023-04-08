package lesson35;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class Exec35 {

    public static void main(String[] args) {

    }

}

final class Unit {

    private String name;
    private int armor;

    public Unit(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getArmor() {
        return armor;
    }

}
