package programmer.zaman.now.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
Kadang kita ingin mendapat informasi seputar database yang kita gunakan
Informasi tersebut bernama MetaData
Ada banyak jenis metadata, seperti DatabaseMetaData, ParameterMetaData, ResultSetMetaData
 */

/*
DatabaseMetaData adalah informasi seputar seluruh database yang kita gunakan, seperti misal :
Nama database
Versi database
Table yang ada di database
dan lain-lain
Untuk membuat DatabaseMetaData, kita bisa menggunakan method getMetaData() dari object Collection
 */

public class _13_2_MetaDataTest {
    @Test
    void testDatabaseMetaData() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        DatabaseMetaData databaseMetaData = connection.getMetaData();

        System.out.println(databaseMetaData.getDatabaseProductName());
        System.out.println(databaseMetaData.getDatabaseProductVersion());

        ResultSet resultSet = databaseMetaData.getTables("belajar_java_db", null, null, null);
        while (resultSet.next()) {
            String tableName = resultSet.getString("TABLE_NAME");
            System.out.println("Table: " + tableName);
        }

        connection.close();
    }
}
