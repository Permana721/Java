package programmer.zaman.now.thread;

public class _4_DaemonApp {
    static void main(String[] args) {         // Thread secara default di set sebagai User Thread
        Thread thread = new Thread(() -> {    // JVM tidak akan pernah berhenti selama masih ada User Thread yang sedang berjalan
            try {
                Thread.sleep(3000);
                System.out.println("Run Thread");
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        });

        thread.setDaemon(true); // Berbeda dengan User Thread, JVM akan langsung berhenti ketika tidak ada user Thread
        thread.start();         // dan mengabaikan Daemon Thread.
                                // Jadi meskipun masih ada Daemon Thread yang berjalan tapi tidak ada User Thread yang berjalan
                                // maka JVM akan langsung menghentikan program nya tanpa memperdulikan bahwa masih ada Daemon Thread yang masih berjalan
    }
}
