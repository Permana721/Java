package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.*;

/*
Pada Java 8, terdapat sebuah class baru bernama CompletableFuture,
ini merupakan implementasi Future yang bisa kita set datanya secara manual
CompletableFuture sangat cocok ketika kita misal perlu membuat future secara manual,
sehingga kita tidak memerlukan Callable
Untuk memberi value terhadap CompletableFuture secara manual,
kita bisa menggunakan method complete(value) atau completeExceptionally(error) untuk error
 */

public class _14_CompletableFutureTest {
    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    Random random = new Random();

    public CompletableFuture<String> getValue() {
        CompletableFuture<String> future = new CompletableFuture<>();

        executorService.execute(() -> {
            try {
                Thread.sleep(2000);
                future.complete("Permana Surya Dharma");
            } catch (InterruptedException exception) {
                future.completeExceptionally(exception);
            }
        });

        return future;
    }

    @Test
    void create() throws ExecutionException, InterruptedException {
        Future<String> future = getValue();
        System.out.println(future.get());
    }

    @Test
    void execute(CompletableFuture<String> future, String value) {
        executorService.execute(() -> {
            try {
                Thread.sleep(1000 + random.nextInt(5000));
                future.complete(value);
            } catch (InterruptedException exception) {
                future.completeExceptionally(exception);
            }
        });
    }

    public Future<String> getFastest() {
        CompletableFuture<String> future = new CompletableFuture<>();

        execute(future, "Thread 1");
        execute(future, "Thread 2");
        execute(future, "Thread 3");

        return future;
    }

    @Test
    void testFastest() throws ExecutionException, InterruptedException {
        System.out.println(getFastest().get());
    }

    /*
    CompletableFuture merupakan turunan dari interface CompletionStage
    CompletionStage merupakan fitur dimana kita bisa menambahkan asynchronous computation,
    tanpa harus menunggu dulu data dari Future nya ada
    CompletionStage sangat mirip dengan operation di Java Stream, hanya saja tidak sekomplit di Java Stream
     */

    @Test
    void completionStage() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = getValue();

        CompletableFuture<String[]> future1 = future.thenApply(s -> s.toUpperCase())
                .thenApply(s -> s.split(" "));

        String[] strings = future1.get();
        for (var value : strings) {
            System.out.println(value);
        }
    }
}
