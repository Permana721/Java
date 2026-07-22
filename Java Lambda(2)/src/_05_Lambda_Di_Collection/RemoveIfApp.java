package _05_Lambda_Di_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Permana", "Surya", "Dharma"));

        // Remove if anonymous class
//        names.removeIf(new Predicate<String>() {
//            public boolean test(String value) {
//                return value.length() > 5;
//            }
//        });

        // lambda
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);
    }
}
