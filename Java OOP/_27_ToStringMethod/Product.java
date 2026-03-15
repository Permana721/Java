package _27_ToStringMethod;
/**
 * toString() adalah method yang terdapat di class Object
 * Method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String
 * Secara default, toString() ini akan menghasilkan :
 * namaclass + @ + hashCode
 * Namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca
 */
public class Product {
    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Name : " + name + "\nPrice : " + price;
    }
}
