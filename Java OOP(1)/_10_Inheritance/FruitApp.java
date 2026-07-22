package _10_Inheritance;

public class FruitApp {
    static void main(String[] args) {
        { // Mengakses/menggunakan Method Overriding "eat" dari class Fruit ke class Apple
            Apple apple = new Apple();
            apple.name = "Apel Merah";

            System.out.println(apple.name);
            apple.eat();
        }
        { // Mengakses/menggunakan Method utama "eat" dari class Fruit
            Fruit fruit = new Fruit();
            fruit.name = "Nanas";

            System.out.println(fruit.name);
            fruit.eat();
        }
    }
}
