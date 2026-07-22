package _17_WhileLoop;
/*
While loop adalah versi perulangan yang lebih sederhana dibanding for loop
Di while loop, hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement
 */
public class WhileLoop {
    public static void main(String[] args) {
        var counter = 1;

        while (counter <= 10){
            System.out.println("Perulangan ke " + counter);
            counter++;
        }
    }
}
