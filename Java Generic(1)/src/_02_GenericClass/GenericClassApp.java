package _02_GenericClass;
/*
Generic adalah kemampuan menambahkan parameter type saat membuat class atau method
Berbeda dengan tipe data yang biasa kita gunakan di class di function,
generic memungkinkan kita bisa mengubah-ubah bentuk tipe data sesuai dengan yang kita mau.
Manfaat Generic : Pengecekan ketika proses kompilasi
Tidak perlu manual menggunakan pengecekan tipe data dan konversi tipe data
Memudahkan programmer membuat kode program yang generic sehingga bisa digunakan oleh berbagai tipe data
 */
public class GenericClassApp {
    static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Permana");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        String stringValue = stringMyData.getData();
        String integerValue = String.valueOf(integerMyData.getData());

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
