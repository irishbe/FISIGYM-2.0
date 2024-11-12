package fisigym.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fisigym.modelo.Distrito;
<<<<<<< HEAD
import java.util.ArrayList;
import java.sql.ResultSet;
=======
>>>>>>> 0b2eb3e528544272cc6cee67bf2f5cd575087c84

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
<<<<<<< HEAD
    
    public static ArrayList<Distrito> obtenerDistritos() {
        ArrayList<Distrito> distritos = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            conexion = DBConexion.getConnection();
            String sql = "SELECT * FROM distritos";

            if (conexion == null) return null;

            statement = conexion.prepareStatement(sql);

            
            rs = statement.executeQuery();

            while (rs.next()) {
                Distrito distrito = new Distrito();
                distrito.setIdDistrito(rs.getInt("idDistrito"));
                distrito.setNombre(rs.getString("nombre"));

                distritos.add(distrito);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            // Cerramos recursos
            try {
                if (rs != null) rs.close();
                if (statement != null) statement.close();
                if (conexion != null) DBConexion.closeConnection(conexion);
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }

        return distritos;
    }
=======
>>>>>>> 0b2eb3e528544272cc6cee67bf2f5cd575087c84
}