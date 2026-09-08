package programmer.zaman.now.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
Setelah melakukan registrasi Driver ke JDBC, kita sekarang bisa mulai melakukan koneksi ke database
Untuk melakukan koneksi ke database,
kita harus memberi tahu jenis database, host, port, username dan password untuk terkoneksi ke database
Semua itu biasanya digabungkan dalam sebuah string yang biasa disebut JDBC URL
Koneksi ke database direpresentasikan oleh interface java.sql.Connection
 */

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

    /*
    Untuk membuat Connection ke database,
    kita bisa menggunakan static method getConnection() di class java.sql.DriverManager
    Semua method di JDBC rata-rata selalu akan menghasilkan SQLException
     */
    /*
    Tiap database biasanya punya format jdbc url sendiri-sendiri
    Contohnya di PostgreSQL, kita bisa menggunakan format seperti ini :
    jdbc:postgresql://host:port/namadatabase
     */
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

    /*
    Saat kita selesai menggunakan Connection, disarankan untuk selalu menutup Connection tersebut.
    Jika sebuah Connection tidak kita tutup, maka selama aplikasi kita berjalan, koneksi ke datatabase akan selalu terbuka
    Jika Connection yang terbuka ke database terlalu banyak, ditakutkan nanti kita tidak bisa membuka koneksi lagi ke database dikarenakan sudah menyentuh nilai maksimam koneksi yang bisa di tangani oleh database nya
    Contohnya, maksimum Connection di MySQL adalah 151
     */
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

/*
Connection adalah sebuah resource yang sangat mahal
Jika aplikasi kita sangat ketergantungan dengan database,
maka membuka tutup koneksi setiap ada request sangatlah mahal harganya
Connection itu sangat lambat ketika pertama kali dibuat, dan sangat mahal memakan memory
Oleh karena itu,
melakukan manajemen Connection secara manual sangatlah tidak direkomendasikan saat nanti kita membuat aplikasi
 */