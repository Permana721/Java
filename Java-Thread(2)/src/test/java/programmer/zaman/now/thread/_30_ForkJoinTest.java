package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Fork/Join merupakan fitur yang mulai kenalkan di Java 7 untuk membantu mempercepat proses secara parallel
memanfaatkan semua cpu processor. Proses ini dicapai menggunakan teknik Devide and Conquer
Secara sederhana, Fork/Join akan melakukan FORK,
memecah pekerjaan menjadi pekerjaan yang lebih kecil dan dieksekusi secara asynchronous
Setelah proses FORK selesai, proses JOIN akan dilakukan,
yaitu menggabungkan hasil semua pekerjaan yang telah selesai menjadi satu hasil
Fork/Join menggunakan thread pool bernama ForkJoinPool dan menggunakan thread ForkJoinWorkerThread
 */

/*
ForkJoinPool merupakan turunan dari ExecutorService,
jadi cara penggunaannya sama dengan ExecutorService sebelumnya yang sudah kita bahas
Namun agar tujuan dari ForkJoinPool tercapai,
baiknya kita menggunakan ForkJoinTask sebagai task yang kita submit ke ForkJoinPool
ForkJoinTask adalah turunan dari Callable,
sehingga kita bisa menggunakan method execute() atau submit() untuk mengirim task ke ForkJoinPool
 */

public class _30_ForkJoinTest {
    @Test
    void create() {
        var forkJoinPool = ForkJoinPool.commonPool();
        var forkJoinPool1 = new ForkJoinPool(5);

        var executor = Executors.newWorkStealingPool();
        var executor1 = Executors.newWorkStealingPool(5);
    }

    /*
    ForkJoinTask adalah abstract class, dan terdapat 2 abstract class turunannya yang bisa kita gunakan agar
    lebih mudah membuat ForkJoinTask
    RecursiveAction, merupakan class yang bisa kita gunakan untuk task yang tidak mengembalikan result seperti Runnable
    RecursiveTask, merupakan class yang bisa kita gunakan untuk task yang mengembalikan result seperti Callable
     */

    @Test
    void recursiveAction() throws InterruptedException {
        var pool = ForkJoinPool.commonPool();
        List<Integer> integers = IntStream.range(0, 1000).boxed().collect(Collectors.toList());

        var task = new SimpleForkJoinTask(integers);
        pool.execute(task);

        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void recursiveTask() throws ExecutionException, InterruptedException {
        var pool = ForkJoinPool.commonPool();
        List<Integer> integers = IntStream.range(0, 1000).boxed().collect(Collectors.toList());

        var task = new TotalRecursiveTask(integers);
        ForkJoinTask<Long> submit = pool.submit(task);

        Long aLong = submit.get();
        System.out.println(aLong);

        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.DAYS);
    }

    public static class SimpleForkJoinTask extends RecursiveAction {
        private List<Integer> integers;

        public SimpleForkJoinTask(List<Integer> integers) {
            this.integers = integers;
        }

        @Override
        protected void compute() {
            if (integers.size() <= 10) {
                doExecute();
            } else {
                forkCompute();
            }
        }

        private void forkCompute() {
            List<Integer> integers1 = this.integers.subList(0, this.integers.size() / 2);
            List<Integer> integers2 = this.integers.subList(this.integers.size() / 2, this.integers.size());

            SimpleForkJoinTask task = new SimpleForkJoinTask(integers1);
            SimpleForkJoinTask task1 = new SimpleForkJoinTask(integers2);

            ForkJoinTask.invokeAll(task, task1);

        }

        private void doExecute() {
            integers.forEach(integer -> System.out.println(Thread.currentThread().getName() + ": " + integer));
        }
    }

    public static class TotalRecursiveTask extends RecursiveTask<Long> {
        private List<Integer> integers;

        public TotalRecursiveTask(List<Integer> integers) {
            this.integers = integers;
        }

        @Override
        protected Long compute() {
            if (integers.size() <= 10) {
                return doCompute();
            } else {
                return forkCompute();
            }
        }

        private Long forkCompute() {
            List<Integer> integers1 = this.integers.subList(0, this.integers.size() / 2);
            List<Integer> integers2 = this.integers.subList(this.integers.size() / 2, this.integers.size());

            TotalRecursiveTask task = new TotalRecursiveTask(integers1);
            TotalRecursiveTask task1 = new TotalRecursiveTask(integers2);

            ForkJoinTask.invokeAll(task, task1);

            return task.join() + task1.join();
        }

        private Long doCompute() {
            return integers.stream().mapToLong(value -> value).peek(value -> {
                System.out.println(Thread.currentThread().getName() + ": " + value);
            }).sum();
        }
    }
}
