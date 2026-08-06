package _03_GenericMethod;

public class ArrayHelperApp {
    static void main(String[] args) {
        String[] names = {"Permana", "Surya", "Dharma"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(numbers));
    }
}
