package _05_Lambda_Di_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first_name", "Permana");
        map.put("middle_name", "Surya");
        map.put("last_name", "Dharma");

        // for loop
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // forEach anonymous class
        map.forEach(new BiConsumer<String, String>() {
            public void accept(String key, String value){
                System.out.println(key + ":" + value);
            }
        });

        // lambda
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
