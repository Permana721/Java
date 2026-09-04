package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/*
Phaser merupakan fitur synchronizer yang mirip dengan CyclicBarrier dan CountDownLatch, namun lebih flexible
Sebelumnya, untuk jumlah counter atau thread nya sudah ditentukan di awal, namun pada Phaser,
bisa berubah dengan menggunakan method register() atau bulkRegister(int), dan untuk menurunkan bisa menggunakan method arrive...(),
atau bisa menggunakan await...(int) untuk menunggu sampai jumlah yang register tertentu
 */

public class _23_PhaserTest {
    @Test
    void countDownLatch() throws InterruptedException {
        final var phaser = new Phaser();
        final var executor = Executors.newFixedThreadPool(10);

        phaser.bulkRegister(5);
        for (int i = 0; i < 5; i++) {
            executor.execute(() -> {
                try {
                    System.out.println("Start Task");
                    Thread.sleep(2000);
                    System.out.println("End Task");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    phaser.arrive();
                }
            });
        }

        executor.execute(() -> {
            phaser.awaitAdvance(0);
            System.out.println("All tasks done");
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void cyclicBarrier() throws InterruptedException {
        final var phaser = new Phaser();
        final var executor = Executors.newFixedThreadPool(10);

        phaser.bulkRegister(5);
        for (int i = 0; i < 4; i++) {
            executor.execute(() -> {
                phaser.arriveAndAwaitAdvance();
                System.out.println("DONE");
            });
        }

        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
