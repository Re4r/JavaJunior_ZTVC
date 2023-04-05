package lesson33;

import java.time.*;
import java.util.ArrayList;

public class Exec332 {
    
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.now();
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfYear());
        System.out.println(ld.getMonthValue());
    }

}
