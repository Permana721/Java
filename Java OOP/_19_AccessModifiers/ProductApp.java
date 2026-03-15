package _19_AccessModifiers;

public class ProductApp {
    static void main(String[] args) {
        Product product = new Product();
        product.name = "Indomie"; // Bisa di akses karena berada di dalam satu package yang sama
        product.price = 3100; // Bisa di akses karena berada di dalam satu package yang sama

        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
