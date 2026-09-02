package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class _1_CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> oneStream = Stream.of("Permana"); // Wajib memasukan data
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data); // Tidak wajib memasukan data
        emptyOrNotStream.forEach(s -> {
            System.out.println(emptyOrNotStream);
        });
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Permana", "Surya", "Dharma");
        arrayStream.forEach(name -> System.out.println(name));

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream.forEach(System.out::println);

        String[] array = new String[] {
                "Permana", "Surya", "Dharma"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    // Collection to Stream
    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Permana", "Surya", "Dharma");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);
    }

    // Infinite loop
    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Permana Surya Dharma");
//        stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
//        iterate.forEach(System.out::println);
    }
}
