package _23_MethodReturnValue;
/**
 * Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah method mengembalikan nilai
 * Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan
 * Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method
 * Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu
 */
public class MethodReturnValue {
    static void main(String[] args) {
        var result1 = sum(100, 100);
        System.out.println(result1);

        System.out.println(sum(200, 200));

        System.out.println(hitung(150, "+", 100));
        System.out.println(hitung(300, "-", 100));
        System.out.println(hitung(300, "+", 100));
    }

    static int sum(int a, int b){
        var total = a + b;
        return total; // contoh Method return value
    }

    static int hitung(int a, String operasi, int b){
        switch (operasi){
            case "+":
                return a + b;
            case "-":
                return a - b;
            default:
                return 0;
        }
    }
}
