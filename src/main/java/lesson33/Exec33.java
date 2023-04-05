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
        LocalTime lt1 = LocalTime.of(22, 15);
        LocalTime lt2 = LocalTime.of(22, 15, 30);
        LocalTime lt3 = LocalTime.of(22, 15, 30, 999999999);
        LocalDateTime ldlt = LocalDateTime.of(ld2, lt3);

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(ldlt);

    }

}
