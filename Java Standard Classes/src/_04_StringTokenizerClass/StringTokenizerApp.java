package _04_StringTokenizerClass;
import java.util.StringTokenizer;
/*
StringTokenizer class adalah class yang bisa digunakan untuk memotong String menjadi token atau string yang lebih kecil
Kita bisa memotong String dengan delimiter yang kita mau
 */
public class StringTokenizerApp {
    static void main(String[] args) {

        String value = "Permana Surya Dharma";
        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while(tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}