package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.ReentrantLock;

public class _18_LockTest {
    @Test
    void testLock() throws InterruptedException {
        var counter = new _18_Lock();
        Runnable runnable = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.increment();
            }
        };

        var thread = new Thread(runnable);
        var thread1 = new Thread(runnable);
        var thread2 = new Thread(runnable);

        thread.start();
        thread1.start();
        thread2.start();

        thread.join();
        thread1.join();
        thread2.join();

        System.out.println(counter.getValue());
    }

    @Test
    void testReadWriteLock() throws InterruptedException {
        var counter = new _18_2_ReadWriteLock();
        Runnable runnable = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.increment();
            }
        };

        var thread = new Thread(runnable);
        var thread1 = new Thread(runnable);
        var thread2 = new Thread(runnable);

        thread.start();
        thread1.start();
        thread2.start();

        thread.join();
        thread1.join();
        thread2.join();

        System.out.println(counter.getValue());
    }

    String message;

    @Test
    void condition() throws InterruptedException {
        var lock = new ReentrantLock();
        var condition = lock.newCondition();

        var thread = new Thread(() -> {
           try {
               lock.lock();
               condition.await();
               System.out.println(message);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           } finally {
               lock.unlock();
           }
        });

        var thread2 = new Thread(() -> {
            try {
                lock.lock();
                condition.await();
                System.out.println(message);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        });

        var thread1 = new Thread(() -> {
            try {
                lock.lock();
                Thread.sleep(2000);
                message = "Permana Surya Dharma";
                condition.signalAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        });

        thread.start();
        thread2.start();
        thread1.start();

        thread.join();
        thread2.join();
        thread1.join();
    }
}
