package _05_Method;
/*
Selain menambahkan field, kita juga bisa menambahkan method ke object
Cara dengan mendeklarasikan method tersebut di dalam block class
Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading di method yang ada di dalam block class
Untuk mengakses method tersebut, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama method nya. Sama seperti mengakses field
 */
public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    } // Method sayHello menggunakan void karena tidak mengembalikan data apapun, dan hanya menampilkan teks hello my name is...
}