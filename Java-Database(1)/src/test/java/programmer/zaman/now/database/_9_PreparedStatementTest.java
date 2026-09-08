package programmer.zaman.now.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
PreparedStatement adalah turunan dari Statement,
jadi apapun yang bisa dilakukan Statement, bisa dilakukan juga oleh PreparedStatement
Yang membedakan PreparedStatement dari Statement adalah,
PreparedStatement memiliki kemampuan untuk mengamankan input dari user sehingga aman dari serangan SQL Injection
 */

public class _9_PreparedStatementTest {
    /*
    Berbeda dengan Statement, pada PreparedStatement, ketika pembuatannya, sudah ditentukan SQL apa yang akan kita gunakan
    Oleh karena itu, PreparedStatement biasanya digunakan untuk sekali mengirim perintah SQL,
    jika ingin mengirim perintah SQL lagi, kita harus membuat PreparedStatement baru
    Untuk membuat PreparedStatement, kita bisa menggunakan method prepareStatement(sql) milik Connection
     */
    @Test
    void testPrepareStatement() throws SQLException {
        /*
        Sekarang pertanyaannya, bagaimana cara menerima input user menggunakan PreparedStatement?
        Untuk menerima input dari user, SQL yang kita buat harus diubah juga
        Input dari user, perlu kita ubah menjadi ? (tanda tanya)
        Nanti ketika pembuatan object, kita bisa subtitusi datanya menggunakan setXxx(index, value)
        sesuai dengan tipe datanya, misal setString(), setInt() dan lain-lain
         */
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        String username = "admin'; #";
        String password = "admin";

        String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            System.out.println("Sukses login : " + resultSet.getString("username"));
        } else {
            System.out.println("Gagal login");
        }

        preparedStatement.close();
        connection.close();
    }
}
