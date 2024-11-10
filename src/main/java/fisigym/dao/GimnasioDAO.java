package fisigym.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fisigym.modelo.Gimnasio;

public class GimnasioDAO {

    public static boolean registrarGimnasio(Gimnasio gimnasio) {
        
        String sql = "INSERT INTO railway.gimnasios (direccion, referencia, gimnasioActivo) VALUES (?, ?, ?)";
        
        
        if (gimnasio == null) {
            return false;
        }

        
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            
            conexion = DBConexion.getConnection();
            
            
            if (conexion == null) return false;

            
            statement = conexion.prepareStatement(sql);

            
            statement.setString(1, gimnasio.getDireccion());
            statement.setString(2, gimnasio.getReferencia());
            statement.setBoolean(3, gimnasio.isGimnasioActivo());

            
            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            
            System.out.println("Error en la inserción del gimnasio: " + e.toString());
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
    
    public static boolean actualizarGimnasio(Gimnasio gimnasio) {
        String sql = "UPDATE railway.gimnasios SET direccion = ?, referencia = ? WHERE idGimnasio = ?";
        
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            conexion = DBConexion.getConnection();

            if (conexion == null) return false;

            statement = conexion.prepareStatement(sql);
            statement.setString(1, gimnasio.getDireccion());
            statement.setString(2, gimnasio.getReferencia());
            statement.setInt(3, gimnasio.getIdGimnasio());

            
            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar el gimnasio: " + e.toString());
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

    
    public static boolean eliminarGimnasio(int idGimnasio) {
        String sql = "UPDATE railway.gimnasios SET gimnasioActivo = false WHERE idGimnasio = ?";
        
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            conexion = DBConexion.getConnection();

            if (conexion == null) return false;

            statement = conexion.prepareStatement(sql);
            statement.setInt(1, idGimnasio);

            
            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al desactivar el gimnasio: " + e.toString());
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