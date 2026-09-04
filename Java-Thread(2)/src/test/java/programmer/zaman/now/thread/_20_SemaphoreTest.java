package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/*
Semaphore merupakan class yang digunakan untuk manage data counter
Nilai counter bisa naik, namun ada batas maksimal nya, jika batas maksimal nya sudah tercapai,
semua thread yang akan mencoba menaikkan harus menunggu, sampai ada thread lain yang menurunkan nilai counter
Semaphore cocok sekali misal untuk menjaga agar thread berjalan pada maksimal total counter yang sudah kita tentukan
 */

public class _20_SemaphoreTest {
    @Test
    void test() throws InterruptedException {
        final var semaphore = new Semaphore(10);
        final var executor = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 1000; i++) {
            executor.execute(() -> {
                try {
                    semaphore.acquire();
                    Thread.sleep(1000);
                    System.out.println("Finish");
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                } finally {
                    semaphore.release();
                }
            });
        }

        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
