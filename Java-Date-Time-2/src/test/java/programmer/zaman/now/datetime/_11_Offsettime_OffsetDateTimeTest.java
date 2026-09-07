package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

/*
Java Date & Time API memiliki class yang bernama OffsetTime dan OffsetDateTime
Class OffsetTime adalah seperti LocalTime, namun memiliki time zone offset
Dan Class OffsetDateTime adalah seperti LocalDateTime, namun memiliki time zone offset
Sekilas OffsetDateTime mirip dengan ZonedDateTime,
yang membedakan adalah kalo OffsetDateTime hanya bisa menggunakan ZoneOffset, tidak bisa menggunakan ZoneId
Format default OffsetTime adalah HH:mm:ss(+/-)ZoneOffset
Format default OffsetDateTime adalah yyyy-MM-ddTHH:mm:ss(+/-)ZoneOffset
 */

public class _11_Offsettime_OffsetDateTimeTest {
    @Test
    void create() {
        OffsetTime offsetTime = OffsetTime.now();
        OffsetTime offsetTime1 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetTime offsetTime2 = OffsetTime.of(10, 10, 10, 10, ZoneOffset.ofHours(7));
        OffsetTime offsetTime3 = OffsetTime.parse("09:09:09.100+07:00");

        System.out.println(offsetTime);
        System.out.println(offsetTime1);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime offsetDateTime1 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));
        OffsetDateTime offsetDateTime3 = OffsetDateTime.parse(("1980-09-17T10:10:10.100+05:00"));

        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);
        System.out.println(offsetDateTime3);
    }

    /*
    Apa yang bisa kita lakukan di LocalTime dan LocalDateTime bisa juga dilakukan di OffsetTime dan OffsetDateTime
    Selain itu kita juga bisa konversi data dari dan ke non offset
     */

    @Test
    void toLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetTime);

        LocalTime localTime1 = offsetTime.toLocalTime();
        System.out.println(localTime1);
    }

    @Test
    void toLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetDateTime);

        LocalDateTime localDateTime1 = offsetDateTime.toLocalDateTime();
        System.out.println(localDateTime1);
    }
}
