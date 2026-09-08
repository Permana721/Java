package programmer.zaman.now.test;

import org.junit.jupiter.api.*;

/*
Secara default, urutan eksekusi unit test tidak ditentukan,
jadi jangan berharap  jika sebuah method berada diatas method lainnya, maka akan dijalankan lebih dulu
Hal ini karena memang sebaiknya method unit test itu harus independen, tidak saling ketergantungan
Secara default pun, object class unit test akan selalu dibuat ulang tiap method,
jadi jangan berharap kita bisa menyimpan data di variable untuk digunakan di unit test method selanjutnya
 */

//@TestMethodOrder(MethodOrderer.DisplayName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
// Salah satu keuntungan saat menggunakan Lifecycle.PER_CLASS adalah,
// kita bisa menggunakan @BeforeAll dan @AfterAll di method biasa, tidak harus menggunakan function object  / static
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class _4_OrderedTest {

    private int counter = 0;

    /*
    JUnit mendukung perubahan urutan eksekusi test jika kita mau menggunakan annotation @TestMethodOrder,
    ada beberapa cara yang bisa kita lakukan
    Alphanumeric, artinya urutan eksekusi unit test akan diurutkan berdasarkan alphanumeric
    Random, artinya urutan urutan eksekusi unit test akan dieksekusi secara random
    OrderAnnotation, artinya urutan eksekusi  unit  test akan
    mengikuti annotation @Order yang ada di tiap method unit test
     */
    @Test
    @Order(1)
    void test3() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(2)
    void test2() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(3)
    void test1() {
        counter++;
        System.out.println(counter);
    }

    /*
    Jika kita ingin membuat cara mengurutkan urutan unit test function sendiri,
    kita bisa dengan mudah tinggal membuat class baru turunan dari MethodOrderer interface
     */
}