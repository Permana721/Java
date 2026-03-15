package _34_StaticKeyword;

public class MathUtil { // Contoh static method untuk menghitung penjumlahan
    public static int sum(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
