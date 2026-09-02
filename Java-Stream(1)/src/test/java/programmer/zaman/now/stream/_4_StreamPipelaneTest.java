package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class _4_StreamPipelaneTest {
    @Test
    void testCreateStreamPipeline() {
        // Jarang digunakan cara seperti ini
        List<String> list = List.of("Permana", "Surya", "Dharma");
        Stream<String> stream = list.stream();
        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());
        Stream<String> streamMr = streamUpper.map(upper -> "Mr." + upper);
        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineBestPractice() {
        List<String> list = List.of("Permana", "Surya", "Dharma");
        // Best practice lebih singkat
        list.stream().map(name -> name.toUpperCase()).map(upper -> "Mr." + upper).forEach(System.out::println);
    }
}
