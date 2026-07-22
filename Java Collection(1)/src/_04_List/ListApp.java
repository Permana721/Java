package _04_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    static void main(String[] args) {
        List<String> strings = new ArrayList<>(100);
        List<String> strings1 = new LinkedList<>();

        strings.add("Permana");
        strings.add("Surya");

        strings.set(0, "Kurosaki");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }
    }
}
