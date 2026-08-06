package _06_Constructor;

public class PersonApp {
    static void main(String[] args) {
        //Menggunakan Constructor
        var person = new Person("Permana", "Cirebon");

        System.out.print(person.name + " ");
        System.out.print(person.address + " ");
        System.out.print(person.country + " ");

        person.sayHello("Arido");
    }
}
