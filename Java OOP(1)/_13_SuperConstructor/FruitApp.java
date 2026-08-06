package _13_SuperConstructor;

public class FruitApp {
    static void main(String[] args) {
        var buah = new Fruit("Apel");
        buah.sayEat("Permana");

       var sayur = new Vegetables("Kangkung");
       sayur.sayEat("Arido");
    }
}