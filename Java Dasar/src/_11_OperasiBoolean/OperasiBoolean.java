package _11_OperasiBoolean;
/*
    * Operasi boolean adalah operasi yang menghasilkan nilai boolean (true/false)
    * Operator boolean di Java:
    * 1. AND (&&) : menghasilkan true jika kedua operand bernilai true
    * 2. OR (||) : menghasilkan true jika salah satu operand bernilai true
    * 3. NOT (!) : menghasilkan true jika operand bernilai false, dan sebaliknya
    * 4. XOR (^) : menghasilkan true jika salah satu operand bernilai true, tetapi tidak keduanya
    * 5. AND (bitwise) (&) : menghasilkan true jika kedua operand bernilai true, tetapi juga memeriksa setiap bit dari operand
    * 6. OR (bitwise) (|) : menghasilkan true jika salah satu operand bernilai true, tetapi juga memeriksa setiap bit dari operand
    * 7. XOR (bitwise) (^) : menghasilkan true jika salah satu operand bernilai true, tetapi tidak keduanya, tetapi juga memeriksa setiap bit dari operand
    * 8. NOT (bitwise) (~) : menghasilkan true jika operand bernilai false, dan sebaliknya, tetapi juga memeriksa setiap bit dari operand
 */
public class OperasiBoolean {
    static void main(String[] args) {
        var absen = 75;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
