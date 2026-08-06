package _08_VariableShadowing;
/**
 * Variable shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang sama
 * di scope yang menutupi variable dengan nama yang sama di scope diatasnya
 */
public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address) {
        name = name; // tidak dapat mengakses field name karena terhalangi oleh parameter name
        address = address; // tidak dapat mengakses field address karena terhalangi oleh parameter address
    }

    Person(String name) {
        name = name; // tidak dapat mengakses field name karena terhalangi oleh parameter name
    }

    Person() {

    }

    void sayHello(String name) {
        System.out.println("\nHello " + name + ", My name is " + name);
    } // tidak dapat mengakses field name karena terhalangi oleh parameter name
}