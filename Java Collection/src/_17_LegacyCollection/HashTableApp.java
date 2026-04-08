package _17_LegacyCollection;

import java.util.Hashtable;
import java.util.Map;

public class HasgTableApp {
    static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("Permana", "Permana Value");
        map.put("Surya", "Surya Value");
        map.put("Dharma", "Dharma Value");

        for(var key: map.keySet()){
            System.out.println(key);
        }
    }
}
