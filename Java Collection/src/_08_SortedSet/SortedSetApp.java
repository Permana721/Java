package _08_SortedSet;

import _05_ImmutableList.Person;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
        people.add(new Person("Permana"));
        people.add(new Person("Surya"));
        people.add(new Person("Dharma"));

        for (var person: people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // sortedSet.add(new Person("Arido")); Immutable Sorted set
    }
}
