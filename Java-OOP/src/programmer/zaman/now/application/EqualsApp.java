package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Permana";
        first = first + " " + "Surya";

        System.out.println(first);

        String second = "Permana Surya";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Permana Surya";

        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
