package _21_AbstactCollection;

import java.util.Queue;

public class SingleQueueApp {
    static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.offer("Permana"));
        System.out.println(queue.offer("Surya"));
        System.out.println(queue.offer("Dharma"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
