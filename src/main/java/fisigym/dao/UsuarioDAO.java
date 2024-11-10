package fisigym.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fisigym.modelo.Usuario;

public class UsuarioDAO {
    
    public static Usuario iniciarSesion(String dniCorreo, String contrasenia){
        Usuario usuario = null;
        String sql = "SELECT idUsuario, idGimnasio, rol, dni, correo, nombres, apellidos, telefono FROM railway.usuarios ";

        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            conexion = DBConexion.getConnection();

            if( dniCorreo.contains("@") ){
                sql += "WHERE correo = ? AND contrasenia = ?";
            }else{
                sql += "WHERE dni = ? AND contrasenia = ?";
            }

            statement = conexion.prepareStatement(sql);

            statement.setString(1, dniCorreo);
            statement.setString(2, contrasenia);

            // Ejecutamos la consulta
            rs = statement.executeQuery();

            // Si encontramos un registro, creamos el objeto Usuario
            if ( rs.next() ) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setIdGimnasio(rs.getInt("idGimnasio"));
                usuario.setRol(rs.getString("rol"));
                usuario.setDni(rs.getString("dni"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setTelefono(rs.getString("telefono"));
            }

        } catch(SQLException e){
            System.out.println( e.toString() );

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

        return usuario;
    }
    
    public static int registrarUsuario(Usuario usuario){
        String sql = "INSERT INTO railway.usuarios (rol,dni,correo,contrasenia,nombres,apellidos,telefono) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        if( usuario == null ) return -1;

        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet keys = null;

        try {
            conexion = DBConexion.getConnection();
            statement = conexion.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setString(1, usuario.getRol());
            statement.setString(2, usuario.getDni());
            statement.setString(3, usuario.getCorreo());
            statement.setString(4, usuario.getContraseña());
            statement.setString(5, usuario.getNombres());
            statement.setString(6, usuario.getApellidos());
            statement.setString(7, usuario.getTelefono());

            // Comprobar si se insertó al menos una fila
            if ( statement.executeUpdate() > 0 ) {

                // Obtener la clave generada
                keys = statement.getGeneratedKeys();

                if (keys.next()) {
                    return keys.getInt(1); // Aquí obtienes el ID autogenerado
                }

            }

        } catch(SQLException e){
            System.out.println( e.toString() );
        } finally {

            // Cerramos recursos en el bloque finally
            try {
                if (keys != null) keys.close();
                if (statement != null) statement.close();
                if (conexion != null) DBConexion.closeConnection(conexion);

            } catch (SQLException e) {
                System.out.println( e.toString() );
            }

        }

        return -1;
    }

    public static boolean actualizarUsuario(Usuario usuario) {
        String sql = "UPDATE railway.usuarios SET rol = ?, correo = ?, nombres = ?, apellidos = ?, telefono = ? WHERE idUsuario = ?";
        
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            conexion = DBConexion.getConnection();
            if (conexion == null) return false;

            statement = conexion.prepareStatement(sql);
            statement.setString(1, usuario.getRol());
            statement.setString(2, usuario.getCorreo());
            statement.setString(3, usuario.getNombres());
            statement.setString(4, usuario.getApellidos());
            statement.setString(5, usuario.getTelefono());
            statement.setInt(6, usuario.getIdUsuario()); // Identifica al usuario

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar el usuario: " + e.toString());
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

    
    public static boolean eliminarUsuario(int idUsuario) {
        String sql = "UPDATE railway.usuarios SET usuarioActivo = ? WHERE idUsuario = ?";
        
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
            System.out.println("Error al desactivar el usuario: " + e.toString());
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
