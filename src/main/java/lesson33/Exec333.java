package lesson33;

import java.time.*;
import java.time.format.*;

public class Exec333 {

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now().now();
        LocalDateTime ldt2 = LocalDateTime.of(2025, Month.MARCH, 10, 22, 37);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        Period period = Period.ofMonths(1);
        Duration duration = Duration.ofDays(1);
        System.out.println(duration);

        workTrace(ldt1, ldt2, period, duration);

    }

    static void workTrace(LocalDateTime ld, LocalDateTime ld1, Period p, Duration d) {
        LocalDateTime date = ld;
        LocalDateTime date2 = ld1;
        while (date.isBefore(date2)) {
            System.out.println("From: " + date + "To: " + date2);
            date = date.plus(p);
            date2 = date2.minus(d);
        }
    }

}
