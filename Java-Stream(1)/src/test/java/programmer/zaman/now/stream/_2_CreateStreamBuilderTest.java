package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class _2_CreateStreamBuilderTest {
    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Permana");
        builder.add("Surya").add("Dharma");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder().add("Permana").add("Surya").add("Dharma").build();
        stream.forEach(System.out::println);
    }
}
