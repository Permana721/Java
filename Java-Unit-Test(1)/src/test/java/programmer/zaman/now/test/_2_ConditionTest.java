package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

/*
Sebenarnya kita bisa menggunakan Assumptions untuk menjalankan unit test berdasarkan kondisi tertentu
Namun JUnit menyediakan fitur yang lebih mudah untuk pengecekan beberapa kondisi,
seperti kondisi sistem operasi, versi java, system property atau environment variable
Ini lebih mudah  dibandingkan menggunakan Assumptions
 */

public class _2_ConditionTest {
    /*
    Untuk kondisi sistem operasi, kita bisa menggunakan beberapa annotation
    @EnabledOnOs digunakan untuk penanda bahwa unit test boleh berjalan di sistem operasi yang ditentukan
    @DisabledOnOs digunakan untuk penanda bahwa unit test tidak boleh berjalan di sistem operasi yang ditentukan
     */
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyOnWindows(){

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnWindows(){

    }

    /*
    Untuk kondisi versi Java yang kita gunakan, kita bisa  menggunakan beberapa annotation
    @EnabledOnJre digunakan untuk penanda bahwa unit test boleh berjalan di Java versi tertentu
    @DisabledOnJre digunakan untuk penanda bahwa unit test tidak boleh berjalan di Java versi tertentu
    @EnabledForJreRange digunakan untuk penanda bahwa unit test boleh berjalan di range Java versi tertentu
    @DisabledForJreRange digunakan untuk penanda bahwa unit test tidak boleh berjalan di range Java versi tertentu
     */
    @Test
    @DisabledOnJre({org.junit.jupiter.api.condition.JRE.JAVA_17})
    void testEnabledOnJava8() {
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_17, max = JRE.JAVA_26)
    void testEnabledOnJava17To26() {

    }
}
