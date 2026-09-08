package programmer.zaman.now.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
Saat kita terkoneksi ke database via Connection, sudah pasti kita ingin mengirim perintah SQL ke database
Connection adalah object yang bertugas sebagai jembatan koneksi dari aplikasi kita ke database,
untuk mengirim perintah SQL, kita bisa menggunakan beberapa object lain,
salah satunya yang akan kita bahas sekarang, yaitu Statement
 */

public class _6_StatementTest {
    /*
    java.sql.Statement adalah interface yang bisa kita gunakan untuk mengirim SQL ke database,
    sekaligus menerima response data dari database
    Ada banyak method yang bisa kita gunakan di Statement untuk mengirim perintah SQL, kita akan bahas satu persatu
    Untuk membuat statement kita bisa menggunakan method createStatement() milik Connection
     */
    @Test
    void testCreateStatement() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        statement.close();
        connection.close();
    }

    @Test
    void testExecuteUpdate() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = """
                INSERT INTO customers(name, email)
                VALUES ('Permana2', 'mana2@mail.com')
                """;
        int update = statement.executeUpdate(sql);
        System.out.println(update);

        statement.close();
        connection.close();
    }

    @Test
    void testExecuteDelete() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = """
                DELETE FROM customers;
                """;
        int update = statement.executeUpdate(sql);
        System.out.println(update);

        statement.close();
        connection.close();
    }

    /*
    Jika kita ingin mengirim perintah SQL yang mengembalikan data, maka kita bisa menggunakan method executeQuery(sql)
    Method ini akan mengembalikan object java.sql.ResultSet, yaitu berisikan data-data hasil query SQL yang kita kirimkan
    Pembahasan interface ResultSet akan kita bahas lebih detail lagi nanti di chapter tersendiri
     */
    @Test
    void testExecuteQuery() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = """
                SELECT * FROM customers
                """;
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");

            System.out.println(String.join(" | ", id, name, email));
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
