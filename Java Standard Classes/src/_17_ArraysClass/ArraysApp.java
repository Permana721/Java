package _17_ArraysClass;
import java.util.Arrays;
/*
Arrays class adalah class yang berisikan static method yang bisa kita
gunakan untuk memanipulasi data array, seperti pencarian dan pengurutan
 */
public class ArraysApp {
    static void main(String[] args) {
        int[] numbers = {
                1, 3, 982, 21, 92, 22, 90, 87, 34
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 87));
        System.out.println(Arrays.binarySearch(numbers, 982));
        System.out.println(Arrays.binarySearch(numbers, 100));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
