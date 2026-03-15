package _37_Exeception;
/*
Saat kita membuat aplikasi, kita tidak akan terhindar dengan yang namanya error
Di Java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam bentuk class exception
Kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh Java
Jika kita ingin membuat exception, maka kita harus membuat class yang extends class Throwable atau turunan-turunannya
 */
public class BlankException extends RuntimeException {
    public BlankException(String message) {
        super(message);
    }
}
