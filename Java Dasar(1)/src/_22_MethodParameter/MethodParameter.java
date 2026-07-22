package _22_MethodParameter;
/*
Kita bisa mengirim informasi ke method yang ingin kita panggil
Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang sudah kita buat
Cara membuat parameter sama seperti cara membuat variabel
Parameter ditempatkan di dalam kurung () di deklarasi method
Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma
 */
public class MethodParameter {
    public static void main(String[] args){
        sayHello("Permana", "Surya");
        sayHello("Arido", "Shifuka");
    }
    static void sayHello(String firstName, String lastName /* Ini adalah contoh Method Parameter */){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
