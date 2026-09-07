package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.*;

/*
CompletionService merupakan sebuah interface yang digunakan untuk memisahkan antara bagian
yang mengeksekusi asynchronous task dan yang menerima hasil dari task yang sudah selesai
Kadang ada kebutuhan misal kita butuh menjalankan sesuatu secara parallel,
lalu ada satu thread yang melakukan eksekusi task dan satu thread menunggu hasil nya
Kita bisa menggunakan CompletionService untuk melakukan itu
Implementasi interface CompletionService adalah class ExecutorCompletionService
 */

public class _15_CompletionServiceTest {
    private Random random = new Random();

    @Test
    void test() throws InterruptedException {
        var executor = Executors.newFixedThreadPool(10);
        var completionService = new ExecutorCompletionService<String>(executor);

        // Submit task
        Executors.newSingleThreadExecutor().execute(() -> {
            for (int i = 0; i < 100; i++) {
                final var index = i;
                completionService.submit(() -> {
                    Thread.sleep(random.nextInt(2000));
                    return "Task-" + index;
                });
            }
        });

        // Poll task
        Executors.newSingleThreadExecutor().execute(() -> {
            while (true) {
                try {
                    Future<String> future = completionService.poll(5, TimeUnit.SECONDS);
                    if (future == null) {
                        break;
                    } else {
                        System.out.println(future.get());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                    break;
                }
            }
        });
//        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
