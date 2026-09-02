package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class _5_LazyValuationTest {
    @Test
    void testIntermediateOperation() {
        List<String> names = List.of("Permana", "Surya", "Dharma");

        names.stream()
            .map(name -> {
                System.out.println("Change " + name + " to UPPERCASE");
                return name.toUpperCase();
            })
            .map(upper -> {
                System.out.println("Change " + upper + " to Mr.");
                return "Mr." + upper;
            })
            .forEach(mr -> {
                System.out.println(mr);
            });
    }
}
