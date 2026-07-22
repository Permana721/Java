package _07_ConstructorOverloading;

public class PersonApp {
    static void main(String[] args) {
        var person1 = new Person("Permana", "Cirebon"); // code ini akan memanggil constructor 1

        System.out.print(person1.name + " ");
        System.out.print(person1.address + " ");
        System.out.print(person1.country + " ");

        person1.sayHello("Arido"); // code ini akan memanggil method sayHello

        Person person2;
        person2 = new Person("Purbo");
        person2.name = "Purbo"; // code ini akan memanggil constructor 2
        person2.sayHello("Ruto"); // code ini akan memanggil method sayHello

        var person3 = new Person(); //code ini akan memanggil constructor 3
    }
}
