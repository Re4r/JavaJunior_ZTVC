
package homework.lesson12hw;

public class Student {
        
        private String name;
        private int course;
        private double averageGrade;

        public Student(String name, int course, double averageGrade) {
                this.name = name;
                this.course = course;
                this.averageGrade = averageGrade;
        }

        public String getName() {
                return name;
        }

        public int getCourse() {
                return course;
        }

        public double getAverageGrade() {
                return averageGrade;
        }
        
        void equalStudents1(Student st1, Student st2) {
                if (st1.equals(st2)) {
                        System.out.println("Students are equal");
                } else {
                        System.out.println("Students are not equal");
                }
        }
        
        void equalStudents2 (Student st1, Student st2) {
                if (st1.getName().equals(st2.getName())) {
                        if (st1.getCourse() == st2.getCourse()) {
                                if (st1.getAverageGrade() == st2.getAverageGrade()) {
                                        System.out.println("Studets are fully equal");
                                } else {
                                        System.out.println("Average grade are differ");
                                }
                        } else {
                                System.out.println("Course are differ");
                        }
                } else {
                        System.out.println("Names are differ");
                } 
        }

}
