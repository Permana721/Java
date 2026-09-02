package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.stream.Stream;

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

    @Test
    void date() {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
    }

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
