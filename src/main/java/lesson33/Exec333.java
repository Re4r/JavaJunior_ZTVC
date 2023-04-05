package lesson33;

import java.time.*;
import java.time.format.*;

public class Exec333 {

    public static void main(String[] args) {
        LocalDate ldt1 = LocalDate.now();
        LocalDate ldt2 = LocalDate.of(2024, Month.SEPTEMBER, 17);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        Period period = Period.ofMonths(1);
        Duration duration = Duration.ofDays(10);

    }
    
    static void workTrace(LocalDate ld, LocalDate ld1) {
        LocalDate date = ld;
        while (date.isBefore(ld1)) {
            
        }
    }

}
