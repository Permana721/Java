package _12_Map;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/*
LinkedHashMap adalah implementasi Map dengan menggunakan double linked list
Data di LinkedHashMap akan lebih terprediksi karena datanya akan disimpan berurutan dalam linked list sesuai urutan kita menyimpan data
Namun perlu diperhatikan, proses get data di LinkedHashMap akan semakin lambat karena harus melakukan iterasi data linked list terlebih dahulu
Gunakan LinkedHashMap jika memang kita lebih mementingkan iterasi data Map nya
 */
public class LinkedHashMapApp {
    static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Permana");
        map.put("middle", "Surya");
        map.put("last", "Dharma");

        Set<String> keys = map.keySet();
        for (var key : keys) {
            System.out.println(key);
        }
    }
}
