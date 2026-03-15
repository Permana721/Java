package _16_TypeCheckCast;

public class FruitApp {
    static void main(String[] args) {
        Fruit buah = new Fruit("Apel");
        buah.sayEat("Permana");

        buah = new Vegetables("Bayam");
        buah.sayEat("Arido");

        sayMakan(new Fruit("Mangga"));
        sayMakan(new Vegetables("Kentang"));
    }

    static void sayMakan(Fruit buah){
        if(buah instanceof Vegetables){
            Vegetables vegetables = (Vegetables) buah;
            System.out.println("Saya seddang makan sayur " + vegetables.name);
        } else {
            System.out.println("Saya sedang makan buah " + buah.name);
        }
    }
}