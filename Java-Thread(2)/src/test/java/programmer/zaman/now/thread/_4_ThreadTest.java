package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

public class _4_ThreadTest {
    @Test
    void mainThread() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }

    @Test
    void createThread() {
        Runnable runnable = () -> {
            System.out.println("Hello from thread: " + Thread.currentThread().getName());
        };

        var thread = new Thread(runnable);
        thread.start();

        System.out.println("Program selesai");
    }

    @Test
    void threadSleep() throws InterruptedException {
        Runnable runnable = () -> {
            try {
                Thread.sleep(2000);
                System.out.println("Hello from thread: " + Thread.currentThread().getName());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        };

        var thread = new Thread(runnable);
        thread.start();

        System.out.println("Program selesai");

        Thread.sleep(3000);
    }

    @Test
    void threadJoin() throws InterruptedException {
        Runnable runnable = () -> {
            try {
                Thread.sleep(2000);
                System.out.println("Hello from thread: " + Thread.currentThread().getName());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        };

        var thread = new Thread(runnable);
        thread.start();
        System.out.println("Menunggu selesai");
        thread.join();
        System.out.println("Program selesai");
    }

    @Test
    void falseThreadInterrupt() throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable: " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        };

        var thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
        System.out.println("Menunggu selesai");
        thread.join();
        System.out.println("Program selesai");
    }

    @Test
    void threadInterruptCorrect() throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                // Manual check interrupted (Biasanya pakai ini)
                if (Thread.interrupted()) {
                    break;
                }
                System.out.println("Runnable: " + i);
                try {
                    Thread.sleep(2000); // Otomatis cek interrupted (Di real projek jarang pakai sleep)
                } catch (InterruptedException exception) {
                    break;
                }
            }
        };

        var thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
        System.out.println("Menunggu selesai");
        thread.join();
        System.out.println("Program selesai");
    }

    @Test
    void threadName() {
        var thread = new Thread(() -> {
            System.out.println("Run in thread: " + Thread.currentThread().getName());
        });
        thread.setName("Permana"); // Ganti nama thread untuk kebutuhan debugging/Logging
        thread.start();
    }

    @Test
    void threadState() throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getState()); // Status Thread
            System.out.println("Run in thread: " + Thread.currentThread().getName());
        });
        thread.setName("Permana");
        System.out.println(thread.getState()); // Status Thread

        thread.start();
        thread.join();
        System.out.println(thread.getState()); // Status Thread
    }
}
