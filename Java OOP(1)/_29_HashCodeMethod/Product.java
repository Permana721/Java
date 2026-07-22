package _29_HashCodeMethod;
import java.util.Objects;
/**
 * Method hashCode adalah method representasi integer object kita, mirip toString yang merupakan representasi String, hashCode adalah representasi integer
 * HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, Set, dan lain-lain, karena cukup menggunakan hashCode method untuk mendapatkan identitas unique object kita
 * Secara default hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa mengoverride nya jika kita ingin
 */
public class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;
        return price == product.price &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}