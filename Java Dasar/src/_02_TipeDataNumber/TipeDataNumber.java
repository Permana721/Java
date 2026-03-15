package _02_TipeDataNumber;
/*
    * Tipe data number adalah tipe data yang digunakan untuk menyimpan nilai angka
    * Tipe data number di Java terdiri dari byte, short, int, long, float, dan double
    * Tipe data byte, short, int, dan long digunakan untuk menyimpan nilai bilangan bulat (integer)
    * Tipe data float dan double digunakan untuk menyimpan nilai bilangan desimal (floating point)
    * Tipe data number juga dapat menyimpan nilai dalam format heksadesimal dan biner
    * Untuk memudahkan membaca angka yang sangat banyak, kita dapat menggunakan underscore (_) sebagai pemisah ribuan
 */
public class TipeDataNumber {
    public static void main(String[] args) {

        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        // Dapat menggunakan underscore untuk memudahkan menghitung angka yang sangat banyak
        int amount = 1_000_000_000;

    }
}