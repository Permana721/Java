package _11_Deque;
import java.util.Deque;
import java.util.LinkedList;
/*
Deque singkatan dari double ended queue, artinya queue yang bisa beroperasi dari depan atau belakang
Jika pada queue, operasi yang didukung ada FIFO, namu pada deque, tidak hanya FIFO, naun juga mendukung LIFO (Last In First Out)
Bisa dibilang deque adalah implementasi struktur data antrian dan stack (tumpukan)
 */
public class DequeApp {
    static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        System.out.println("DEQUE");
        stack.offerLast("Permana");
        stack.offerLast("Surya");
        stack.offerLast("Dharma");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        System.out.println("QUEUE");

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Permana");
        queue.offerLast("Surya");
        queue.offerLast("Dharma");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
