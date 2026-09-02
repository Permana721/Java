package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {
    @Test
    void testSorted() {
        List.of("Ari", "Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("Ari", "Permana", "Surya", "Dharma", "Arido", "Shifuka").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}
