package _13_IfStatement;
/*
Dalam Java, if adalah salah satu kata kunci yang digunakan untuk percabangan
Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
Hampir di semua bahasa pemrograman mendukung if expression
 */
public class IfStatement {
    static void main(String[] args) {
        var nilai = 50;
        var absen = 50;

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai anda A");
        }
        /*
        Kadang dalam If, kita butuh membuat beberapa kondisi
        Kasus seperti ini, di Java kita bisa menggunakan Else If expression
        Else if di Java bisa lebih dari satu
         */
        else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai anda C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai anda D");
        }
        /*
        Blok if akan dieksekusi ketika kondisi if bernilai true
        Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
        Hal ini bisa dilakukan menggunakan else expression
         */
        else {
            System.out.println("Anda tidak lulus");
        }
    }

    public static class OperasiBoolean {
        static void main(String[] args) {
            var absen = 75;
            var nilaiAkhir = 80;

            boolean lulusAbsen = absen >= 75;
            boolean lulusNilai = nilaiAkhir >= 75;

            var lulus = lulusAbsen && lulusNilai;
            System.out.println(lulus);
        }
    }
}
