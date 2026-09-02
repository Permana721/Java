package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

public class _7_ErrorDeadlockTest {
    @Test
    void transfer() throws InterruptedException {
        var balance1 = new _7_ErrorDeadlock(1_000_000L);
        var balance2 = new _7_ErrorDeadlock(1_000_000L);

        var thread1 = new Thread(() -> {
            try {
                _7_ErrorDeadlock.transfer(balance1, balance2, 500_000L);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        });

        var thread2 = new Thread(() -> {
            try {
                _7_ErrorDeadlock.transfer(balance2, balance1, 500_000L);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Balance 1: " + balance1.getValue());
        System.out.println("Balance 2: " + balance2.getValue());
    }
}
