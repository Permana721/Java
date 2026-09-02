package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class _6_TransformationOperationTest {
    @Test
    void testMap() {
        Stream.of("Permana", "Surya", "Dharma")
                .map(String::toUpperCase)
                .map(String::length)
                .forEach(System.out::println);
    }

    @Test
    void testFlatMapOperation() {
        Stream.of("Permana", "Surya", "Dharma")
                .map(String::toUpperCase)
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(lenght -> System.out.println(lenght));
    }
}
