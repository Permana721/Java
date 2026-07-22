package _39_Error;

public class DatabaseApp {
    static void main(String[] args) {
        connectDatabase("Admin", null);
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek kee database, username atau password null");
        }
    }
}


