package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

/*
Berbeda dengan LocalDate, LocalTime merupakan representasi data waktu (tanpa tanggal)
Cara penggunaanya dan method-method nya hampir sama dengan LocalDate
LocalTime juga immutable,
jadi kita tidak bisa mengubahnya setelah datanya dibuat, jika kita ubah, maka akan menghasilkan object LocalTime baru
Format standard LocalTime adalah HH:mm:ss.nano, dimana second dan nano second nya optional
 */

public class _6_LocalTimeTest {
    @Test
    void create() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(10, 10, 10);
        LocalTime localTime2 = LocalTime.parse("08:08");

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }

    @Test
    void change() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = localTime.withHour(10);
        LocalTime localTime2 = localTime.withHour(5).withMinute(10).withSecond(0);

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }

    @Test
    void modify() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = localTime.plusHours(10);
        LocalTime localTime2 = localTime.plusHours(5).minusMinutes(10).minusSeconds(5);

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }

    @Test
    void get() {
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
    }
}
