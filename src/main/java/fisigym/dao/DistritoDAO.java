package fisigym.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fisigym.modelo.Distrito;

public class DistritoDAO {

    
    public static boolean registrarDistrito(Distrito distrito) {
        
        String sql = "INSERT INTO railway.distritos (nombre, distritoActivo) VALUES (?, ?)";

        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            
            conexion = DBConexion.getConnection();

            if (conexion == null) return false;

            
            statement = conexion.prepareStatement(sql);

            
            statement.setString(1, distrito.getNombre());
            statement.setBoolean(2, distrito.isDistritoActivo());

            
            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error en la inserción del distrito: " + e.toString());
        } finally {
            try {
                if (statement != null) statement.close();
                if (conexion != null) DBConexion.closeConnection(conexion);
            } catch (SQLException e) {
                System.out.println("Error al cerrar los recursos: " + e.toString());
            }
        }

        return false;
    }
    
    public static boolean actualizarDistrito(Distrito distrito) {
        String sql = "UPDATE railway.distritos SET nombre = ? WHERE idDistrito = ?";
        
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            conexion = DBConexion.getConnection();

            if (conexion == null) return false;

            statement = conexion.prepareStatement(sql);
            statement.setString(1, distrito.getNombre());
            statement.setInt(2, distrito.getIdDistrito());

            
            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar el distrito: " + e.toString());
        } finally {
            try {
                if (statement != null) statement.close();
                if (conexion != null) DBConexion.closeConnection(conexion);
            } catch (SQLException e) {
                System.out.println("Error al cerrar los recursos: " + e.toString());
            }
        }

        return false;
    }

    
    public static boolean eliminarDistrito(int idDistrito) {
        String sql = "UPDATE railway.distritos SET distritoActivo = false WHERE idDistrito = ?";
        
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            conexion = DBConexion.getConnection();

            if (conexion == null) return false;

            statement = conexion.prepareStatement(sql);
            statement.setInt(1, idDistrito);

            
            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al desactivar el distrito: " + e.toString());
        } finally {
            try {
                if (statement != null) statement.close();
                if (conexion != null) DBConexion.closeConnection(conexion);
            } catch (SQLException e) {
                System.out.println("Error al cerrar los recursos: " + e.toString());
            }
        }

        return false;
    }
}