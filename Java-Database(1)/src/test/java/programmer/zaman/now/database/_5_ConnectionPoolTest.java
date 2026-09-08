package programmer.zaman.now.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

/*
Connection Pool adalah konsep dimana dibanding kita membuat koneksi baru setiap ada request ke yang membutuhkan database
Lebih baik diawal kita buatkan banyak Connection terlebih dahulu,
sehingga hanya lambat diawal ketika aplikasi berjalan
Selanjutnya ketika ada request yang butuh koneksi, kita hanya cukup menggunakan salah satu Connection,
dan setelah selesai, kita kembalikan lagi Connection nya
Jika semua Connection sedang terpakai semua, ketika ada request yang butuh koneksi lagi,
request tersebut diminta untuk menunggu terlebih dahulu,
dengan demikian penggunaan memory untuk Connection tidak akan terlalu bengkak
Connection Pool di JDBC direpresentasikan dengan interface javax.sql.DataSource
 */

public class _5_ConnectionPoolTest {
    /*
    Membuat connection pool secara manual bukanlah hal bijak,
    lebih baik kita menggunakan library connection pool yang sudah terbukti bekerja dengan baik.
    HikariCP adalah salah satu connection pool library yang paling populer saat ini di Java
    Kita bisa menggunakan HikariCP ini untuk melakukan connection pool terhadap koneksi database di aplikasi kita
     */
    @Test
    void testHikariCP() {
        // Konfigurasi HikariCP
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.postgresql.Driver");
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/java");
        config.setUsername("permana");
        config.setPassword("");

        // config pool
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60_000);
        config.setMaxLifetime(10 * 60_000);

        try {
            HikariDataSource dataSource = new HikariDataSource(config);
            Connection connection = dataSource.getConnection();
            connection.close();
            dataSource.close();
        } catch (SQLException exception){
            Assertions.fail(exception);
        }
    }

    @Test
    void testUtil() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection(); // Menggunakan ConnectionUtil agar tidak perlu membuat CP terus terusan
    }
}
