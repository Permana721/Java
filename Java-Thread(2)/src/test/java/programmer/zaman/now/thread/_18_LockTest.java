package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.ReentrantLock;

/*
Java menyediakan high level concurrency package untuk melakukan locking atau waiting for conditions
Ini adalah alternatif dari low level synchronized dan manual wait dan notify
Untuk saat ini,
sangat disarankan menggunakan package locks dibandingkan menggunakan low level synchronization sebelumnya yang sudah kita bahas
 */

/*
Lock interface merupakan alternatif implementasi dari synchronized method dan synchronized statement
Untuk melakukan lock, kita bisa gunakan method lock() dan setelah selesai, kita bisa menggunakan method unlock() untuk melepaskan lock
Implementasi dari interface Lock adalah class ReentrantLock
 */

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

    /*
    Kadang ada kondisi dimana kita ingin membedakan lock antara operasi update dan operasi get
    Untuk kasus seperti ini, kita bisa membuat dua buah variable Lock
    Namun, di Java disediakan cara yang lebih mudah, yaitu menggunakan interface ReadWriteLock
    ReadWriteLock merupakan lock yang mendukung dua jenis operasi, read dan write
    Implementasi dari interface ReadWriteLock adalah class ReentrantReadWriteLock
     */

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

    /*
    Condition merupakan alternatif lain dari monitor method (wait, notify dan notifyAll)
    Pada Java modern saat ini, sangat disarankan menggunakan Condition dibanding monitor method
    Condition memiliki method wait() untuk menunggu, signal() untuk mentrigger satu thread,
    dan signalAll() untuk mentrigger semua thread yang menunggu
    Cara pembuatan Condition, kita bisa menggunakan method newCondition() milik Lock
     */

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
