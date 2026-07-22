package _06_Variable;
/**
 * Variable adalah tempat untuk menyimpan data
 * Java adalah bahasa static type, sehingga sebuah  variable hanya bisa digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah-ubah tipe data seperti di bahasa pemrograman PHP atau JavaScript
 * Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variable nya
 * Nama variable tidak boleh mengandung whitespace (spasi, enter, tab), dan tidak boleh seluruhnya number
 * Nama variable juga tidak boleh menggunakan kata kunci yang sudah ada di Java, seperti int, float, if, else, dan lain-lain
 */
public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Permana Surya Dharma";

        System.out.println(name);

        int age = 18;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Arido Shifuka";
        System.out.println(name);

        var firstName = "Permana";
        var middleName = "Surya";
        var lastName = "Dharma";
        /**
         * Sejak versi Java 10, Java mendukung pembuatan variabel dengan kata kunci var, sehingga kita tidak perlu menyebutkan tipe datanya
         * Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable, kita harus menginisiasi value / nilai dari variable tersebut secara langsung
         */
        // var company; error(kalau mau pake "var" isi dari variabel harus langsung di deklarasi)
        var company = "IPUH Corp";
        System.out.println(company);
        /**
         * Secara default, variable di Java bisa diubah-ubah nilainya
         * Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci final
         * Istilah variabel seperti ini, banyak juga yang menyebutnya konstan
         */
        // final String application = "Belajar Java";
        // application = "Belajar PHP"; error karena final = const
    }
}