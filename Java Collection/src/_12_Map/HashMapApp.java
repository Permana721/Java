package _12_Map;
import java.util.HashMap;
import java.util.Map;
/*
HashMap adalah implementasi Map yang melakukan distribusi key menggunakan hashCode() function
Karena HashMap sangat bergantung dengan hashCode() function, jadi pastikan kita harus membuat function hashCode seunik mungkin, karena jika terlalu banyak nilai hashCode() yang sama, maka pendistribusian key nya tidak akan optimal sehingga proses get data di Map akan semakin lambat
Di HashMap pengecekan data duplikat dilakukan dengan menggunakan method equals nya
 */
public class HashMapApp {
    static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Permana");
        map.put("name.middle", "Surya");
        map.put("name.last", "Dharma");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
