package lesson33;

import java.time.*;
import java.time.format.*;


public class Exec332 {
    
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        System.out.println(ld.format(dtf));

    }

}
