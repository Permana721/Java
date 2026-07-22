package _08_TipeDataArray;
/**
 * Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
 * Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
 * Array bisa menyimpan tipe data primitif maupun tipe data bukan primitif
 */
public class Array {
    public static void main(String[] args) {
        // Membuat Array
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Permana";
        stringArray[1] = "Surya";
        stringArray[2] = "Dharma";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Arido";

        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
            "Permana", "Surya", "Dharma"
        };

        namaNama[0] = null;

        //Array Initializer
        int[] arrayInt = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
            10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        // Array di dalam array
        String[][] members = {
            {"Permana", "Surya"},
            {"Arido", "Shifuka"},
            {"Umam"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[2][0]);
    }
}
