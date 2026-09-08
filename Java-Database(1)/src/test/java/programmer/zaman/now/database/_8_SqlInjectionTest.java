package programmer.zaman.now.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
Saat membuat aplikasi, kita tidak mungkin akan melakukan hardcode perintah SQL di kode Java kita
Biasanya kita akan menerima input data dari user,
lalu membuat perintah SQL dari input user, dan mengirimnya menggunakan perintah SQL
 */

public class _8_SqlInjectionTest {
    /*
    SQL Injection adalah sebuah teknik yang menyalahgunakan sebuah celah keamanan yang
    terjadi dalam lapisan basis data sebuah aplikasi.
    Biasa, SQL Injection dilakukan dengan mengirim input dari user dengan perintah yang salah,
    sehingga menyebabkan hasil SQL yang kita buat menjadi tidak valid
    SQL Injection sangat berbahaya, jika sampai kita salah membuat SQL, bisa jadi data kita tidak aman
     */
    @Test
    void testSqlInjection() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String username = "admin'; #";
        String password = "salah";

        String sql = "SELECT * FROM admin WHERE username = '" + username + "' AND PASSWORD = '" + password + "'";

        System.out.println(sql);

        ResultSet resultSet = statement.executeQuery(sql);

        if(resultSet.next()){
            System.out.println("Sukses login : " + resultSet.getString("username"));
        } else {
            System.out.println("Gagal login");
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
    /*
    Statement tidak didesain untuk bisa menangani SQL Injection
    Oleh karena itu, jika SQL query yang kita gunakan dibuat berdasarkan input dari user,
    maka kita jangan menggunakan Statement
    Untuk menghindari SQL Injection, terdapat interface bernama PreparedStatement,
    ini adalah jenis statement yang bisa menangani SQL Injection dengan baik
    Kita akan bahas PreparedStatement di chapter tersendiri
     */
}
