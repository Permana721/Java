package _29_HashCodeMethod;
import java.util.HashSet;
import java.util.Set;

public class ProductApp {
    static void main(String[] args) {
        Product p1 = new Product("Indomie", 3000);
        Product p2 = new Product("Indomie", 3000);

        Set<Product> products = new HashSet<>();
        products.add(p1);
        products.add(p2);

        System.out.println("Jumlah data di HashSet: " + products.size());

        System.out.println("HashCode p1: " + p1.hashCode());
        System.out.println("HashCode p2: " + p2.hashCode());
    }
}
