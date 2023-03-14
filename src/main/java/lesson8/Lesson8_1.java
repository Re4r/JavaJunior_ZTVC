
package lesson8;

public class Lesson8_1 {
        public static void main(String[] args) {
                
                Student student1 = new Student("Alex", 1);
                Student student2 = new Student("Vira", 2);
                Student student3 = new Student("Mike", 3);
                
                student1.showInfo();
                student2.showInfo();
                student3.showInfo();
                
                Student.showCount();
                
                Class<Student> aClass = Student.class;
                System.out.println(aClass);
                
        }
}

class Student {
        
        String name;
        int course;
        static int count;
        
        public Student(String name, int course) {
                this.name = name;
                this.course = course;
                count++;
                System.out.println("Student: " + count + " created");
                
        }
        
        public static void showCount() {
                System.out.println("Count: " + count);
        }
        
        public void showInfo() {
                count++;
                System.out.println("Student: " + count + " created");
        }
        
        
}
