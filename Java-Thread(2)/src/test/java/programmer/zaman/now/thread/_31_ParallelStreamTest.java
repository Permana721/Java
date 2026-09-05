package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _31_ParallelStreamTest {
    @Test
    void parallel() {
        Stream<Integer> stream = IntStream.range(0, 100).boxed();

        stream.parallel().forEach(integer -> {
            System.out.println(Thread.currentThread().getName() + ": " + integer);
        });
    }
}
