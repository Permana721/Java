package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

/*
Pada class LocalDateTime, secara default tidak ada informasi time zone sama sekali pada class tersebut
Jika kita ingin membuat tanggal dan waktu yang mendukung time zone, kita bisa menggunakan class ZonedDateTime
Class ZonedDateTime sama seperti LocalDateTime, perbedaannya hanyalah mendukung time zone
Format default untuk ZonedDateTime adalah yyyy-MM-ddTHH:mm:ss.nano(+/-)ZoneOffset[ZoneId],
dimana ZoneId tidak wajib, dan jika ZoneId diisi, maka nilai ZoneOffset akan di hiraukan
 */

public class _10_ZonedDateTime {
    @Test
    void create() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Jakarta"));
        ZonedDateTime zonedDateTime2 = zonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneOffset.ofHours((5)));

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }

    @Test
    void parsing() {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("1980-10-10T10:10+07:00[Asia/Jakarta]");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("1980-10-10T10:10:10+05:00");

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
    }

    /*
    Untuk mengubah time zone pada ZonedDateTime, terdapat dua cara
    Pertama, mengubah time zone, tanpa merubah tanggal dan waktu.
    Caranya dengan menggunakan method withZoneSameLocal(ZoneId)
    Kedua, mengubah time zone, sehingga tanggal dan waktu mengikuti timezone yang baru.
    Caranya dengan menggunakan method withZoneSameInstance(ZoneId)
     */
    @Test
    void changeZoneId() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameLocal(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime2 = zonedDateTime.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
    }
}
