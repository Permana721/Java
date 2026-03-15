package _09_ThisKeyword;

public class PersonApp {
    static void main(String[] args) {
        var person1 = new Person("Permana", "Cirebon");

        System.out.print(person1.name + " ");
        System.out.print(person1.address + " ");
        System.out.print(person1.country + " ");

        person1.sayHello("Arido");

        Person person2 = new Person("Arido");

        Person person3;
        person3 = new Person();
        person3.name = "Shifuka";
        person3.sayHello("Arido");
    }
}
