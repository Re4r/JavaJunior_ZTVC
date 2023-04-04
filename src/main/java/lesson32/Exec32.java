package lesson32;

public class Exec32 {

    public static void main(String[] args) {

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
    void eat(String item) {
        if (!item.equals("meat")) {
            throw new NotMeat("Tiger not eat " + item);
        } else {
            System.out.println("Tiger eats " + item);
        }
    }
}
