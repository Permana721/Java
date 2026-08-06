package _12_SuperKeyword;
/**
 * Super mirip dengan This, jika This digunakan untuk mengakses Field maka Super digunakan untuk mengakses method milik class parent
 * Kadang kita ingin mengakses method yang terdapat di class parent yang sudah terlanjur kita override di class child
 * Untuk mengakses method milik class parent, kita bisa menggunakan kata kunci super
 * Sederhananya, super digunakan untuk mengakses class parent
 * Tidak hanya method, field milik parent class pun bisa kita akses menggunakan kata kunci super
 */
class Fruit {
    String name;

    String eat() { // Method eat yg ada di dalam main class Fruit
        return "Sedang Makan Buah";
    }
}

class Apple extends Fruit {
    String eat() {   // overriding dari method eat yg ada di main class "Fruit"
        return "Sedang Makan Apel";
    }

    String getParentEat() {
        return super.eat();
    }
}
