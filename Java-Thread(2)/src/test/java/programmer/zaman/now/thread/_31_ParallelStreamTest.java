package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Salah satu fitur yang menarik di Java Stream adalah, Stream bisa dijalankan secara parallel
Secara default, Parallel Stream akan dijalankan di ForkJoinPool,
dimana akan di running secara default menggunakan Thread sejumlah maksimal total CPU kita
Agar stream bisa berjalan parallel, kita cukup gunakan method parallel()
 */

public class _31_ParallelStreamTest {
    @Test
    void parallel() {
        Stream<Integer> stream = IntStream.range(0, 100).boxed();

        stream.parallel().forEach(integer -> {
            System.out.println(Thread.currentThread().getName() + ": " + integer);
        });
    }
}
