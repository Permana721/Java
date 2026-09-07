package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
ExecutorService memiliki sub child interface bernama ScheduledExecutorService
Fitur tambahan di ScheduledExecutorService adalah, kita bisa melakukan asynchronous task yang terjadwal
Hal ini sangat cocok untuk kasus delayed job (pekerjaan yang butuh ditangguhkan pengerjaannya) dan periodic job
ScheduledExecutorService merupakan fitur yang bisa menggantikan low level penggunaan Timer
 */

/*
Hampir semua method di ScheduledExecutorService mengembalikan data ScheduledFuture
ScheduledFuture sebenarnya mirip dengan Future, yang membedakan,
dia adalah turunan dari interface Delayed, yang memiliki method untuk mendapatkan informasi waktu delay
 */

public class _16_ScheduledExecutorServiceTest {

    /*
    Untuk membuat ScheduledExecutorService kita bisa menggunakan implementasi class ScheduledThreadPoolExecutor
    Atau jika ingin mudah, kita bisa gunakan class Executors,
    terdapat method newSingleThreadScheduledExecutor() dan newScheduledThreadPool(poolSize) untuk membuat ScheduledExecutorService
     */

    @Test
    void delayedJob() throws InterruptedException {
        var executor = Executors.newScheduledThreadPool(10);

        var future = executor.schedule(() -> System.out.println("Hello Scheduled"), 5, TimeUnit.SECONDS);

        System.out.println(future.getDelay(TimeUnit.MILLISECONDS));

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void periodicJob() throws InterruptedException {
        var executor = Executors.newScheduledThreadPool(10);

        var future = executor.scheduleAtFixedRate(() -> System.out.println("Hello Scheduled"), 2, 2, TimeUnit.SECONDS);

        System.out.println(future.getDelay(TimeUnit.MILLISECONDS));

        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
