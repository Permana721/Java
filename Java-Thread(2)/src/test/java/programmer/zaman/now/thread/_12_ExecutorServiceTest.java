package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
Jika kita perhatikan, ThreadPoolExecutor merupakan implementasi dari interface Executor dan ExecutorService
Jadi saat kita membuat ThreadPoolExecutor sebenarnya kita membuat Executor Service
Dan sebenarnya pembuatan Threadpool secara manual jarang dilakukan,
kecuali pada kasus kita benar-benar butuh melakukan tuning Threadpool
Namun dalam kebanyakan kasus, kita jarang sekali membuat Threadpool secara manual
Rata-rata, biasanya untuk mengeksekusi Runnable, biasanya kita akan menggunakan Executor Service
 */

public class _12_ExecutorServiceTest {
    /*
    Karena ExecutorService adalah interface, jadi pembuatan object ExecutorService salah satu nya adalah menggunakan ThreadPoolExecutor
    Namun ada yang lebih mudah, yaitu menggunakan class Executors
    Executor merupakan class utility untuk membantu kita membuat object ExecutorService secara mudah
    Sebenarnya implementasi Executors pun menggunakan ThreadPoolExecutor,
    hanya saja kita tidak perlu terlalu pusing melakukan pengaturan threadpool secara manual
     */
    @Test
    void testExecutorService() throws InterruptedException {
        var executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Runnable in thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void testExecutorFix() throws InterruptedException {
        var executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Runnable in thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
