package _41_TryWithResource;
/*
Di Java 7, terdapat fitur baru yang bernama try with resource
Try with resource adalah sebuah mekanisme agar kita lebih mudah menggunakan resource (yang wajib di close) dalam block try
Jika kita ingin menggunakan fitur ini, kita wajib menggunakan interface AutoCloseable, dimana interface ini memiliki method close() yang akan otomatis dipanggil ketika block try selesai
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Throwable throwable) {
            System.out.println("Error membaca file " + throwable.getMessage());
        }

    }
}