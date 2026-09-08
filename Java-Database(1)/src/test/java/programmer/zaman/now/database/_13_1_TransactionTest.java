package programmer.zaman.now.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
Fitur paling bermanfaat di database salah satu nya adalah database transaction
Fitur database transaction pun bisa kita jalankan menggunakan JDBC
Jika belum mengerti apa itu database transaction,
silahkan tonton course saya tentang database MySQL, disana saya jelaskan secara terperinci
 */

public class _13_1_TransactionTest {
    /*
    Secara default, Connection yang kita buat menggunakan JDBC memiliki sifat auto commit
    Auto commit artinya setiap perintah SQL yang kita kirim akan langsung di commit secara otomatis
    Karena dalam database transaction, kita biasanya melakukan commit transaction setelah semua proses selesai,
    maka kita perlu mematikan auto commit di JDBC
    Untuk mematikan fitur auto commit di JDBC, kita bisa menggunakan method di Connection bernama setAutoCommit(false)
    Setelah selesai melakukan proses ,
    kita bisa melakukan commit transaction dengan menggunakan method commit() milik Connection
    Untuk membatalkan proses transaksi (rollback), kita bisa menggunakan method rollback() milik Connection
     */
    @Test
    void testCommit() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        connection.setAutoCommit(false);

        String sql = "INSERT INTO comments(email, comment) VALUES (?, ?)";
        for (int i = 0; i < 100; i++){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "mana@mail.com");
            preparedStatement.setString(2, "hi");
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }

        connection.commit(); // Wajib tambahin commit di akhir Transaction
        connection.close();
    }

    @Test
    void testRollback() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        connection.setAutoCommit(false);

        String sql = "INSERT INTO comments(email, comment) VALUES (?, ?)";
        for (int i = 0; i < 100; i++){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "mana@mail.com");
            preparedStatement.setString(2, "hi");
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }

        connection.rollback();
        connection.close();
    }

}
