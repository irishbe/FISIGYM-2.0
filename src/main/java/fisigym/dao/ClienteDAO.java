package fisigym.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fisigym.modelo.Cliente;

public class ClienteDAO {
    
    public static boolean registrarCliente(Cliente cliente){
        int idUsuario = UsuarioDAO.registrarUsuario(cliente);
    
        if (idUsuario == -1) {
            return false;
        }
    
        String sql = "INSERT INTO railway.clientes (idUsuario) VALUES (?)";
    
        Connection conexion = null;
        PreparedStatement statement = null;
    
        try {
            conexion = DBConexion.getConnection();

            if (conexion == null) return false;
    
            statement = conexion.prepareStatement(sql);
            statement.setInt(1, idUsuario);
    
            // Verificar si la inserción en clientes fue exitosa
            return statement.executeUpdate() > 0;
    
        } catch (SQLException e) {

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
