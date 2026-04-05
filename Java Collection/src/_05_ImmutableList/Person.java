package _05_ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Secara default, List di Java baik itu ArrayList ataupun LinkedList datanya bersifat mutable (Bisa diubah)
Di Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi.
Sekali List dibuat, datanya tidak bisa diubah lagi, alias final.
Tapi ingat, data list nya yang tidak bisa diubah, bukan reference object element nya. Kalo misal kiat membuat Immutable List berisikan data Person, field data Person tetap bisa diubah, tapi isi elemen dari Immutable List tidak bisa diubah lagi
Ini cocok ketika kasus-kasus misal, tidak sembarangan code yang boleh mengubah element di List
 */
public class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby){
        hobbies.add(hobby);
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public String getName() {
        return name;
    }
}
