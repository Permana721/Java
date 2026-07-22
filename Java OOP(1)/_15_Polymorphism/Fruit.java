package _15_Polymorphism;
/**
 * Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
 * Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
 * Polymorphism erat hubungannya dengan Inheritance
 */
class Fruit {
   String name;

   Fruit(String name){
       this.name = name;
   }

   void sayEat(String name){
       System.out.println("Hallo " + name + " "  + "Saya sedang makan buah " + this.name);
   }
}

class Vegetables extends Fruit {
    Vegetables(String name){
        super(name);
        System.out.println("\nCode di bawah merupakan Child dari Parent constructor Fruit");
    }

    void sayEat(String name){
        System.out.println("Hallo " + name + " "  + "Saya sedang makan sayur " + this.name);
    }
}