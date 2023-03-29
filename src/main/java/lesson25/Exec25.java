package lesson25;

public class Exec25 {

    public static void main(String[] args) {
        Citizen citizen = new Citizen("Male", new StringBuilder("Alex"), 25, 75);
        citizen.setAge(24);
        citizen.setName(new StringBuilder("Philiz"));
        citizen.setWeight(80);

        citizen.getName().append("!!!");
        System.out.println(citizen.getAge());
        System.out.println(citizen.getName());

        Postman postman = new Postman("Male", new StringBuilder("Tony"), 37, 79);
        Spaceman spaceman = new Spaceman("Female", new StringBuilder("Lara"), 44, 67);
        
        postman.walk();
        postman.stop();
        postman.mailDelivery();
        
        spaceman.walk();
        spaceman.stop();
        spaceman.spaceTraveling();

    }
}

class Postman extends Citizen {

    public Postman(String sex, StringBuilder name, int age, int weight) {
        super(sex, name, age, weight);
    }

    public void mailDelivery() {
        System.out.println("Mail delivered");
    }
}

class Spaceman extends Citizen {

    public Spaceman(String sex, StringBuilder name, int age, int weight) {
        super(sex, name, age, weight);
    }

    public void spaceTraveling() {
        System.out.println("Welcome to moon");
    }
}
