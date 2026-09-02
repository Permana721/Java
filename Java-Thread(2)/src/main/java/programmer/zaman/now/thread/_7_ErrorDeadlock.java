package programmer.zaman.now.thread;

public class _7_ErrorDeadlock {
    private Long value;

    public _7_ErrorDeadlock(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public static void transferDeadlock(_7_ErrorDeadlock from, _7_ErrorDeadlock to, Long value) throws InterruptedException {
        synchronized (from) {
            Thread.sleep(1000);
            synchronized (to) {
                Thread.sleep(1000);
                from.setValue(from.getValue() - value);
                to.setValue(to.getValue() + value);
            }
        }
    }

    public static void transfer(_7_ErrorDeadlock from, _7_ErrorDeadlock to, Long value) throws InterruptedException {
        synchronized (from) {
            Thread.sleep(1000);
            from.setValue(from.getValue() - value);
        }

        synchronized (to) {
            Thread.sleep(1000);
            to.setValue(to.getValue() + value);
        }
    }
}
