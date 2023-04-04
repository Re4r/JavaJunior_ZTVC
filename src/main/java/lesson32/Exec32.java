package lesson32;

public class Exec32 {

    public static void main(String[] args) {
        
        Tiger tiger = new Tiger();
        tiger.eat("meat");
        try {
            tiger.drink("water");
            try {
                tiger.drink("beer");
            } catch (NotWater nw) {
                nw.getMessage();
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println("This is finally block");
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

    void eat(String item) {
        if (!item.equals("meat")) {
            throw new NotMeat("Tiger don't eat " + item);
        } else {
            System.out.println("Tiger eats " + item);
        }
    }

    void drink(String item) throws NotWater{
        if (!item.equals("water")) {
            throw new NotWater("Tiger don't drink " + item);
        } else {
            System.out.println("Tiger drinks " + item);
        }
    }
}
