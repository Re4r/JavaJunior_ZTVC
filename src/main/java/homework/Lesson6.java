
package homework;

public class Lesson6 {
        
        public static void main(String[] args) {
                
                Summator summator = new Summator();
                System.out.println(summator.sum());
                System.out.println(summator.sum(1));
                System.out.println(summator.sum(1, 2));
                System.out.println(summator.sum(1, 2, 3));
                System.out.println(summator.sum(1, 2, 3, 4));
                
                Student student1 = new Student();
                Student student2 = new Student(1245, 4);
                Student student3 = new Student(4567, "Johanna", 5);
                
        }

}

class Summator {
        
        int sum() {
                return 0;
        }
        
        int sum(int a) {
                return a;
        }
        
        int sum(int a, int b) {
                return a + b;
        }
        
        int sum(int a, int b, int c) {
                return a + b + c;
        }
        
        int sum (int a, int b, int c, int d) {
                return a + b + c + d;
        }
}

class Student {
        
        int id;
        String name;
        int course;
        
        Student(int id, String name, int course) {
                this.id = id;
                this.name = name;
                this.course = course;
        }
        
        Student(int id, int course) {
                this(id, null, course);
        }
        
        Student() {
                this(0, null, 0);
        }
}
