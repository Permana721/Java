package _12_Map;
import java.util.IdentityHashMap;
import java.util.Map;
/*
IdentittyHashMap adalah implementasi Map sama seperti HashMap
Yang membedakan adalah cara pengecekan kesamaan datanya, tidak menggunakan function equals, melainkan menggunakan operator == (reference equality)
Artinya data dianggap sama, jika memang lokasi di memory tersebut sama
 */
public class IdentityHashMapApp {
    static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1, "Permana");
        map.put(key2, "Permana");

        System.out.println(map.size());
    }
}
