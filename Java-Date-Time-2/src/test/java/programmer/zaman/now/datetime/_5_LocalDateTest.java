package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

/*
LocalDate adalah class di Date & Time API baru
LocalDate merupakan representasi untuk tipe data tanggal (tanpa waktu)
Default format waktu untuk LocalDate adalah yyyy-MM-dd
 */

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

    /*
    Object LocalDate juga bisa kita ubah tanggal nya jika kita mau
    Untuk mengubah tanggal, kita bisa menggunakan method with, seperti withYear, withMonth, dan lain-lain
    Perlu diingat, mengubah LocalDate akan menciptakan object LocalDate baru,
    artinya object aslinya tidak akan berubah, karena bersifat immutable
     */
    @Test
    void with() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.withYear(1980);
        LocalDate localDate2 = localDate.withYear(1980).withMonth(1);

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
    }

    /*
    Object LocalDate juga bisa kita manipulasi, seperti menambah tanggal atau mengurangi tanggal.
    Untuk menambah tanggal, kita bisa gunakan method plus, seperti plusYears, plusMonths, plusDays, dan lain-lain
    Untuk mengurangi tanggal, kita bisa gunakan method minus, seperti minusYears, minusMonths, minusDays, dan lain-lain
    Perlu diingat, manipulasi LocalDate akan menciptakan object LocalDate baru,
    artinya object aslinya tidak akan berubah, karena bersifat immutable
     */
    @Test
    void modify() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plusYears(10);
        LocalDate localDate2 = localDate1.minusMonths(10);

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
    }

    /*
    LocalDate juga mendukung pengambilan detail data tanggal nya, seperti tahun, bulan, hari dalam bulan, hari dalam tahun,
    dan lain-lain
    Untuk mengambil data tanggal, kita bisa menggunakan method get, seperti getYear, getMonth, dan lain-lain
     */
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
