package _14_ObjectClass;

public class FruitApp {
    static void main(String[] args) {
        var buah = new Fruit("Apel");
        System.out.println(buah); // otomatis memanggil method toString()
        System.out.println(buah.toString());
    }
}