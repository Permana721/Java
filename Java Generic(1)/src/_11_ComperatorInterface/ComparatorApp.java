package _11_ComperatorInterface;
import _10_ComparableInterface.Person;
import java.util.Arrays;
import java.util.Comparator;
/*
Jika kita ingin mengurutkan class yang kita gunakan, cukup mudah tinggal implement interface Comparable
Namun bagaimana jika class tersebut milik orang lain? Tidak bisa kita ubah?
Maka kita bisa menggunakan interface generic yang bernama Comparator
 */
public class ComparatorApp {
    static void main(String[] args) {
        Person[] people = {
                new Person("Permana", "Indonesia"),
                new Person("Arido", "Indonesia"),
                new Person("Shifuka", "Jepang")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));
    }
}
