package _14_SortedMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
/*
SortedMap adalah implementasi Map dengan data key diurutkan sesuai dengan Comparable key atau bisa menggunakan Comparator
SortedMap cocok untuk kasus yang posisi key pada Map harus berurut
 */
public class SortedMapApp {
    static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("Permana", "Permana");
        sortedMap.put("Surya", "Surya");
        sortedMap.put("Dharma", "Dharma");

        for (var key: sortedMap.keySet()){
            System.out.println(key);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

        // immutable.put("Arido", "Arido"); ERROR

    }
}
