package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostgreSQLConnector {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://";
        String user = "demo_admin";
        String password = "demodemo";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLConnector.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
