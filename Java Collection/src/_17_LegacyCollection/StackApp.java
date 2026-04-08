package _17_LegacyCollection;
import java.util.Stack;
/*
Stack adalah implementasi struktur data tumpukan LIFO (Last In First Out)
Namun fitur yang lebih komplit dan konsisten sudah disediakan di Deque, jadi tidak ada alasan lagi menggunakan class Stack
 */
public class StackApp {
    static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Permana");
        stack.push("Surya");
        stack.push("Dharma");

        for (var value = stack.pop(); value != null; value = stack.pop()){
            System.out.println(value);
        }
    }
}
