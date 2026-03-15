package _34_StaticKeyword;
/*
Sebelumnya kita sudah sering melihat kata kunci static, namun belum pernah kita bahas
Dengan menggunakan kata kunci static, kita bisa membuat field, method atau class bisa diakses langsung tanpa melalui object nya
Perlu diingat, static hanya bisa mengakses static lainnya
 /*
 Static Dapat Digunakan di
Field, atau disebut class variable, artinya field tersebut bisa diakses langsung tanpa membuat object terlebih dahulu
Method, atau disebut class method, artinya method tersebut bisa diakses langsung tanpa membuat object terlebih dahulu
Block, static block akan otomatis dieksekusi ketika sebuah class di load
Inner Class, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat object outer class  terlebih dahulu. Static pada inner class menyebabkan kita tidak bisa mengakses lagi object outer class nya

 */
public class Constant { // Contoh penggunaan static untuk membuat constant
    public static final String APPLICATION = "Belajar Java";
    public static final int VERSION = 1;
}
