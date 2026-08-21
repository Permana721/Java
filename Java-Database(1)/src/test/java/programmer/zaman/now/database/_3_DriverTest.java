package programmer.zaman.now.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _3_DriverTest {
    @Test
    void testRegister() {
        try {
            Driver postgreDriver = new org.postgresql.Driver();
            DriverManager.registerDriver(postgreDriver);
        } catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
