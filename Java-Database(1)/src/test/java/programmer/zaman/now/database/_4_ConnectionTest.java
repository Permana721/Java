package programmer.zaman.now.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _4_ConnectionTest {
    @BeforeAll
    static void beforeAll() {
        try {
            Driver postgreDriver = new org.postgresql.Driver();
            DriverManager.registerDriver(postgreDriver);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    void testConnection() {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/java";
        String username = "permana";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            System.out.println("Sukses connect ke database");
        } catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }

    @Test
    void testConnectionClose() {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/java";
        String username = "permana";
        String password = "";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) { // --> Dengan membuat parameter seperti ini
            System.out.println("Sukses membuat koneksi");                                     // Maka akan otomatis menutup koneksi dan tidak perlu membuat connection.close();
        } catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
