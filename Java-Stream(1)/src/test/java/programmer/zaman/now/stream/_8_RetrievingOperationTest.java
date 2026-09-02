package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class _8_RetrievingOperationTest {
    @Test
    void testLimit() {
        List.of("Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Ari", "Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .takeWhile(name -> name.length() <= 6)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Ari", "Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .dropWhile(name -> name.length() <= 6)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Ari", "Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Ari", "Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
}