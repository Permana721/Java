package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.concurrent.*;

/*
BlockingQueue merupakan turunan dari Queue, dari namanya kita tahu bahwa ini adalah collection dengan tipe antrian,
yang membedakan sifat dari BlockingQueue adalah dia aman diakses oleh beberapa thread, baik itu yang memasukkan data,
atau mengambil data
BlockingQueue mendukung method wait ketika mengambil data, dan juga wait ketika menyimpan data
Jika queue kosong, thread yang mengambil data akan diminta untuk menunggu sampai data ada
Dan jika queue penuh, thread yang mengambil data akan diminta untuk menunggu sampai ada tempat kosong
 */

public class _26_BlockingQueueTest {
    // ArrayBlockingQueue, implementasi BlockingQueue dengan ukuran fix
    @Test
    void arrayBlockingQueue() throws InterruptedException {
        final var queue = new ArrayBlockingQueue<String>(5);
        final var exector = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            exector.execute(() -> {
                try {
                    queue.put("Data");
                    System.out.println("Finish put data");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        exector.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    var value = queue.take();
                    System.out.println("Receive data: " + value);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        exector.awaitTermination(1, TimeUnit.DAYS);
    }

    // LinkedBlockingQueue, implementasi BlockingQueue dengan ukuran bisa berkembang
    @Test
    void linkedBlockingQueue() throws InterruptedException {
        final var queue = new LinkedBlockingQueue<String>();
        final var exector = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            exector.execute(() -> {
                try {
                    queue.put("Data");
                    System.out.println("Finish put data");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        exector.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    var value = queue.take();
                    System.out.println("Receive data: " + value);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        exector.awaitTermination(1, TimeUnit.DAYS);
    }


    // PriorityBlockingQueue, implementasi BlockingQueue dengan otomatis berurut berdasarkan prioritas
    @Test
    void priorityBlockingQueue() throws InterruptedException {
        final var queue = new PriorityBlockingQueue<Integer>(10, Comparator.reverseOrder());
        final var exector = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            final var index = i;
            exector.execute(() -> {
                queue.put(index);
                System.out.println("Finish put data");
            });
        }

        exector.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    var value = queue.take();
                    System.out.println("Receive data: " + value);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        exector.awaitTermination(1, TimeUnit.DAYS);
    }

    // DelayQueue, implementasi BlockingQueue untuk tipe data Delayed,
    // dimana data tidak bisa diambil sebelum waktu delay yang telah ditentukan
    @Test
    void delayedQueue() throws InterruptedException {
        final var queue = new DelayQueue<ScheduledFuture<String>>();
        final var executor = Executors.newFixedThreadPool(20);
        final var executorScheduled = Executors.newScheduledThreadPool(10);

        for (int i = 0; i < 10; i++) {
            final var index = i;
           queue.put(executorScheduled.schedule(() -> "Data " + index, i, TimeUnit.SECONDS));
        }

        executor.execute(() -> {
            while (true) {
                try {
                    var value = queue.take().get();
                    System.out.println("Receive data: " + value);
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    // SynchronousQueue, implementasi BlockingQueue dimana thread yang menambah data harus menunggu sampai ada
    // thread yang mengambil data, begitu juga kebalikannya
    @Test
    void synchronousQueue() throws InterruptedException {
        final var queue = new SynchronousQueue<String>();
        final var exector = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            final var index = i;
            exector.execute(() -> {
                try {
                    queue.put("Data-" + index);
                    System.out.println("Finish put data: " + index);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        exector.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    var value = queue.take();
                    System.out.println("Receive data: " + value);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        exector.awaitTermination(1, TimeUnit.DAYS);
    }

    /*
    BlockingDeque merupakan turunan dari BlockingQueue
    BlockingDeque tidak hanya mendukung FIFO (first in first out), tapi juga LIFO (last in last out)
    Implementasi BlockingDeque hanyalan LinkedBlockingDeque
     */
    @Test
    void blockingDeque() throws InterruptedException {
        final var queue = new LinkedBlockingDeque<String>();
        final var exector = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            final var index = i;
            try {
                queue.putLast("Data-" + index);
                System.out.println("Finish put data: " + index);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        exector.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    var value = queue.takeLast();
                    System.out.println("Receive data: " + value);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        exector.awaitTermination(1, TimeUnit.DAYS);
    }

    /*
    TransferQueue Merupakan turunan dari BlockingQueue yang membolehkan pengirim
    data ke queue menunggu sampai data ada yang menerima
    Implementasi TransferQueue hanyalah LinkedTransferQueue
     */
    @Test
    void transferQueue() throws InterruptedException {
        final var queue = new LinkedTransferQueue<String>();
        final var exector = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            final var index = i;
            exector.execute(() -> {
                try {
                    queue.transfer("Data-" + index);
                    System.out.println("Finish put data: " + index);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        exector.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    var value = queue.take();
                    System.out.println("Receive data: " + value);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        exector.awaitTermination(1, TimeUnit.DAYS);
    }
}
