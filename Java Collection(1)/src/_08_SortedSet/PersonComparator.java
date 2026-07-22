package _08_SortedSet;
import _05_ImmutableList.Person;
import java.util.Comparator;
/*
SortedSet adalah turunan dari Set, namun di SortedSet elemen-elemen yang dimasukkan kedalam SortedSet akan otomatis diurutkan
Jika element adalah turunan dari interface Comparable, maka secara otomatis akan diurutkan menggunakan comparable tersebut
Jika element bukan turunan dari interface Comparable, maka kita bisa menggunakan Comparator untuk memberi tahun si SortedSet bagaimana cara mengurutkan elemen-elemen nya
 */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
