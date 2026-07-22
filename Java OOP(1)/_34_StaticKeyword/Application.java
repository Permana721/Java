package _34_StaticKeyword;

public class Application {
    // Static Block, akan dieksekusi saat class di load pertama kali
    public static final int PROCESSORS;
    static {
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
