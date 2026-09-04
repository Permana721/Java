package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class _11_ThreadpoolTest {
    @Test
    void create() {
        int minThread = 10;
        int maxThread = 100;
        int alive = 1;
        TimeUnit aliveTime = TimeUnit.MINUTES;
        ArrayBlockingQueue queue = new ArrayBlockingQueue<>(100);

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
        int minThread = 10;
        int maxThread = 100;
        int alive = 1;
        TimeUnit aliveTime = TimeUnit.MINUTES;
        ArrayBlockingQueue queue = new ArrayBlockingQueue<Runnable>(1000);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(minThread, maxThread, alive, aliveTime, queue);

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
//        threadPoolExecutor.shutdownNow();
        threadPoolExecutor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void rejected() throws InterruptedException {
        int minThread = 10;
        int maxThread = 100;
        int alive = 1;
        var aliveTime = TimeUnit.MINUTES;
        var queue = new ArrayBlockingQueue<Runnable>(10);
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
