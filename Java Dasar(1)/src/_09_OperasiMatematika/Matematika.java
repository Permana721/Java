package _09_OperasiMatematika;

public class Matematika {
    public static void main(String[] args) {

        { // Operasi Matematika
            int a = 100;
            int b = 10;

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
        }

        { // Augmented Assignments
            int c = 100;

            c += 10;
            System.out.println(c);

            c -= 10;
            System.out.println(c);

            c *= 10;
            System.out.println(c);
        }

        { // Unary Operator
            int d = 100;

            d++;
            System.out.println(d);

            d--;
            System.out.println(d);

            System.out.println(!false);
        }
    }
}
