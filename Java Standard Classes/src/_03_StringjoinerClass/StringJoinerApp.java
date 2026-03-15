package _03_StringjoinerClass;
import java.util.StringJoiner;
/*
StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan dengan delimiter
StringJoiner juga mendukung prefix dan suffix jika kita ingin menambahkannya
Ini sangat bagus ketika ada kasus misal kita ingin mem-print Array dengan format yang kita mau misalnya
 */
public class StringJoinerApp {
    static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Permana");
        joiner.add("Surya");
        joiner.add("Dharma");

        String value = joiner.toString();
        System.out.println(value);
    }
}
