package _16_EntryMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
Saat kita menyimpan data di Map, data disimpan dalam pair (key-value)
Di Java collection, implementasi Pair di Map bernama Entry
Entry adalah interface sederhana yang berisikan method untuk mengambil key dan value
 */
public class EntryMapApp {
    static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Permana", "Permana Value");
        map.put("Surya", "Surya Value");
        map.put("Dharma", "Dharma Value");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(var entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
