
package homework;

public class Student {
    
        int studentPassNumber;
        String name;
        String surname;
        int yearOfStudying;
        double economyAverage;
        double foreignLanguageAverage;
        double mathematics;
        
        public Student(int spn, String n, String sn, int yos, double ea, double fla, double mat) {
            this.studentPassNumber = spn;
            this.name = n;
            this.surname = sn;
            this.yearOfStudying = yos;
            this.economyAverage = ea;
            this.foreignLanguageAverage = fla;
            this.mathematics = mat;
            
        }
    
    public static void main(String[] args) {
        
        Student student1 = new Student(10, "John", "Smith", 2002, 4.5, 4.7, 3.8);
        Student student2 = new Student(11, "Alex", "Veron", 2003, 3.8, 3.5, 4.2);
        Student student3 = new Student(12, "Mike", "Tooet", 2004, 4.2, 3.4, 3.9);
        
        double average1 = (student1.economyAverage + student1.foreignLanguageAverage + student1.mathematics) / 3;
        double average2 = (student2.economyAverage + student2.foreignLanguageAverage + student2.mathematics) / 3;
        double average3 = (student3.economyAverage + student3.foreignLanguageAverage + student3.mathematics) / 3;
        
        System.out.println("Average: " + average1);
        System.out.println("Average: " + average2);
        System.out.println("Average: " + average3);
        
        
  
    }
}
