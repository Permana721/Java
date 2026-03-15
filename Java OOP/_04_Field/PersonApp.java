package _04_Field;

public class PersonApp {
    static void main(String[] args) {
        var person = new Person();
        person.name = "Permana Surya Dharma";
        person.address = "Bandung";
        // person.country = "Jepang"; Data tidak bisa di ubah karena memakai variabel final/const

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
    }
}