package _15_TernaryOperator;
/*
Ternary operator adalah operator sederhana dari if statement
Ternary operator terdiri dari  kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua diambil
Sintaks:
    kondisi ? nilai_true : nilai_false
 */
public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan = nilai >= 75 ? "Selamat anda lulus" : "Silahkan coba lagi";

        System.out.println(ucapan);
    }
}
