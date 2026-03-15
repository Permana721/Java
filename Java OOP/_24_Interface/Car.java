package _24_Interface;
/*
Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class child nya.
Namun sebenarnya yang lebih tepat untuk kontrak adalah Interface
Jangan salah sangka bahwa Interface disini bukanlah User Interface
Interface mirip seperti abstract class, yang membedakan adalah di Interface, semua method otomatis abstract, tidak memiliki block
Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa diubah)
Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements
 */
public interface Car {
    void drive();

    int getTire();
}
