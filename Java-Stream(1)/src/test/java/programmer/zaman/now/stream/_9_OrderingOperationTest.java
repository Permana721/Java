package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class _9_OrderingOperationTest {
    @Test
    void testSorted() {
        Stream.of("Ari", "Permana", "Surya", "Dharma", "Arido", "Shifuka")
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        Stream.of("Ari", "Permana", "Surya", "Dharma", "Arido", "Shifuka")
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}
