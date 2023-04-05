package lesson33;

import java.time.*;

public class Exec33 {
    
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println("-----------------");
        
        LocalDate ld1 = LocalDate.of(2023, 1, 31);
        LocalDate ld2 = LocalDate.of(2023, Month.JANUARY, 31);
        
        System.out.println(ld1);
        System.out.println(ld2);


            
    }

}
