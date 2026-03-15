package _27_ToStringMethod;

public class ProductApp {
    static void main(String[] args) {
        Product product = new Product("Pongo 725", 9_000_000);

        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);
    }
}
