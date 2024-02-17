package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
    // 2 way  to get connnection: Driver Manager or Datasoruce
    // Datasource > DriverManger
    public static void main(String[] args) throws SQLException {
        final String sql = "INSERT INTO names VALUES(?,?,?)";
        Connection connection = null;
        final var preparedStatement1 = connection.prepareStatement(sql);
        preparedStatement1.setObject(1, "test");
        preparedStatement1.setInt(2, 56);
        preparedStatement1.execute();


        try (var preparedStatement = DriverManager.getConnection("x").prepareStatement("select ..")) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
