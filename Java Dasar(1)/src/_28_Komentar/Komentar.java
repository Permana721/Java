package _28_Komentar;
/*
Kadang dalam membuat program, kita sering menempatkan komentar di kode program tersebut
Komentar adalah kode program yang akan di hiraukan saat proses kompilasi, sehingga di binary code Java, tidak akan ada kode komentar tersebut
Biasanya komentar digunakan untuk dokumentasi
Komentar juga bisa digunakan untuk menonaktifkan kode program sementara, dengan cara mengubah kode program tersebut menjadi komentar
 */
public class Komentar {
    static void main(String[] args) {
        System.out.println(sum(10, 10));
    }

    /** Contoh komentar 1
     * Method untuk menjumlahkan value1 dan value2
     * @param value1 angka pertama
     * @param value2 angka kedua
     * @return hasil penjumlahan value1 dan value2
     */

    /*
    Contoh komentar 2
     */

    // Contoh komentar 3
    static int sum(int value1, int value2){
        // Jumlahkan value1 ditambah value2
        return value1 + value2;
    }
}
