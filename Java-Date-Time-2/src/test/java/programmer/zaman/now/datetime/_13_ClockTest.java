package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class _13_ClockTest {
    @Test
    void create() {
        Clock clock = Clock.systemUTC();
        System.out.println(clock);

        Clock clock1 = Clock.systemDefaultZone();
        System.out.println(clock1);

        Clock clock2 = Clock.system(ZoneId.of("Asia/Jakarta"));
        System.out.println(clock2);
    }

    @Test
    void instant() throws InterruptedException {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Instant instant = clock.instant();
        System.out.println(instant);

        Thread.sleep(1000);

        Instant instant1 = clock.instant();
        System.out.println(instant1);
    }

    @Test
    void fromClock() {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Year year = Year.now(clock);
        System.out.println(year);

        YearMonth yearMonth = YearMonth.now(clock);
        MonthDay monthDay = MonthDay.now(clock);
        LocalTime localTime = LocalTime.now(clock);
        LocalDateTime localDateTime = LocalDateTime.now(clock);
        OffsetTime offsetTime = OffsetTime.now(clock);
        OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(clock);

        System.out.println(yearMonth);
        System.out.println(monthDay);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(offsetTime);
        System.out.println(offsetDateTime);
        System.out.println(zonedDateTime);
    }
}
