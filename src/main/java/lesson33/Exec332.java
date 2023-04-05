package lesson33;

import java.time.*;
import java.time.format.*;

public class Exec332 {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        System.out.println(ld);
        System.out.println(ld.format(dtf));
        LocalTime lt = LocalTime.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_TIME;
        System.out.println(lt);
        System.out.println(lt.format(dtf1));
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt);
        System.out.println(ldt.format(dtf2));
        System.out.println(ldt.format(dtf));
        System.out.println(ldt.format(dtf1));
        DateTimeFormatter dtf3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter dtf4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
        System.out.println(ld);
        System.out.println(ld.format(dtf3));
        System.out.println(ldt);
        System.out.println(ldt.format(dtf4));

    }

}
