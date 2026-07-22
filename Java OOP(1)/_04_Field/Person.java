package _04_Field;
/*
Fields / Properties / Attributes adalah data yang bisa kita sisipkan di dalam Object
Namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan data apa aja yang dimiliki object tersebut di dalam deklarasi class-nya
Membuat field sama seperti membuat variable, namun ditempatkan di block class
 */
public class Person {
    String name; //field
    String address; //field
    final String country = "Indonesia"; // country = field, "Indonesia" = String literal/data
}