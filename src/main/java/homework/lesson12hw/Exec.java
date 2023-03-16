
package homework.lesson12hw;

public class Exec {
        public static void main(String[] args) {
                
                Student st1 = new Student("Viktor", 5, 4.7);
                Student st2 = new Student("Viktor", 5, 3.8);
                //st1 = st2;
                
                Student.equalStudents1(st1, st2);
                Student.equalStudents2(st1, st2);
        }
}
