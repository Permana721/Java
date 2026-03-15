package _35_RecordClass;
/*
Kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya berisi getter, equals, hashCode, dan toString method
Record class digunakan untuk mempermudah pembuatan jenis class tersebut
Saat kita membuat record class, secara otomatis Java akan membuatkan getter, equals, hashCode dan toString method secara otomatis, dan juga constructor secara otomatis
Saat membuat record class, secara otomatis kita akan meng-extends class java.lang.Record, yang artinya kita tidak bisa extends class lain. Namun kita tetap bisa meng-implement interface
 */
public record LoginRequest(String username, String password) {
    public LoginRequest{
        System.out.println("Constructor utama dipanggil");
    }

    // Kita juga bisa membuat constructor tambahan, namun harus memanggil constructor utama
    public LoginRequest(String username){
        this(username, "");
        System.out.println("Constructor kedua dipanggil");
    }

    public LoginRequest(){
        this("", "");
    }
}
