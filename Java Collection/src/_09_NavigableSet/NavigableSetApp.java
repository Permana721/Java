package _09_NavigableSet;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
/*
NavigableSet adalah turunan dari SortedSet
NavigableSet menambah method-method untuk melakukan navigasi pencarian element, seperti mencari elemen yang lebih besar dari, kurang dari, membalikkan urutan set, dan lain-lain
 */
public class NavigableSetApp {
    static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Permana", "Surya", "Dharma", "Arido", "Shifuka", "Japan"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> dharma = names.tailSet("Dharma", true);

        for (var name: dharma){
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Hello"); ERROR Immutable Navigable Set
    }
}
