package _12_Map;
import java.util.EnumMap;
import java.util.Map;
/*
EnumMap adalah implementasi Map dimana key nya adalah enum
Karena data enum sudah pasti unik, oleh karena itu cocok dijadikan key di Map
Algoritma pendistribusian key dioptimalkan untuk enum, sehingga lebih optimal dibandingkan menggunakan hashCode() method
 */
public class EnumHashMapApp {
    public static enum Level {
        FREE,
        STANDARD,
        PREMIUM,
        VIP
    }

    static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Permana");
        map.put(Level.VIP, "Surya");

        for (var key: map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
