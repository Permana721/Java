package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

/*
Di Date & Time API baru, terdapat class Year , YearMonth dan MonthDay
Seperti dari nama class nya, Year digunakan untuk tanggal yang hanya berisi data tahun,
dan YearMonth adalah tanggal yang berisi data tahun dan bulan, dan MonthDay adalah tanggal berisi bulan dan hari
Kenapa menggunakan Year? Kenapa tidak langsung menggunakan angka saja?
Misal 2020. Di Year, sudah banyak sekali method yang bisa kita gunakan untuk manipulasi data tanggal dan konversi ke
tipe lain seperti LocalDate misal nya
Begitu juga dengan YearMonth dan MonthDay
Format default untuk Year adalah yyyy dan format untuk YearMonth adalah yyyy-MM dan format untuk MonthDay adalah --MM-dd
 */

public class _8_YearYearmonthMonthdayTest {
    @Test
    void create() {
        Year year = Year.now();
        Year year1 = Year.of(1980);
        Year year2 = Year.parse("2020");

        System.out.println(year);
        System.out.println(year1);
        System.out.println(year2);

        YearMonth yearMonth = YearMonth.now();
        YearMonth yearMonth1 = YearMonth.of(1980, Month.JUNE);
        YearMonth yearMonth2 = YearMonth.parse("2020-09");

        System.out.println(yearMonth);
        System.out.println(yearMonth1);
        System.out.println(yearMonth2);

        MonthDay monthDay = MonthDay.now();
        MonthDay monthDay1 = MonthDay.of(Month.DECEMBER, 18);
        MonthDay monthDay2 = MonthDay.parse("--10-09");

        System.out.println(monthDay);
        System.out.println(monthDay1);
        System.out.println(monthDay2);
    }

    @Test
    void name() {
        Year year = Year.now();
        System.out.println(year);

        LocalDate localDate = year.atMonth(Month.DECEMBER).atDay(19);
        System.out.println(localDate);

        MonthDay monthDay = MonthDay.from(localDate);
        System.out.println(monthDay);
    }

    @Test
    void get() {
        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();

        System.out.println(year.getValue());
        System.out.println(yearMonth.getYear());
        System.out.println(yearMonth.getMonth());
        System.out.println(monthDay.getMonth());
        System.out.println(monthDay.getDayOfMonth());
    }
}
