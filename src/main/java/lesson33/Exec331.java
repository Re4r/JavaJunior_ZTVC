package lesson33;

import java.time.*;

public class Exec331 {
    
    public static void main(String[] args) {
        
        LocalDate ld1 = LocalDate.of(2023, Month.JANUARY, 1);
        LocalDate ld2 = LocalDate.of(2024, Month.DECEMBER, 31);
        Period p = Period.ofMonths(1);
        
        changeModule(ld1, ld2, p);
        
    }
    
    static void changeModule(LocalDate start, LocalDate finish, Period period) {
        LocalDate ld = start;
        while (ld.isBefore(finish)) {
            System.out.println("Date: " + ld + " - Module Changed");
            ld = ld.plus(period);
        }
    }

}
