package programmer.zaman.now.thread;

public class MainApplication {
    static void main(String[] args) {
       String name = Thread.currentThread().getName();
       System.out.println(name);
    }
}
