package _14_ObjectClass;
/**
 * Di Java, setiap class yang kita buat secara otomatis adalah turunan dari class Object
 * Walaupun tidak secara langsung kita eksplisit menyebutkan extends Object, tapi secara otomatis Java akan membuat class kita extends Object
 * Bisa dikatakan class Object adalah superclass untuk semua class yang ada di Java
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
    }

    void sayEat(String name){
        System.out.println("Hallo " + name + " "  + "Saya sedang makan sayur " + this.name);
    }
}