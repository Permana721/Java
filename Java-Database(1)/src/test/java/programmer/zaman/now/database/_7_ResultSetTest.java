package programmer.zaman.now.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
Seperti yang sudah kita bahas sebelumnya di Statement,
ketika kita melakukan query, maka akan menghasilkan java.sql.ResultSet
ResultSet adalah representasi data hasil query dari database
ResultSet itu mirip seperti iterator,
jadi kita bisa melakukan perulangan di ResultSet untuk mendapatkan data tiap record nya
 */

public class _7_ResultSetTest {
    @Test
    void testExecuteQuery() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = """
                SELECT * FROM customers
                """;
        ResultSet resultSet = statement.executeQuery(sql);

        /*
        Cara kerja ResultSet adalah seperti cursor,
        dimana untuk maju kita menggunakan method next() dan untuk mundur, kita bisa menggunakan method previous()
        Untuk mendapatkan data tiap kolom pada saat sekarang kita berada di lokasi cursor nya,
        kita bisa menggunakan banyak sekali method getXxx(column) di ResultSet
        Kita bisa sesuaikan dengan tipe data kolom tersebut, misal getString(column), getInt(column), dan lain-lain
         */
        while (resultSet.next()){
            // iterasi tiap data
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");

            System.out.println(
                    String.join(", ", id, name, email)
            );
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
