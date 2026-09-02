package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class _3_StreamOperationTest {
    @Test
    void testStreamOperation() {
        List<String> names = List.of("Permana", "Surya", "Dharma\n");
        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase()); // Stream membuat data baru dan
        // tidak mengubah data aslinya

        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println); // Data pada List names tetap sama
    }
}
