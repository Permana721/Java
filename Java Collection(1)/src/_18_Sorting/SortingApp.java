package _18_Sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
Sorting atau pengurutan adalah algoritma yang sudah biasa kita lakukan
Di Java Collection juga sudah disediakan cara untuk melakukan pengurutan, jadi kita tidak perlu melakukan pengurutan secara manual
Namun perlu diingat, yang bisa di sort hanyalah List, karena Set, Queue, Deque dan Map cara kerjanya sudah khusus, jadi pengurutan hanya bisa dilakukan di List
 */
public class SortingApp {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.addAll(List.of("Permana", "Surya", "Dharma", "Arido", "Shifuka"));

        Collections.sort(list);

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list, reverse);

        for(var value: list){
            System.out.println(value);
        }
    }
}
