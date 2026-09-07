package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/*
Seperti dari nama class nya, LocalDateTime, class ini digunakan sebagai representasi tanggal dan waktu, mirip seperti class Date
LocalDateTime juga immutable, jadi tidak bisa diubah setelah dibuat, jika diubah otomatis akan membuat object baru
Cara pembuatan, cara mengubah, memanipulasi nya pun sama seperti LocalDate dan LocalTime
Dan format default untuk LocalDateTime adalah menggunakan format yyyy-MM-ddTHH:mm:ss.nano
 */

public class _7_LocalDateTimeTest {
    @Test
    void create() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(1980, Month.JANUARY, 8, 10, 9, 10, 456);
        LocalDateTime localDateTime2 = LocalDateTime.parse("1980-01-08T10:09:10.456");

        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }

    @Test
    void with() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.withYear(1980).withMonth(1);
        LocalDateTime localDateTime2 = localDateTime.withYear(1980).withHour(9);

        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }

    @Test
    void modify() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusYears(5).minusHours(5);
        LocalDateTime localDateTime2 = localDateTime.minusYears(5).minusHours(5);

        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }

    @Test
    void get() {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());
    }

    /*
    Kadang ada kebutuhan kita melakukan konversi data dari LocalDate ke LocalDateTime atau juga sebaliknya
    Untuk melakukan konversi dari LocalDateTime ke LocalDate, kita bisa menggunakan method toLocalDate()
    Sedangkan untuk melakukan konversi dari LocalDate ke LocalDateTime, kita bisa mennggunakann method atTime()
     */
    @Test
    void date() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        LocalDateTime result = localDate.atTime(10, 10, 10, 10);
        System.out.println(result);
    }

    /*
    Selain melakukan konnversi untuk tipe data LocalDate, kita juga bisa lakukan ke dan dari tipe data LocalTime.
    Untuk melakukan konversi dari LocalDateTime ke LocalTime, kita bisa menggunakan method toLocalTime()
    Sedangkan untuk melakukan konversi dari LocalTime ke LocalDateTime, kita bisa mennggunakann method atDate()
     */
    @Test
    void time() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localDateTime);

        LocalDateTime result = localTime.atDate(LocalDate.now());
        System.out.println(result);
    }
}
