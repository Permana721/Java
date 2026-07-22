package _14_SwitchStatement;
/*
Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
Switch adalah statement percabangan yang sama dengan if, namun  lebih sederhana cara pembuatannya
Kondisi di switch statement hanya untuk perbandingan == saja, tidak bisa menggunakan operator lain seperti >, <, !=, dan lain-lain
 */
public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "C";

        switch (nilai) {
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
                System.out.println("Nilai anda cukup baik");
                break;
            case "C":
                System.out.println("Nilai anda perlu perbaikan");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda mungkin salah jurusan");
        }

        //  Switch Lambda
        /*
        Di Java versi 14, diperkenalkan switch expression dengan lambda
        Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break
        */
        switch (nilai) {
            case "A" -> System.out.println("Anda lulus dengan baik");
            case "B" -> System.out.println("Nilai anda cukup baik");
            case "C" -> System.out.println("Nilai anda perlu perbaikan");
            case "D" -> System.out.println("Anda  tidak lulus");
            default -> System.out.println("Anda mungkin salah jurusan");
        }

        /*
        Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement
        Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement
         */

        // Switch tanpa yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = ("Anda lulus dengan baik");
            case "B", "C" -> ucapan = ("Nilai anda cukup baik");
            case "D" -> ucapan = ("Anda  tidak lulus");
            default -> ucapan = ("Anda mungkin salah jurusan");
        }
        System.out.println(ucapan);

        // Switch dengan yield
        ucapan = switch (nilai){
            case "A": yield "Anda lulus dengan baik";
            case "B", "C": yield "Nilai anda cukup baik";
            case "D": yield "Anda  tidak lulus";
            default: yield  "Anda mungkin salah jurusan";
        };
        System.out.println(ucapan);
    }
}