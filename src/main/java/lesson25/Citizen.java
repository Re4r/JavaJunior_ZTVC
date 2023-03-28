package lesson25;

public class Citizen {

    private String sex;
    private String name;
    private int age;
    private int weight;

    public Citizen(String sex, String name, int age, int weight) {
        this.sex = sex;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
}
