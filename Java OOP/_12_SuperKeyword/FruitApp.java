package _12_SuperKeyword;

public class FruitApp {
    static void main(String[] args) {
        { // Mengakses/menggunakan Method utama "eat" dari class Fruit
            Fruit fruit = new Fruit();
            System.out.println(fruit.eat());
        }
        { // Mengakses/menggunakan Method Overriding "eat" dari class Fruit ke class Apple
            Apple apple = new Apple();
            System.out.println(apple.eat());
        }
        {
            var parentEat = new Apple();
            System.out.println(parentEat.getParentEat());
        }
    }
}
