package _18_RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Regular Expression atau disingkat regex adalah cara untuk melakukan pola pencarian
Biasanya dilakukan untuk pencarian dalam data String
Secara sederhana, kita mungkin sudah sering melakukan pencarian text, entah di text editor atau di aplikasi word
Regex adalah pencarian yang lebih advanced dibanding pencarian text biasanya, misal kita ingin mencari semua kata yang mengandung diawali huruf a dan diakhiri huruf a, dan lain-lain
 */
public class RegexApp {
    static void main(String[] args) {
        String name = "Permana Surya Dharma Yoi";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);

        while(matcher.find()){
            String resut = matcher.group();
            System.out.println(resut);
        }
    }
}
