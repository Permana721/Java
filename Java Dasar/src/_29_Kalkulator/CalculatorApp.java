package _29_Kalkulator;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        int hasil;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka 1: ");
        int angka1 = scanner.nextInt();

        System.out.println("1. Tambah\n2. Kurang\n3. Kali\n4. Bagi\n5. Hasil Bagi (%)");
        System.out.println("Pilih Operasi :");
        int operasi = scanner.nextInt();

        System.out.print("Masukkan angka 2: ");
        int angka2 = scanner.nextInt();

        switch (operasi) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                hasil = angka1 / angka2;
                break;
            case 5:
                hasil = angka1 % angka2;
                break;
            default:
                hasil = 0;
        }

        System.out.println("Hasil dari penjumlahan kedua bilangan adalah " + hasil);
    }
}
