package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

public class _8_ThreadCommunicationTest {
    private String message = null;

    @Test
    void manual() throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (message == null) {  // Tidak direkomendasikan menggunakan loop karena memakan banyak resource
                // waiting
            }
            System.out.println(message);
        });

        Thread thread1 = new Thread(() -> {
            message = "Permana Surya Dharma";
        });

        thread1.start();
        thread.start();

        thread1.join();
        thread.join();
    }

    @Test
    void waitNotify() throws InterruptedException {
        final Object lock = new Object();

        Thread thread = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                    System.out.println(message);
                } catch (InterruptedException exception) {
                    throw new RuntimeException(exception);
                }
            }
        });

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                message = "Permana Surya Dharma";
                lock.notify();
            }
        });

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();
    }

    @Test
    void waitNotifyAll() throws InterruptedException {
        final Object lock = new Object();

        Thread thread = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                    System.out.println(message);
                } catch (InterruptedException exception) {
                    throw new RuntimeException(exception);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                    System.out.println(message);
                } catch (InterruptedException exception) {
                    throw new RuntimeException(exception);
                }
            }
        });

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                message = "Permana Surya Dharma";
                lock.notifyAll();
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
