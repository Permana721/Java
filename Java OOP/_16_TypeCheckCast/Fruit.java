package _16_TypeCheckCast;
/**
 * Cast adalah conversi tipe data, dapat digunakan di tipe data primitif maupun bukan primitif
 * Namun agar aman, sebelum melakukan casts, pastikan kita melakukan type check (pengecekan tipe data), dengan menggunakan kata kunci instanceof
 * Hasil operator instanceof adalah boolean, true jika tipe data sesuai, false jika tidak sesuai
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