package fisigym.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConexion {
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                String database = System.getenv("DB_NAME");
                String host = System.getenv("DB_HOST");
                String port = System.getenv("DB_PORT");
                String user = System.getenv("DB_USER");
                String password = System.getenv("DB_PASSWORD");

                String url = "jdbc:mysql://" + host + ":" + port + "/" + database 
                            + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
                connection = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a MySQL en Railway: " + e.getMessage());
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}