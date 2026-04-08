package _22_DefaultMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Permana", "Permana Value");
        map.put("Surya", "Surya Value");
        map.put("Dharma", "Dharma Value");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + ":" + s2);
            }
        });
    }
}
