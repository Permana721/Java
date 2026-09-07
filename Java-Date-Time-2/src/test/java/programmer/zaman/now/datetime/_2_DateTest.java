package programmer.zaman.now.datetime;

import org.junit.jupiter.api.Test;

import java.util.Date;

/*
Sebelum membahas Date dan Time API yang baru, kita akan sekilas membahas class Date
Date adalah representasi tanggal dan juga waktu di Java sejak versi awal
Karena tidak ada pemisahan antara tanggal dan waktu di class Date, ini memang agak menyulitkan jika kita hanya butuh misal tanggal saja, dan waktu saja
 */

public class _2_DateTest {
    @Test
    void name() {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis());

        /*
        Date menggunakan milisecond setelah UNIX epoch (January 1, 1970 00:00:00 UTC)
        Untuk mendapatkan milisecond saat ini, di Java kita bisa menggunakan System.currentTimeMilis()
         */
        Date date3 = new Date(339958800000L);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
