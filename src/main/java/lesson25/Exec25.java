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

}
