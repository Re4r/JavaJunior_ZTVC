package lesson25;

public class Exec25 {
    
    public static void main(String[] args) {
        Citizen citizen = new Citizen("Male",new StringBuilder("Alex"), 25, 75);
        citizen.setAge(24);
        citizen.setName(new StringBuilder("Philiz"));
        citizen.setWeight(80);
        
        citizen.getName().append("!!!");
        System.out.println(citizen.getAge());
        System.out.println(citizen.getName());
        
    }

}
