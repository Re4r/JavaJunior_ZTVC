package homework.lesson25hw;

public class Student {
    
    private StringBuilder name;
    private int course;
    private int grade;

    public Student(StringBuilder name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(this.name);
        return sb;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public void showInfo() {
        System.out.println(this.name);
        System.out.println(this.course);
        System.out.println(this.grade);
    }


}
