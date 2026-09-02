package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class _9_ZodeId_ZoneOffsetTest {
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
