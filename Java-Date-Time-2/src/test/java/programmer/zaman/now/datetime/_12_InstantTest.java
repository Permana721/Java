package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

/*
Sebelumnya, milliseconds direpresentasikan dengan tipe data long, di Java Date & Time API baru,
implementasi milliseconds direpresentasikan dalam class Instant
Instant juga sama seperti class Date, dia menggunakan milliseconds  setelah Unix EPOCH 1970-01-01T00:00:00Z
Artinya secara time zone, Instant menggunakan time zone UTC (00:00)
 */

public class _12_InstantTest {
    @Test
    void create() {
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochMilli(0);
        System.out.println(instant1);
    }

    @Test
    void modify() {
        Instant instant = Instant.now();
        Instant instant1 = instant.plusMillis(1000);
        Instant instant2 = instant.minusMillis(1000);

        System.out.println(instant);
        System.out.println(instant1);
        System.out.println(instant2);
    }

    @Test
    void get() {
        Instant instant = Instant.now();

        System.out.println(instant.toEpochMilli());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
        System.out.println(instant);
    }

    /*
    Karena Instant berisikan milisecond, jadi kita bisa lakukan konversi ke tipe data lainnya, seperti LocalDate,
    LocalTime dan ZonedLocalTime
    Namu karena Instant menggunakann time zone UTC,
    jadi kita perlu memberi tahu time zone apa yang akan kita gunakan ketika kita lakukan konversi
    Untuk melakuka konversi dari Instant ke tipe data lainnya,
    kita bisa menggunakan method ofInstant(instant, zone) ketika membuat object nya
     */
    @Test
    void fromInstant() {
        Instant instant = Instant.now();

        ZoneId zoneId = ZoneId.of("Asia/Jakarta");

        LocalTime localTime = LocalTime.ofInstant(instant, zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(zonedDateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant, zoneId);
        System.out.println(offsetDateTime);
    }

    /*
    Selain itu konversi juga bisa dilakukan ke Instant, dari tipe data LocalDateTime dan ZonedDateTime
    Namun karena Instant menggunakan time zone UTC,
    jadi kita perlu menambahkan ZoneOffset jika konversi dari tipe data yang tidak memiliki time zone
     */
    @Test
    void toInstant() {
        Instant instant = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant);

        Instant instant1 = ZonedDateTime.now().toInstant();
        System.out.println(instant1);

        Instant instant2 = OffsetDateTime.now().toInstant();
        System.out.println(instant2);
    }
}
