package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
ConcurrentMap merupakan turunan dari Map yang thread safe, dan cocok jika memang diakses oleh lebih dari satu thread
Tidak ada hal yang spesial dari ConcurrentMap, semua operasi method nya sama seperti Map,
yang membedakan adalah pada ConcurrentMap, dijamin thread safe
Implementasi dari interface ConcurrentMap adalah class ConcurrentHashMap
 */

public class _27_ConcurrentMapTest {
    @Test
    void concurrentMap() throws InterruptedException {
        final var countDown = new CountDownLatch(100);
        final var map = new ConcurrentHashMap<Integer, String>();
        final var executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            final var index = i;
            executor.execute(() -> {
                try {
                    Thread.sleep(1000);
                    map.putIfAbsent(index, "Data-" + index);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                } finally {
                    countDown.countDown();
                }
            });
        }

        executor.execute(() -> {
            try {
                countDown.await();
                map.forEach(((integer, s) -> System.out.println(integer + " : " + s)));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    /*
    Pada kasus tertentu, kadang kita tetap butuh menggunakan Java Collection, namun butuh menggunakan multiple thread
    Untuk kasus seperti itu,
    disarankan merubah Java Collection menjadi synchronized menggunakan helper method Collections.synchronized…(collection)
     */
    @Test
    void testCollection() {
        List<String> list = List.of("Permana", "Surya", "Dharma");
        List<String> synchronizedList = Collections.synchronizedList(list); // Aman jika di akses banyak Thread
    }
}
