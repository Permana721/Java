package _13_ImmutableMap;
import java.util.Collections;
import java.util.Map;
// Sama seperti List dan Set, Map pun punya tipe data Immutable
public class ImmutableMapApp {
    static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Permana");

        Map<String, String> map = Map.of(
                "first", "Permana",
                "middle", "Surya",
                "last", "Dharma"
        );

        // map.put("a", "A"); ERROR
    }
}
