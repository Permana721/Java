package _06_Constructor;
/*
Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung ()
Di dalam class Java, kita bisa membuat constructor, constructor adalah method  yang akan dipanggil saat pertama kali Object dibuat.
Mirip seperti di method, kita bisa memberi parameter pada constructor
Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value
 */
public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    } // Constructor adalah method  yang akan dipanggil saat pertama kali Object dibuat
      // Dan tidak membutuhkan return value seperti void, int, String, dll

    void sayHello(String paramName) {
        System.out.println("\nHello " + paramName + ", My name is " + this.name);
    }
}
