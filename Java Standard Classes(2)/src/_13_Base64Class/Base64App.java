package _13_Base64Class;
import java.util.Base64;
/*
Sejak Java 8, Java sudah menyediakan class untuk melakukan encoding base64
Buat programmer web pasti tahu tentang base64, yaitu encoding yang bisa digunakan untuk mengubah binary data ke text yang aman
Aman disini bukan dari sisi security, tapi aman dari kesalahan parsing
 */
public class Base64App {
    static void main(String[] args) {
        String original = "Permana Surya Dharma";

        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);

        System.out.println(result);
     }
}
