package fisigym.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConexion {

    private static Connection connection = null;

    // Método para obtener la conexión a la base de datos
    public static Connection getConnection() {
        if (connection == null) {
            try {
                String dbHost = System.getenv("MYSQLHOST");
                String dbPort = System.getenv("MYSQLPORT");
                String dbName = System.getenv("MYSQLDATABASE");
                String dbUser = System.getenv("MYSQLUSER");
                String dbPassword = System.getenv("MYSQLPASSWORD");

                if (dbHost == null || dbPort == null || dbName == null || dbUser == null || dbPassword == null) {
                    System.out.println("Faltan parámetros de configuración para la conexión");
                    return null;
                }

                String dbUrl = String.format("jdbc:mysql://%s:%s/%s?useSSL=false&serverTimezone=UTC", dbHost, dbPort, dbName);

                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
                System.out.println("Conexión establecida con éxito");

            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("Error al conectar con la base de datos: " + e.getMessage());
            }
        }
        return connection;
    }

    // Método para cerrar la conexión a la base de datos
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("Conexión cerrada con éxito");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
