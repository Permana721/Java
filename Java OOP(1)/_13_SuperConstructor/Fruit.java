package _13_SuperConstructor;
/**
 * Super Constructor digunakan untuk memanggil Constructor yang ada pada parent agar dapat digunakan oleh child
 * dengan cara super(parameter)
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