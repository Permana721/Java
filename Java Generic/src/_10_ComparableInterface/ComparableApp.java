package _10_ComparableInterface;

import java.util.Arrays;

public class ComparableApp {
    static void main(String[] args) {
        Person[] people = {
                new Person("Permana", "Indonesia"),
                new Person("Arido", "Indonesia"),
                new Person("Shifuka", "Jepang")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
