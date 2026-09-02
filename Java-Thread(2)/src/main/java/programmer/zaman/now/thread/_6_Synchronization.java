package programmer.zaman.now.thread;

public class _6_Synchronization {
    private Long value = 0L;

    public synchronized void increment1() { // menjalankan synchronice pada 1 method
        value++;
    }

    public void increment() {
        synchronized (this) { // Hanya menjalankan synchronize pada 1 statement saja
            value++;
        }
    }

    public Long getValue() {
        return value;
    }
}
