
package homework;

public class Lesson4 {
    
    public static void main(String[] args) {
        
        Student student1 = new Student(10, "John", "Smith", 4.5, 4.7);
        
    }
    
    class Student {
        
        int studentPassNumber;
        String name;
        String surname;
        int yearOfStudying;
        double economyAverage;
        double foreignLanguageAverage;
        
        public Student(int spn, String n, String sn, int yos, double ea, double fla) {
            this.studentPassNumber = spn;
            this.name = n;
            this.surname = sn;
            this.yearOfStudying = yos;
            this.economyAverage = ea;
            this.foreignLanguageAverage = fla;
            
        }
    }

}
