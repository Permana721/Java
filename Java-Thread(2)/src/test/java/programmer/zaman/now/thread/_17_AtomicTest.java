package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

/*
Java menawarkan sebuah package atomic yang berisikan class-class yang mendukung lock-free dan thread-safe programming
pada single variable
Setiap object Atomic class akan mengelola data yang diakses dan di update menggunakan method yang telah disediakan
Atomic class melakukan implementasi Compare-and-Swap untuk mendukung synchronization
Dengan menggunakan Atomic, kita tidak perlu lagi menggunakan synchronized secara manual
 */

public class _17_AtomicTest {
    @Test
    void counter() throws InterruptedException {
        _17_Atomic atomic = new _17_Atomic();
        Runnable runnable = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                atomic.increment();
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread.start();
        thread1.start();
        thread2.start();

        thread.join();
        thread1.join();
        thread2.join();

        System.out.println(atomic.getAtomicLong());
    }
}
