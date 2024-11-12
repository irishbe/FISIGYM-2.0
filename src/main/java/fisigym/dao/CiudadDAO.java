package fisigym.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fisigym.modelo.Ciudad;

public class CiudadDAO {

    
    public static boolean registrarCiudad(Ciudad ciudad) {
        
        String sql = "INSERT INTO railway.ciudades (nombre, ciudadActiva) VALUES (?, ?)";

        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            
            conexion = DBConexion.getConnection();

            if (conexion == null) return false;

            
            statement = conexion.prepareStatement(sql);

            
            statement.setString(1, ciudad.getNombre());
            statement.setBoolean(2, ciudad.getCiudadActiva());

            
            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error en la inserción de la ciudad: " + e.toString());
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
    
    public static boolean actualizarCiudad(Ciudad ciudad) {
        String sql = "UPDATE railway.ciudades SET nombre = ? WHERE idCiudad = ?";
        
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            conexion = DBConexion.getConnection();

            if (conexion == null) return false;

            statement = conexion.prepareStatement(sql);
            statement.setString(1, ciudad.getNombre());
            statement.setInt(2, ciudad.getIdCiudad());

           
            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar la ciudad: " + e.toString());
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

    
    public static boolean eliminarCiudad(int idCiudad) {
        String sql = "UPDATE railway.ciudades SET ciudadActiva = false WHERE idCiudad = ?";
        
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            conexion = DBConexion.getConnection();

            if (conexion == null) return false;

            statement = conexion.prepareStatement(sql);
            statement.setInt(1, idCiudad);

            
            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al desactivar la ciudad: " + e.toString());
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