package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

/*
Sebelumnya kita sudah tahu bahwa terdapat class TimeZone di Java sebagai representasi time zone
Namun di Java Date & Time API terbaru, terdapat class baru untuk mendukung time zone, yaitu ZoneId dan ZoneOffset
 */

public class _9_ZodeId_ZoneOffsetTest {
    /*
    ZoneId mirip dengan TimeZone, dimana ini merupakan representasi time zone id
    Untuk mendapatkan default time zone, kita bisa menggunakan method ZoneId.systemDefault()
    Untuk membuat ZoneId, caranya bisa menggunakan method ZoneId.of(“Zone Id”)
    Dan untuk mendapatkan semua daftar time zone id yang didukung oleh Java, kita bisa menggunakan method
     */
    @Test
    void createZoneId() {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneIdGMT = ZoneId.of("GMT");
        System.out.println(zoneIdGMT);

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        zoneIds.forEach(s -> {
            System.out.println(s);
        });
    }

    /*
    Jika ZoneId merupakan representasi timezone menggunakan time zone id
    Pada class ZonenOffset, iin adalah format time zone dengan offset dari time zone Greenwich/UTC, misalnya +07:00 atau -01:00
    Untuk membuat ZoneOffset, kita bisa menggunakan method of
    ZoneOffset adalah turunan dari ZoneId, jadi semua parameter yang menerima object ZoneId, bisa kita isi dengan ZoneOffset
     */
    @Test
    void createZoneOffset() {
        ZoneOffset zoneOffset = ZoneOffset.of("+07:00");
        ZoneOffset zoneOffset1 = ZoneOffset.ofHours(7);
        ZoneOffset zoneOffset2 = ZoneOffset.ofHoursMinutes(7, 30);

        System.out.println(zoneOffset);
        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
    }
}
