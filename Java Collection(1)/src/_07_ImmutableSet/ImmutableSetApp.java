package _07_ImmutableSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/*
Sama seperti List, Set pun memiliki tipe data Immutable
Cara pembuatan immutable Set di Java mirip dengan pembuatan immutable List
 */
public class ImmutableSetApp {
    static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Permana");

        Set<String> mutable = new HashSet<>();
        mutable.add("Permana");
        mutable.add("Surya");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Permana", "Surya");
        // set.add("Permana"); ERROR
        // set.remove("Permana"); ERROR
    }
}
