package _28_EqualsMethod;

public class ProductApp {
    static void main(String[] args) {
        Product p1 = new Product("Indomie", 3000);
        Product p2 = new Product("Indomie", 3000);
        Product p3 = new Product("Mie Sedaap", 3000);

        // Perbandingan
        System.out.println("p1 == p2  : " + (p1 == p2));        // false
        System.out.println("p1.equals(p2): " + p1.equals(p2));  // true

        System.out.println("p1.equals(p3): " + p1.equals(p3));  // false

        // Test hashCode
        System.out.println("hashCode p1: " + p1.hashCode());
        System.out.println("hashCode p2: " + p2.hashCode());
    }
}
