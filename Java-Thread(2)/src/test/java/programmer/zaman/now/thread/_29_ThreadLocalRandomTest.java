package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/*
Pada materi-materi sebelumnya, kita sering menggunakan class Random untuk membuat angka random
Saat menggunakan object Random secara parallel, maka di dalam class Random kita akan melakukan sharing variable,
hal ini membuat class Random tidak aman dan juga lambat
Oleh karena itu terdapat class ThreadLocalRandom, ThreadLocalRandom merupakan class yang seperti ThreadLocal,
namun spesial untuk Random, sehingga kita bisa membuat angka random tanpa khawatir dengan race condition,
karena object Random nya akan berbeda tiap thread
 */

public class _29_ThreadLocalRandomTest {
    @Test
    void test() throws InterruptedException {
        final var executor = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 100; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(1000);
                    var number = ThreadLocalRandom.current().nextInt();
                    System.out.println(number);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    /*
    Fitur lainnya di ThreadLocalRandom adalah, dia memiliki fitur untuk membuat random number secara stream
    Hal ini mempermudah kita ketika ingin melakukan random number tanpa harus pusing membuat perulangan secara manual
    ada banyak method di ThreadLocalRandom seperti ints(), longs() dan doubles() yang mengembalikan data stream
     */

    @Test
    void stream() throws InterruptedException {
        final var executors = Executors.newFixedThreadPool(10);

        executors.execute(() -> {
            ThreadLocalRandom.current().ints()
                    .forEach(System.out::println);
        });

        executors.shutdown();
        executors.awaitTermination(1, TimeUnit.DAYS);
    }
}
