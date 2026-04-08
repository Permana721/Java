package _15_NavigableMap;
import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;
/*
NavigableMap adalah turunan dari SortedMap
Namun NagivableMap memiliki kemampuan navigasi berdasarkan operasi kurang dari, lebih dari dan sejenisnya
Misal, kita ingin mengambil data yang lebih dari key x atau kurang dari key y, ini bisa dilakukan di NavigableMap
 */
public class NavigableMapApp {
    static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Permana", "Permana");
        map.put("Surya", "Surya");
        map.put("Dharma", "Dharma");

        for(var key: map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Permana"));
        System.out.println(map.higherKey("Permana"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key: mapDesc.keySet()){
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("Permana", "Permana"); ERROR
    }
}
