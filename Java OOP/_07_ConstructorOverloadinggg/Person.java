package _07_ConstructorOverloadinggg;
/**
 * Constructor Overloading adalah cara membuat constructor lebih dari satu,
 * dengan syarat tipe data parameter harus berbeda, atau jumlah parameter harus berbeda
 */
public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress) { //Contructor 1 berisi parameter paramName dan paramAddress
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName) { // Constructor 2 hanya berisi parameter paramName
        this(paramName, null);
    }

    Person() { // Constructor 3 tidak memiliki parameter
        this(null);
    }

    void sayHello(String paramName) {
        System.out.println("\nHello " + paramName + ", My name is " + this.name);
    } // Method sayHello
}