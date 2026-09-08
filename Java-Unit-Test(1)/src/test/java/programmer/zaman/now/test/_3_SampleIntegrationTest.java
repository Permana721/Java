package programmer.zaman.now.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

/*
Class atau function unit test bisa kita tambahkan tag (tanda) dengan menggunakan annotation @Tag
Dengan menambahkan tag ke dalam unit test, kita bisa fleksibel  ketika menjalan  unit test,
bisa memilih tag mana yang mau di include atau di exclude
Jika kita menambahkan tag di class unit test,
secara otomatis semua function unit test di dalam class tersebut akan memiliki tag tersebut
Jika kita ingin menambahkan beberapa tag di satu class atau function unit test, kita bisa menggunakan annotation @Tags
 */

@Tags({
        @Tag("integration-test")
})
public class _3_SampleIntegrationTest {
    @Test
    void test1(){
        System.out.println("Integration test 1");
    }

    @Test
    void test2() {
        System.out.println("Integration test 2");
    }
}
