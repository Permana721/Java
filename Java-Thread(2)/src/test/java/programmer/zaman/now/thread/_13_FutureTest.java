package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Sebelumnya kita selalu menggunakan Runnable untuk mengirim perintah ke thread, namun pada Runnable,
setelah pekerjaan selesai, tidak ada data yang dikembalikan sama sekali, karena method nya return void
Callable mirip dengan Runnable, namun Callable mengembalikan data
Selain itu Callable merupakan generic type, sehingga kita bisa tentukan tipe return data nya
 */

/*
Jika kita ingin mengeksekusi callable, kita bisa menggunakan method submit(Callable) pada ExecutorService,
method submit(Callable) tersebut akan mengembalikan Future<T>
Future merupakan representasi data yang akan dikembalikan oleh proses asynchronous
Menggunakan Future, kita bisa mengecek apakah pekerjaan Callable sudah selesai atau belum,
dan juga mendapat data hasil dari Callable
 */

public class _13_FutureTest {
    @Test
    void testFuture() throws InterruptedException, ExecutionException {
        var executor = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            Thread.sleep(5000);
            return "Hi";
        };

        Future<String> future = executor.submit(callable);
        System.out.println("Selesai future");

        while (!future.isDone()) {
            System.out.println("Waiting future");
            Thread.sleep(1000);
        }

        String value = future.get();
        System.out.println(value);
    }

    @Test
    void testFutureCancel() throws InterruptedException, ExecutionException {
        var executor = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            Thread.sleep(5000);
            return "Hi";
        };

        Future<String> future = executor.submit(callable);
        System.out.println("Selesai future");

        Thread.sleep(2000);
        future.cancel(true);

        System.out.println(future.isCancelled());
        String value = future.get();
        System.out.println(value);
    }

    /*
    ExecutorService memiliki method bernama  invokeAll(Collection<Callable<T>>) untuk mengeksekusi banyak Callable secara sekaligus
    Ini cocok ketika ada kasus kita ingin menjalankan proses asynchronous secara parallel sebanyak jumlah thread di threadpool
    Hal ini bisa mempercepat proses dibanding kita eksekusi satu persatu
     */

    @Test
    void invokeAll() throws InterruptedException, ExecutionException {
        var executor = Executors.newFixedThreadPool(10);

        List<Callable<String>> callables = IntStream.range(1, 11).mapToObj(value -> (Callable<String>) () -> {
            Thread.sleep(1000);
            return String.valueOf(value);
        }).collect(Collectors.toList());

        var futures = executor.invokeAll(callables);

        for (Future<String> stringFuture : futures) {
            System.out.println(stringFuture.get());
        }
    }

    /*
    Kadang ada kasus dimana kita ingin mengeksekusi beberapa proses secara asynchronous,
    namun ingin mendapatkan hasil yang paling cepat
    Hal ini bisa dilakukan dengan menggunakan method invokeAny(Collection<Callable<T>>)
    invokeAny() akan mengembalikan result data dari Callable yang paling cepat mengembalikan result
     */

    @Test
    void invokeAny() throws InterruptedException, ExecutionException {
        var executor = Executors.newFixedThreadPool(10);

        List<Callable<String>> callables = IntStream.range(1, 11).mapToObj(value -> (Callable<String>) () -> {
            Thread.sleep(1000);
            return String.valueOf(value);
        }).collect(Collectors.toList());

        var value = executor.invokeAny(callables);
        System.out.println(value);
    }
}
