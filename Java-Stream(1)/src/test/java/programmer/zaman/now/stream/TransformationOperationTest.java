package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {
    @Test
    void testMap() {
        List.of("Permana", "Surya", "Dharma").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(lenght -> System.out.println(lenght));
    }

    @Test
    void testFlatMapOperation() {
        List.of("Permana", "Surya", "Dharma").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(lenght -> System.out.println(lenght));
    }
}
