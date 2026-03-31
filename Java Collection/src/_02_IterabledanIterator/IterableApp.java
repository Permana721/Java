package _02_IterabledanIterator;
import java.util.Iterator;
import java.util.List;
/*
Iterable adalah parent untuk semua collection di Java, kecuali Map
Iterable sendiri sangat sederhana, hanya digunakan agar mendukung for-each loop
Karena semua collection pasti implement iterable, secara otomatis maka semua collection di Java mendukung perulangan for-each, jadi bukan cuma Array nya saja
 */
public class IterableApp {
    static void main(String[] args) {
        Iterable<String> names = List.of("Permana", "Surya", "Dharma");

        for (var name : names) {
            System.out.println(name);
        }

        /*
        Tidak ada magic di Java, sebenarnya for-each di Iterable bisa terjadi karena ada method iterator() yang mengembalikan object Iterator
        Iterator adalah interface yang mendefinisikan cara kita melakukan mengakses element di collection secara sequential
        For-each sendiri muncul sejak Java 5, sebelum Java 5 untuk melakukan iterasi collection, biasanya dilakukan manual menggunakan Iterator object
         */
        System.out.println("ITERATOR");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
