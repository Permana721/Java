package _06_MathClass;
/*
Class Math merupakan class utilities yang berisikan banyak sekali static method untuk operasi numerik, seperti
trigonometric, logarithm, akar pangkat, dan lain-lain
 */
public class MathApp {
    static void main(String[] args) {
        var min = Math.min(1000, 2000);
        System.out.println(min);

        var max = Math.max(1000, 2000);
        System.out.println(max);

        System.out.println(Math.PI);
    }
}
