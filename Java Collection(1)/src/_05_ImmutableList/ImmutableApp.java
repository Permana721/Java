package _05_ImmutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Permana");
        mutable.add("Surya");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Permana", "Surya", "Dharma");
//        elements.add("Arido");
    }
}
