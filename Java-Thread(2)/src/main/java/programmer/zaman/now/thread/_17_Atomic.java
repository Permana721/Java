package programmer.zaman.now.thread;

import java.util.concurrent.atomic.AtomicLong;

public class _17_Atomic {
    private final AtomicLong atomicLong = new AtomicLong(0L);

    public void increment() {
        atomicLong.incrementAndGet();
    }

    public AtomicLong getAtomicLong() {
        return atomicLong;
    }
}
