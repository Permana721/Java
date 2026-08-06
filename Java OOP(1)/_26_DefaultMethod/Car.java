package _26_DefaultMethod;

/*
Sebelumnya kita tahu bahwa di interface, kita tidak bisa membuat method konkrit yang memiliki block method
Namun sejak versi Java 8, ada fitur default method di interface.
Fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang implement interface tersebut
Ketika kita menambah satu method di interface, secara otomatis semua class yang implement akan rusak karena harus meng-override method tersebut
Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface.
 */
public interface Car extends HasBrand, isMaintenance {
    void drive();

    int getTire();

    default boolean isBig(){
        return false;
    }
}
