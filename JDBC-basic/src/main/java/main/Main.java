package main;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        DataSource dataSource = createDataSource();
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("connection.isValid(0) = " + connection.isValid(0));

//            CRUD
//            SELECT
            PreparedStatement ps = connection.prepareStatement("select * from USERS where name = ?");
            ps.setString(1, "TestName");

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("name"));
            }
//            INSERTS
            PreparedStatement insertPs = connection.prepareStatement("insert into USERS (name) values (?)");
            insertPs.setString(1, "Test2Name");
            int insertCount = insertPs.executeUpdate();
            System.out.println("insertCount = " + insertCount);
//            UPDATES
            PreparedStatement updatePs = connection.prepareStatement("update USERS set name = ? where name = ?");
            updatePs.setString(1, "FakeName1");
            updatePs.setString(2, "FakeName2");
            int updateCount = updatePs.executeUpdate();
            System.out.println("updateCount = " + updateCount);
//            DELETE
            PreparedStatement deletePs = connection.prepareStatement("delete from USERS where name = ?");
            deletePs.setString(1, "FakeName1");
            int deleteCount = updatePs.executeUpdate();
            System.out.println("deleteCount = " + deleteCount);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static DataSource createDataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:h2:mem:");
        return ds;
    }
}
