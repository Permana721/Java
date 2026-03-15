package _28_EqualsMethod;
import java.util.Objects;
/**
 * Di bahasa pemrograman lain, untuk mengecek apakah sebuah object sama, biasanya menggunakan operator ==, di Java, operator == hanya untuk mengecek data primitif
 * Untuk non primitif pengecekan nya menggunakan method equals
 * Dan secara default, method equals itu akan membandingkan dua buah object secara kesamaan posisi object di memory, artinya jika kita membuat 2 object yang isi fields nya sama, tetap dianggap beda oleh method equals
 */
public class Product {
    String name;
    int price;

    // Constructor
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Override equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // object sama di memory
        if (!(o instanceof Product)) return false; // beda tipe

        Product product = (Product) o;

        return price == product.price && Objects.equals(name, product.name);
    }

    // Override hashCode() (WAJIB jika override equals)
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
