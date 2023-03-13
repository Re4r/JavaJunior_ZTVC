
package lesson7;

public class B {
        
        public int id;
        private int year;
        double salary;
        protected int number;
        
        public B(int id) {
                this.id = id;
        }
        
        private B(int id, int year) {
                this.id = id;
                this.year = year;
        }
        
        B(int id, int year, double salary) {
                this.id = id;
                this.year = year;
                this.salary = salary;
        }
        
        protected B(int id, int year, double salary, int number) {
                this.id = id;
                this.year = year;
                this.salary = salary;
                this.number = number;
        }
        
        public void show() {
                System.out.println(id);
                System.out.println(year);
                System.out.println(salary);
                System.out.println(number);
        }
        
        public int  getYear() {
                return year;
        }
        
        public void setYear(int year) {
                this.year = year;
        }
        
        
        

}
