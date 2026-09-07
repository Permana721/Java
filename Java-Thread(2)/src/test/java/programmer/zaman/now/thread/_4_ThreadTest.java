package programmer.zaman.now.thread;

import org.junit.jupiter.api.Test;

public class _4_ThreadTest {
    @Test
    void mainThread() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }

    /*
    Thread merupakan proses ringan, membuat Thread bukan berarti kita melakukan pekerjaan
    Untuk membuat pekerjaan, kita perlu membuat object dari interface Runnable,
    selanjutnya object Runnable tersebut bisa kita berikan ke Thread untuk dijalankan
    Saat Thread berjalan, dia akan berjalan secara asynchronous, artinya dia akan berjalan sendiri,
    dan kode program kita akan berlanjut ke kode program selanjutnya
    Untuk menjalankan Thread, kita bisa memanggil function start() milik Thread
     */

    @Test
    void createThread() {
        Runnable runnable = () -> {
            System.out.println("Hello from thread: " + Thread.currentThread().getName());
        };

        var thread = new Thread(runnable);
        thread.start();

        System.out.println("Program selesai");
    }

    /*
    Pada saat proses development, kada kita butuh melakukan simulasi proses yang berjalan dalam waktu tertentu
    Untuk melakukan hal ini, kita bisa memanfaatkan fitur Thread Sleep yang terdapat di Java
    Dengan menggunakan Thread Sleep, kita bisa membuat sebuah thread tertidur dan berhenti dalam waktu yang kita tentukan
    Untuk melakukan hal ini, kita bisa memanggil static method sleep() di class Thread,
    maka secara otomatis Thread saat itu dimana memanggil kode sleep() akan tertidur sesuai dengan waktu milisecond yang
    sudah kita masukkan dalam parameter
    Namun perlu diperhatikan, method sleep bisa menyebabkan error InterruptedException
     */

    @Test
    void threadSleep() throws InterruptedException {
        Runnable runnable = () -> {
            try {
                Thread.sleep(2000);
                System.out.println("Hello from thread: " + Thread.currentThread().getName());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        };

        var thread = new Thread(runnable);
        thread.start();

        System.out.println("Program selesai");

        Thread.sleep(3000);
    }

    /*
    Kadang kita ingin menunggu sampai sebuah thread selesai tugasnya
    Untuk melakukan hal tersebut, kita bisa memanggil method join milik thread yang akan kita tunggu
     */

    @Test
    void threadJoin() throws InterruptedException {
        Runnable runnable = () -> {
            try {
                Thread.sleep(2000);
                System.out.println("Hello from thread: " + Thread.currentThread().getName());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        };

        var thread = new Thread(runnable);
        thread.start();
        System.out.println("Menunggu selesai");
        thread.join();
        System.out.println("Program selesai");
    }


    // Contoh Thread Interrupt yang salah
    @Test
    void falseThreadInterrupt() throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable: " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        };

        var thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
        System.out.println("Menunggu selesai");
        thread.join();
        System.out.println("Program selesai");
    }

    /*
    Interrupt merupakan mengirim sinyal ke thread bahwa thread tersebut harus berhenti melakukan pekerjaannya saat ini
    Untuk melakukan interrupt, kita bisa menggunakan method interrupt() pada thread
    Saat kita memanggil method interrupt(), secara otomatis Thread.interrupted() akan bernilai true
    Perlu diingat, kode program kita pada Runnable harus melakukan pengecekan interrupted, jika tidak, sinyal interrupt tidak ada gunanya
     */

    @Test
    void threadInterruptCorrect() throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                // Manual check interrupted (Biasanya pakai ini)
                if (Thread.interrupted()) {
                    break;
                }
                System.out.println("Runnable: " + i);
                try {
                    Thread.sleep(2000); // Otomatis cek interrupted (Di real projek jarang pakai sleep)
                } catch (InterruptedException exception) {
                    break;
                }
            }
        };

        var thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
        System.out.println("Menunggu selesai");
        thread.join();
        System.out.println("Program selesai");
    }

    /*
    Secara default thread di Java memiliki nama, ini sangat cocok untuk proses debugging ketika terjadi masalah
    Thread name secara default akan menggunakan nama Thread-{counter}
    Namun kita juga bisa mengubahnya dengan menggunakan method setName(name), dan getName() untuk mendapatkan nama thread nya
     */

    @Test
    void threadName() {
        var thread = new Thread(() -> {
            System.out.println("Run in thread: " + Thread.currentThread().getName());
        });
        thread.setName("Permana"); // Ganti nama thread untuk kebutuhan debugging/Logging
        thread.start();
    }

    /*
    Thread di Java memiliki state, state yaitu informasi state sebuah thread
    State digunakan hanya untuk mendapat informasi
    State akan berubah statusnya sesuai dengan apa yang terjadi di thread
    Untuk mendapatkan data state, kita bisa menggunakan method getState() dan akan mengembalikan enum State
     */

    @Test
    void threadState() throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getState()); // Status Thread
            System.out.println("Run in thread: " + Thread.currentThread().getName());
        });
        thread.setName("Permana");
        System.out.println(thread.getState()); // Status Thread

        thread.start();
        thread.join();
        System.out.println(thread.getState()); // Status Thread
    }
}
