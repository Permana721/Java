package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class _10_AggregateOperationTest {
    @Test
    void testMax() {
        List.of("Ari", "Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("Ari", "Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = List.of("Ari", "Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .count();
        System.out.println(count);
    }

    @Test
    void testSum() {
        Integer result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);
        System.out.println(result);
    }

    @Test
    void testFactorial() {
        Integer factorial = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, item) -> value * item);
        System.out.println(factorial);
    }
}
