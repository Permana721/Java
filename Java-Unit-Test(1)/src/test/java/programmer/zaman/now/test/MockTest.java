package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

/*
Saat membuat aplikasi yang besar, source code pun akan semakin besar, struktur class pun akan semakin kompleks
Kita tidak bisa memungkiri lagi bahwa akan ada ketergantungan antar class
Unit test yang bagus itu bisa terprediksi dan cukup nge test ke satu function, jika harus mengetes interaksi antar class, lebih disarankan integration test
Lantas bagaimana jika kita harus mengetest class yang ketergantungan dengan class lain?
Solusinya adalah melakukan mocking terhadap dependency yang dibutuhkan class yang akan kita test
 */

/*
Mocking sederhananya adalah membuat object tiruan
Hal ini dilakukan agar behavior object tersebut bisa kita tentukan sesuai dengan keinginan kita
Dengan mocking, kita bisa membuat request response seolah-olah object tersebut benar dibuat
 */

/*
Ada banyak framework untuk melakukan mocking, namun di materi ini kita akan menggunakan Mockito
Mockito adalah salah satu mocking framework paling populer di Java, dan bisa digunakan juga untuk Kotlin
Dan Mockito bisa diintegrasikan baik dengan JUnit
 */


public class MockTest {

    @Test
    void testMock() {
        List<String> list = Mockito.mock(List.class);

        Mockito.when(list.get(0)).thenReturn("Permana");
        Mockito.when(list.get(100)).thenReturn("Surya");

        System.out.println(list.get(0));
//        System.out.println(list.get(0));
        System.out.println(list.get(100));

        Mockito.verify(list, Mockito.times(1)).get(0);
    }
}
