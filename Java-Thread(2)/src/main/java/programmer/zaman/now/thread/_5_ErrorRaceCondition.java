package programmer.zaman.now.thread;

public class _5_ErrorRaceCondition {
    private Long value = 0L;

    public void increment() {
        value++;
    }

    public Long getValue() {
        return value;
    }
}
