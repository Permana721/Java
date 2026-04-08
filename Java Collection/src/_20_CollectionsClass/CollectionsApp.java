package _20_CollectionsClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Collections adalah class yang berisikan utility static method untuk membantu kita menggunakan Java Collection
Di materi-materi sebelumnya kita sudah bahas beberapa, seperti membuat immutable collection misalnya
Namun sebenarnya masih ada banyak static method yang bisa kita gunakan di class Collections
 */
public class CollectionsApp {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Permana", "Surya", "Dharma", "Arido", "Shifuka"));

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
