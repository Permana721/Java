package _10_Inheritance;
/**
 * Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
 * Dalam artian, kita bisa membuat class Parent dan class Child
 * Untuk melakukan pewarisan, di class child,
 * kita harus menggunakan kata kunci extends lalu diikuti dengan nama class parent nya.
 */
class Fruit { // ini adalah class parent
    String name;

    void eat() {
        System.out.println("Buah sedang dimakan.");
    }
}

// ini adalah Inheritance
class Apple extends Fruit { // Ini adalah class child

}
