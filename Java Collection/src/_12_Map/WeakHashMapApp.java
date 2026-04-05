package _12_Map;
import java.util.Map;
import java.util.WeakHashMap;
/*
WeakHashMap adalah implementasi Map mirip dengan HashMap
Yang membedakan adalah WeakHashMap menggunakan weak key, dimana jika tidak digunakan lagi maka secara otomatis data di WeakHashMap akan dihapus
Artinya, jika terjadi garbage collection di Java, bisa dimungkinkan data di WeakHashMap akan dihapus
WeakHashMap cocok digunakan untuk menyimpan data cache di memory secara sementara
 */
public class WeakHashMapApp {
    static void main(String[] args) {
        Map<Integer, Integer> map = new WeakHashMap<>();

        for (int i = 0; i < 1_000_000; i++){
            map.put(i, i);
        }

        System.gc();

        System.out.println(map.size());
    }
}
