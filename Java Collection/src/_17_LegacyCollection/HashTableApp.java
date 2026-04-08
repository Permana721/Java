package _17_LegacyCollection;
import java.util.Hashtable;
import java.util.Map;
/*
HashTable adalah implementasi dari Map yang mirip dengan HashMap
Sama seperti Vector, semua method di HashTable memiliki kata kunci synchronized, sehingga performanya lebih lambat dibandingkan HashMap
Dan karena di versi Java baru sudah ada juga ConcurrentHashMap, sehingga penggunaan HashTable sudah jarang sekali ditemui
 */
public class HashTableApp {
    static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("Permana", "Permana Value");
        map.put("Surya", "Surya Value");
        map.put("Dharma", "Dharma Value");

        for(var key: map.keySet()){
            System.out.println(key);
        }
    }
}
