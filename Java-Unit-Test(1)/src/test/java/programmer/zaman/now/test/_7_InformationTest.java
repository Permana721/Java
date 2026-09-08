package programmer.zaman.now.test;

import org.junit.jupiter.api.*;

/*
Walaupun mungkin jarang kita gunakan,
tapi kita juga bisa mendapatkan informasi test yang sedang berjalan menggunakan interface TestInfo
Kita bisa menambahkan TestInfo sebagai parameter di function unit test
 */

@DisplayName("information test")
public class _7_InformationTest {

    @Test
    @Tags({
            @Tag("one"),
            @Tag("two")
    })
    @DisplayName("This is test1")
    void test1(TestInfo info) {
        System.out.println(info.getDisplayName());
        System.out.println(info.getTags());
        System.out.println(info.getTestClass().orElse(null));
        System.out.println(info.getTestMethod().orElse(null));
    }
}
