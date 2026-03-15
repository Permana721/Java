package _15_Polymorphism;

public class FruitApp {
    static void main(String[] args) {
        Fruit buah = new Fruit("Apel");
        buah.sayEat("Permana");

        buah = new Vegetables("Bayam"); // Ini adalah contoh code polymorphism dari var buah yang menampung Constructor Fruit menjadi var buah yang menampung Contructor Vegetables
        buah.sayEat("Arido"); // sehingga var buah memiliki semua method yang dimiliki oleh class Vegetables

        sayMakan(new Fruit("Mangga"));
        sayMakan(new Vegetables("Kentang"));
    }

    static void sayMakan(Fruit buah){
        System.out.println("Saya sedang makan " + buah.name);
    }
}