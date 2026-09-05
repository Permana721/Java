package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class _32_ReactiveStreamTest {
    @Test
    void publish() throws InterruptedException {
        var publisher = new SubmissionPublisher<String>();
        var subscriber = new PrintSubscriber("A", 1000L);
        publisher.subscribe(subscriber);

        var executor = Executors.newFixedThreadPool(10);
        executor.execute(() -> {
            for (int i = 0; i < 100; i++) {
                publisher.submit("Permana-" + i);
                System.out.println(Thread.currentThread().getName() + ": Send Permana-" + i);
            }
        });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);

        Thread.sleep(100 * 1000);
    }

    public static class PrintSubscriber implements Flow.Subscriber<String> {
        private Flow.Subscription subscription;
        private String name;
        private Long sleep;

        public PrintSubscriber(String name, Long sleep) {
            this.name = name;
            this.sleep = sleep;
        }

        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            this.subscription = subscription;
            this.subscription.request(1);
        }

        @Override
        public void onNext(String item) {
            try {
                Thread.sleep(sleep);
                System.out.println(Thread.currentThread().getName() + ": " + name + ": " + item);
                this.subscription.request(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
        }

        @Override
        public void onComplete() {
            System.out.println(Thread.currentThread().getName() + ": DONE");
        }
    }
}
