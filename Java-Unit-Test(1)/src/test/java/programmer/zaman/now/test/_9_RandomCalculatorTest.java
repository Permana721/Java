package programmer.zaman.now.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Random;

public class RandomCalculatorTest extends _8_AbstractCalculatorTest {
    @Test
    void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    /*
    JUnit mendukung eksekusi unit test berulang kali sesuai dengan jumlah yang kita tentukan
    Untuk mengulang eksekusi unit test, kita bisa menggunakan annotation @RepeatedTest di method unit test nya
    @RepeatedTest juga bisa digunakan untuk mengubah detail nama test nya,
    dan kita bisa menggunakan value {displayName} untuk mendapatkan display name,
    {currentRepetition} untuk mendapatkan perulangan ke berapa saat ini,
    dan {totalRepetitions} untuk mendapatkan total perulangan nya
     */
    @DisplayName("Test random calculator")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandomRepeat(TestInfo info, Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    /*
    @RepeatedTest juga memiliki object RepetitionInfo yang di inject oleh class RepetitionInfoParameterResolver,
    sehingga kita bisa mendapatkan informasi RepetitionInfo melalui parameter function unit test
     */
    @DisplayName("Test random calculator")
    @RepeatedTest(
            value = 10,
            name = "{displayName}"
    )
    void testRandomRepeatInfo(TestInfo info, Random random, RepetitionInfo repetitionInfo) {
        System.out.println(info.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions());
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    /*
    Sebelumnya kita sudah tau jika ingin menambahkan parameter di function unit test, maka kita perlu membuat ParameterResolver
    Namun jika terlalu banyak membuat ParameterResolver juga agak menyulitkan kita
    JUnit memiliki fitur yang bernama @ParameterizedTest,
    dimana jenis unit test ini memang khusus dibuat agar dapat menerima parameter
    Yang perlu kita lakukan adalah dengan mengganti @Test menjadi @ParameterizedTest
     */

    /*
    @ParameterizedTest mendukung beberapa sumber parameter, yaitu
    @ValueSource, untuk sumber Number, Char, Boolean dan String
    @EnumSource, untuk sumber berupa enum
    @MethodSource, untuk sumber dari static method
    @CsvSource, untuk sumber beruba data CSV
    @CsvFileSource, untuk sumber beruba file CSV
    @ArgumentSource, untuk data dari class ArgumentProvider
     */
    public static List<Integer> parameterSource(){
        return List.of(1,2,34,56,33,65,67,45);
    }

    @DisplayName("Test Calculator")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @MethodSource({"parameterSource"})
    void testWithParameter(Integer value) {
        var expected = value + value;
        var result = calculator.add(value, value);

        Assertions.assertEquals(expected, result);
    }
}
