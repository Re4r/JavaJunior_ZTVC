package lesson32;

public class Exec32 {

    public static void main(String[] args) {

        Tiger tiger = new Tiger();

        try {
            tiger.eat("banana");
        } catch (NotMeat nm) {
            System.out.println(nm);
        } finally {
            System.out.println("finally block");
            try {
                tiger.drink("juice");
            } catch (NotWater nw) {
                System.out.println(nw);
            }
        }

    }

}

class NotMeat extends RuntimeException {

    public NotMeat(String message) {
        super(message);
    }

}

class NotWater extends Exception {

    public NotWater(String message) {
        super(message);
    }

}

class Tiger {

    void eat(String item) throws NotMeat {
        if (!item.equals("meat")) {
            throw new NotMeat("Tiger don't eat " + item);
        } else {
            System.out.println("Tiger eats " + item);
        }
    }

    void drink(String item) throws NotWater {
        if (!item.equals("water")) {
            throw new NotWater("Tiger don't drink " + item);
        } else {
            System.out.println("Tiger drinks " + item);
        }
    }
}
