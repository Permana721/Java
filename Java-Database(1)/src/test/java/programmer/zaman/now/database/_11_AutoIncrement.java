package programmer.zaman.now.database;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class _11_AutoIncrement {
    @Test
    void testAutoIncrement() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        String sql = "INSERT INTO comments(email, comment) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, "mana@mail.com");
        preparedStatement.setString(2, "hi");
        preparedStatement.executeUpdate();

        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        if(resultSet.next()){
            System.out.println("Id comment: " + resultSet.getInt(1));
        }

        preparedStatement.close();
        connection.close();
    }
}
