package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;

/*
Secara default, lifecycle (siklus hidup) object test adalah independent per method test,
artinya object unit test  akan selalu dibuat baru per method unit test,
oleh karena itu kita tidak bisa bergantung dengan method test lain
Cara pembuatan object test di JUnit ditentukan oleh annotation @TestInstance,
dimana defaultnya adalah Lifecycle.PER_METHOD, artinya tiap method akan dibuat sebuah instance / object baru
Kita bisa merubahnya menjadi Lifecycle.PER_CLASS jika mau,
dengan demikian instance / object test haya dibuat sekali per class, dan method test akan
menggunakan object test yang sama
Hal ini bisa kita manfaatkan ketika membuat test yang tergantung dengan test lain
 */

public class _5_LifecycleTest {
    private String temp;

    @Test
    void testA() {
        temp = "Permana";
    }

    @Test
    void testB() {
        System.out.println(temp);
    }
}
