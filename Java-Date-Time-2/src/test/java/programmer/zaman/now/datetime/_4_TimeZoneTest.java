package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.stream.Stream;

/*
Class TimeZone merupakan representasi dari data time zone
Secara default, jika kita membuat object Calendar, dan tidak menggunakan TimeZone,
secara otomatis objectnya akan menggunakan default TimeZone, yaitu timezone sistem operasi yang kita gunakan.
Untuk mengetahui default time zone, kita bisa gunakan method TimeZone.getDefault()
Sedangkan jika ingin membuat object TimeZone, kita bisa gunakan method TimeZone.getTimeZone(“Zone ID”)
Untuk mengetahui semua zone id yang didukung oleh Java, kita bisa gunakan TimeZone.getAvailableIDs()
 */

public class _4_TimeZoneTest {
    @Test
    void create() {
        TimeZone timeZoneDefault = TimeZone.getDefault();
        System.out.println(timeZoneDefault);

        String[] availableIds = TimeZone.getAvailableIDs();
        for (String Id : availableIds) {
            System.out.println(Id);
        }
    }

    /*
    Class Date tidak memiliki method apapun untuk mendapatkan time zone atau mengubah time zone
    Secara default, saat kita membuat object Date, object tersebut akan menggunakan time zone default
     */
    @Test
    void date() {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
    }

    /*
    Berbeda dengan Date, di Calendar, informasi TimeZone yang bisa kita ubah
    Untuk mengubah time zone di Calendar, kita bisa menggunakan method setTimeZone()
     */
    @Test
    void calendar() {
        Calendar calendar = Calendar.getInstance();
        Calendar calendarGMT = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendarGMT.get(Calendar.HOUR_OF_DAY));

        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    }
}
