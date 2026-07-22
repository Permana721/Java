package _05_Lambda_Di_Collection;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    static void main(String[] args) {
        List<String> list = List.of("Permana", "Surya", "Dharma");

        // for loop
        for (var value : list){
            System.out.println(value);
        }

        // ForEach Anonymous class
        list.forEach(new Consumer<String>() {
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // lambda
        list.forEach(value -> System.out.println(value));

        // lambda method reference
        list.forEach(System.out::println);
    }
}
