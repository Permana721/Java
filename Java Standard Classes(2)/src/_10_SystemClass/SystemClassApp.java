package _10_SystemClass;
/*
Class System adalah class yang berisikan banyak utility static method di Java, contohnya
sebelumnya kita sudah sering menggunakan method println milik field out di class System.
 */
public class SystemClassApp {
    static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("HOME"));

        System.gc();

        System.exit(101);
        System.out.println("Hello World");
    }
}
