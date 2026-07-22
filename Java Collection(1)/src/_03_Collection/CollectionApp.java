package _03_Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/*
Selain Iterable interface, parent class semua collection di Java adalah Collection
Kalo Iterable interface digunakan sebagai kontrak untuk meng-iterasi data secara sequential
Collection merupakan kontrak untuk memanipulasi data collection, seperti menambah, menghapus dan mengecek isi data collection
Tidak ada direct implementation untuk Collection, karena collection nanti akan dibagi lagi menjadi List, Set dan Queue
 */
public class CollectionApp {
    static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Permana");
        collection.add("Surya");
        collection.add("Dharma");
        collection.addAll(List.of("Arido", "Shifuka", "Japan"));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println("REMOVE");
        collection.remove("Permana");
        collection.removeAll(List.of("Shifuka", "Japan"));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println(collection.contains("Permana"));

        System.out.println(collection.containsAll(List.of("Dharma", "Arido")));
    }
}
