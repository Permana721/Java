package _17_VariableHiding;
/**
 * Variable hiding merupakan masalah yang terjadi ketika kita membuat nama field sama di class child dengan nama field di class parent
 * Tidak ada yang namanya field overriding, ketika kita buat ulang nama field di class class, itu berarti variable hiding
 * Untuk mengatasi variable hiding, caranya kita bisa menggunakan super keyword
 * Yang membedakan variable hiding dan method overriding adalah ketika sebuah object di casts
 * Saat object di casts, method akan tetap mengakses method overriding, namun variable akan mengakses variable yang ada di class nya
 */
class Parent {
    String name;
    void doIt() {
        System.out.println("Do it in Parent");
    }
}

class Child extends Parent {
    // String name; -> ini addalah contoh code variable hiding
    String childName; // ini lebih sesuai dengan best practice
    void doIt() {
        System.out.println("Do it in Child");
    }
}
