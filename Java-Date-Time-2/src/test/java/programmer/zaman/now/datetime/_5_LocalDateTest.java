package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class _5_LocalDateTest {
    @Test
    void create() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(1980, Month.JANUARY, 10);
        LocalDate localDate2 = LocalDate.parse("1980-01-10");

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
    }

    @Test
    void with() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.withYear(1980);
        LocalDate localDate2 = localDate.withYear(1980).withMonth(1);

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
    }

    @Test
    void modify() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plusYears(10);
        LocalDate localDate2 = localDate1.minusMonths(10);

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
    }

    @Test
    void get() {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
    }
}
