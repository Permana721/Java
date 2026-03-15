package _05_NumberClass;
/*
Semua number class yang bukan primitif memiliki parent class yang sama, yaitu class Number
Class number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain
Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya
 */
public class NumberClassApp {
    static void main(String[] args) {
        Integer intvalue = 10;

        Long longValue = intvalue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "10000";

        Integer contohInt = Integer.valueOf(contoh);
        System.out.println(contohInt);
    }
}
