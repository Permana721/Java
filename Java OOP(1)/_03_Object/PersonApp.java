package _03_Object;

public class PersonApp {
    // PersonApp juga merupakan class yang berisi method main(), biasanya disebut sebagai entry point class
     public static void main(String[] args) {
        var person1 = new Person(); //new Person = object, yang berarti var person1,2,3 juga adalah object
        Person person2 = new Person();

        Person person3;
        person3 = new Person();
    }
}