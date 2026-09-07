package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

/*
Class Duration adalah representasi dari data durasi waktu
Durasi waktu yang terdapat di class Duration
Dengan menggunakan Duration,
kita bisa dengan mudah mengkonversi durasi ke waktu yang kita inginkan, misal hour, minute, second dan nano second
 */

public class _14_DurationTest {
    @Test
    void create() {
        Duration duration = Duration.ofSeconds(10);
        Duration duration1 = Duration.ofMillis(10);
        Duration duration2 = Duration.ofHours(10);

        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(duration2);
    }

    @Test
    void get() {
        Duration duration = Duration.ofHours(50);

        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }

    @Test
    void between() {
        Duration duration = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(10));
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());

        Duration duration1 = Duration.between(LocalDateTime.now().plusHours(10), LocalDateTime.now());
        System.out.println(duration1.toHours());
        System.out.println(duration1.toMinutes());
    }
}
