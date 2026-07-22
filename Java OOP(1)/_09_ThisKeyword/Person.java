package _09_ThisKeyword;
/**
 * kita bisa menggunakan kata kunci this untuk mengakses object saat ini
 * Kita juga bisa mengakses field jika nama field dan parameter sama dengan menambahkan this.field
 * This bisa digunakan untuk mengatasi masalah variable shadowing
 */
public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address) {
        this.name = name; // Dengan this.name = mengakses field "name" bukan parameter "name"
        this.address = address; // Dengan this.address = mengakses field "address" bukan parameter "address"
    }

    Person(String name) {
        this.name = name; // Dengan this.name = mengakses field "name" bukan parameter "name"
    }

    Person() {

    }

    void sayHello(String name) {
        System.out.println("\nHello " + name + ", My name is " + this.name);
    } // Dengan this.name = mengakses field "name" bukan parameter "name"
}