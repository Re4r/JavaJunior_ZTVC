
package homework.lesson25hw;

public class Exec25Hw {
    
    public static void main(String[] args) {
        Student student = new Student(new StringBuilder("Joseph"), 4, 5);
        student.showInfo();
        showStudentInfo(student);
        student.getName().append("QQQQ");
        student.showInfo();
        showStudentInfo(student);
        student.setName(new StringBuilder("Jannet"));
        student.setCourse(5);
        student.setGrade(4);
        showStudentInfo(student);
        
    }
    
    private static void showStudentInfo(Student student) {
        System.out.println(student.getName());
        System.out.println(student.getCourse());
        System.out.println(student.getGrade());
    }

}
