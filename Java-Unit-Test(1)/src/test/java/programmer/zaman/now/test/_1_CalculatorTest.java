package programmer.zaman.now.test;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;
import programmer.zaman.now.test.generator.SimpleDisplayNameGenerator;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
//@DisplayName("Test untuk calculator class")
public class _1_CalculatorTest {

    private Calculator calculator = new Calculator();

    /*
    @BeforeEach & @AfterEach akan dieksekusi setiap kali function @Test jalan
    Namun kadang kita ingin melakukan sesuatu sebelum semua unit test berjalan, atau setelah semua unit test berjalan
    Ini bisa dilakukan menggunakan annotation @BeforeAll dan @AfterAll
    Namun hanya static function yang bisa menggunakan @BeforeAll dan @AfterAll
     */
    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    // @BeforeEach digunakan untuk menandai function yang akan dieksekusi sebelum unit test dijalankan
    @BeforeEach
    public void setUp(){
        System.out.println("Before each");
    }

    /*
    @AfterEach digunakan untuk menandai function yang akan dieksekusi setelah unit test dijalankan
    Ingat, bahwa ini akan selalu dieksekusi setiap kali untuk function @Test, bukan sekali untuk class test saja
     */
    @AfterEach
    public void tearDown(){
        System.out.println("After each");
    }

    @Test
    /*
    Kadang agak sulit membuat nama function yang merepresentasikan kasus test nya
    Jika kita ingin menambahkan deskripsi untuk tiap test, kita bisa menggunakan annotation @DisplayName
    Dengan menggunakan annotation @DisplayName, kita bisa menambahkan deskripsi unit testnya
     */
    @DisplayName("Test skenario sukses untuk method add (Integer, Integer)")
    public void testAddSuccess(){
        var result = calculator.add(10, 10);

        /*
        Saat membuat test, kita harus memastikan bahwa test tersebut sesuai dengan ekspektasi yang kita inginkan
        Jika manual, kita bisa melakukan pengecekan if else, namun itu tidak direkomendasikan
        JUnit memiliki fitur untuk melakukan assertions,
        yaitu memastikan bahwa unit test sesuai dengan kondisi yang kita inginkan
        Assertions di JUnit di representasikan dalam class Assertions,
        dan di dalamnya terdapat banyak sekali function static
         */
        assertEquals(20, result);
    }

    @Test
    public void testDivideSuccess(){
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    /*
    Kadang dalam membuat unit test, kita tidak hanya ingin mengetest kasus sukses  atau gagal
    Ada kalanya kita ingin mengetes sebuah exception misalnya
    Assertions juga bisa digunakan untuk mengecek apakah sebuah exception terjadi
     */
    @Test
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    /*
    Kadang ada kalanya kita ingin menonaktifkan unit test,
    misal karena terjadi error di unit test tersebut, dan belum bisa kita perbaiki
    Sebenarnya cara paling mudah untuk menonaktifkan unit test adalah dengan menghapus annotation @Test,
    namun jika kita lakukan itu, kita tidak bisa mendeteksi kalo ada unit test yang di disabled
    Untuk menonaktifkan unit test secara benar, kita bisa menggunakan annotation @Disabled
     */
    @Test
    @Disabled
    public void testComingSoon(){

    }

    /*
    Kadang kita ingin membatalkan unit test ketika kondisi tertentu terjadi
    Untuk membatalkan, kita bisa menggunakan exception TestAbortedException
    Jika JUnit mendapatkan exception TestAbortedException, secara otomatis test tersebut akan dibatalkan
     */
    @Test
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)){
            throw new TestAbortedException("Test dibatalkaan karena bukan DEV");
        }
    }

    /*
    Sebelumnya kita sudah tahu jika ingin membatalkan test, kita bisa menggunakan exception TestAbortException
    Namun sebenarnya ada cara yang lebih mudah, yaitu dengan menggunakan Assumptions
    Penggunaan Assumptions mirip seperti Assertions, jika nilainya tidak sama,
    maka function Assumptions akan thrown TestAbortException,
    sehingga secara otomatis akan membatalkan unit test yang sedang berjalan
     */
    @Test
    public void testAssumptions(){
        assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }
}