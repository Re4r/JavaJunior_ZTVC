package lesson30;

import java.util.Objects;

public class Exec30 {

    public static void main(String[] args) {

        Car c1 = new Car("Red", "V8");
        Car c2 = new Car("Red", "V8");
        Car c3 = new Car("Black", "V6");

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println("-----------");
        System.out.println(c1);

    }

}

class Car {

    private final String color;
    private final String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.color);
        hash = 97 * hash + Objects.hashCode(this.engine);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return Objects.equals(this.engine, other.engine);
    }

    @Override
    public String toString() {
        return "Car{" + "color=" + color + ", engine=" + engine + '}';
    }

}
