package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

/*
Threadpool merupakan class yang digunakan untuk management thread
Dengan threadpool, kita tidak perlu membuat thread secara manual, karena semua sudah diatur oleh threadpool
Selain itu threadpool bisa melakukan reusable thread yang sudah selesai bekerja
Threadpool di Java direpresentasikan dalam class bernama ThreadPoolExecutor
 */

public class _11_ThreadpoolTest {
    @Test
    void create() {
        int minThread = 10;
        int maxThread = 100;
        int alive = 1;
        TimeUnit aliveTime = TimeUnit.MINUTES;
        ArrayBlockingQueue queue = new ArrayBlockingQueue<>(100);

        /*
        core pool, minimal thread yang akan dibuat ketika threadpool dibuat
        max pool, maximal thread yang akan dibuat
        keep alive time, berapa lama thread akan dihapus jika tidak bekerja
        queue, antrian untuk menampung pekerjaan yang dikirim ke threadpool
         */

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(minThread, maxThread, alive, aliveTime, queue);
    }

    @Test
    void executeRunnable() throws InterruptedException {
        int minThread = 10;
        int maxThread = 100;
        int alive = 1;
        TimeUnit aliveTime = TimeUnit.MINUTES;
        ArrayBlockingQueue queue = new ArrayBlockingQueue<>(100);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(minThread, maxThread, alive, aliveTime, queue); // Sebenarnya jarang digunakan Threadpool

        Runnable runnable = () -> {
            try {
                Thread.sleep(5000);
                System.out.println("Runnable thread from: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        threadPoolExecutor.execute(runnable);

        Thread.sleep(6000);
    }

    @Test
    void shutdown() throws InterruptedException {
        int minThread = 100;
        int maxThread = 100;
        int alive = 1;
        TimeUnit aliveTime = TimeUnit.MINUTES;
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(1000);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(minThread, maxThread, alive, aliveTime, queue);

        for (int i = 0; i < 1000; i++) {
            int task = i;
            Runnable runnable = () -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Task " + task +  " thread from: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            };
            threadPoolExecutor.execute(runnable);
        }

        threadPoolExecutor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void rejected() throws InterruptedException {
        int minThread = 10;
        int maxThread = 100;
        int alive = 1;
        var aliveTime = TimeUnit.MINUTES;
        var queue = new ArrayBlockingQueue<Runnable>(20);
        var rejectedHandler = new LogRejectedExecutionHandler();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(minThread, maxThread, alive, aliveTime, queue, rejectedHandler);

        for (int i = 0; i < 1000; i++) {
            final int task = i;
            Runnable runnable = () -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Task " + task +  " thread from: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            };
            threadPoolExecutor.execute(runnable);
        }

        threadPoolExecutor.awaitTermination(1, TimeUnit.DAYS);
    }

    public static class LogRejectedExecutionHandler implements RejectedExecutionHandler {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("Task " + r + " is rejected");
        }
    }
}
