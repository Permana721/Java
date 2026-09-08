package programmer.zaman.now.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import programmer.zaman.now.test.resolver._8_RandomParameterResolver;

/*
JUnit mendukung pewarisan di test, artinya jika kita membuat class atau interface dan menambahkan informasi test disitu,
maka ketika kita membuat turunannya, secara otomatis semua fitur test nya dimiliki oleh turunannya
Ini sangat cocok ketika kita misal contohnya sering membuat code sebelum dan setelah test yang berulang-ulang,
sehingga dibanding dibuat di semua test class, lebih baik dibuat sekali di parent test class,
dan test class tinggal menjadi child class dari parent test class
 */

@Extensions({
        @ExtendWith(_8_RandomParameterResolver.class)
})
public class _8_AbstractCalculatorTest {
    protected Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
    }
}
