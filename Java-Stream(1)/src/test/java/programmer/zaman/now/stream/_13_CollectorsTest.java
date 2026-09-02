package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _13_CollectorsTest {
    Stream<String> getStream() {
        return Stream.of("Permana", "Surya", "Dharma");
    }

    @Test
    void testCollection() {
        Set<String> set = getStream().collect(Collectors.toSet());
        System.out.println(set);
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);

        List<String> list = getStream().toList();
        List<String> immutableList = getStream().toList();
        System.out.println(immutableList);
    }

    @Test
    void testCollectorsMap() {
        Map<String, Integer> map = getStream().collect(Collectors.toMap(
                name -> name,
                String::length
        ));
        System.out.println(map);
    }
}
