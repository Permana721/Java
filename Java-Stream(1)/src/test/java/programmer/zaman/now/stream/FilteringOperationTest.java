package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {
    @Test
    void testFilter() {
        List.of("Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .filter(name -> name.length() < 6)
                .forEach(System.out::println);

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Permana", "Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .distinct()
                .forEach(System.out::println);
    }
}