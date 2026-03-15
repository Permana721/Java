package _11_RuntimeClass;
/*
Ketika aplikasi Java kita berjalan, kita bisa melihat informasi environment tempat aplikasi Java berjalan
Informasi itu terdapat di class Runtime.
Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single object. Kita bisa mengakses  object  tersebut menggunakan static method getRuntime() milik class Runtime
 */
public class RuntimeClassApp {
    static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
    }
}
