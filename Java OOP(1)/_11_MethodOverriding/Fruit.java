package _11_MethodOverriding;
/**
 * Method overriding adalah kemampuan mendeklarasikan ulang
 * method di child class, yang sudah ada di parent class
 */
class Fruit {
    String name;

    void eat() { // Method eat yg ada di dalam main class Fruit
        System.out.println("Buah sedang dimakan.");
    }
}

class Apple extends Fruit {
    void eat() {   // overriding dari method eat yg ada di main class "Fruit"
        System.out.println("Apel dimakan dengan renyah.");
    }
}
