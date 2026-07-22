package _10_Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
// Queue adalah implementasi dari struktur data Antrian atau FIFO (First In First Out)
public class QueueApp {
    static void main(String[] args) {
        /*
        ArrayDeque vs LinkedList vs PriorityQueue
        ArrayDeque menggunakan array sebagai implementasi queue nya
        LinkedList menggunakan double linked list sebagai implementasi queue nya
        PriorityQueue menggunakan array sebagai implementasi queue nya, namun diurutkan mennggunakan Comparable atau Comparator
         */
        Queue<String> queue = new PriorityQueue<>(); // Berurutan sesuai abjad
        // Queue<String> queue = new LinkedList<>(); Berurutan sesuai query
        // Queue<String> queue = new ArrayDeque<>(); Berurutan sesuai query

        queue.add("Permana");
        queue.add("Surya");
        queue.add("Dharma");

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
