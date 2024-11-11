package fisigym.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fisigym.modelo.Administrador;

public class AdministradorDAO {

    public static boolean registrarAdministrador(Administrador administrador) {

        int idUsuario = UsuarioDAO.registrarUsuario(administrador);

        if (idUsuario == -1) {
            return false;
        }

        String sql = "INSERT INTO railway.administradores (idUsuario, ruc) VALUES (?, ?)";

        Connection conexion = null;
        PreparedStatement statement = null;

        try {

            conexion = DBConexion.getConnection();

            if (conexion == null) return false;

            statement = conexion.prepareStatement(sql);
            statement.setInt(1, idUsuario);  
            statement.setString(2, administrador.getRuc());  


            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error en la inserción del administrador: " + e.toString());
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
    
    public static boolean actualizarAdministrador(Administrador administrador) {
        String sql = "UPDATE railway.administradores SET ruc = ? WHERE idUsuario = ?";
        
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            conexion = DBConexion.getConnection();
            if (conexion == null) return false;

            statement = conexion.prepareStatement(sql);
            statement.setString(1, administrador.getRuc());
            statement.setInt(2, administrador.getIdUsuario()); // Identifica al administrador por idUsuario

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar el administrador: " + e.toString());
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

    
    public static boolean eliminarAdministrador(int idUsuario) {
        String sql = "UPDATE railway.administradores SET administradorActivo = ? WHERE idUsuario = ?";
        
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            conexion = DBConexion.getConnection();
            if (conexion == null) return false;

            statement = conexion.prepareStatement(sql);
            statement.setBoolean(1, false); // Marcar como inactivo
            statement.setInt(2, idUsuario);

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al desactivar el administrador: " + e.toString());
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