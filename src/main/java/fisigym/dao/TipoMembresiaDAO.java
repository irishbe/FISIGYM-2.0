package fisigym.dao;

import fisigym.modelo.TipoMembresia;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TipoMembresiaDAO {
    
    public static ArrayList<TipoMembresia> obtenerTiposMembresias(){
        ArrayList<TipoMembresia> tiposMembresias = new ArrayList();
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        
        try{
            conexion = DBConexion.getConnection();
            String sql = "SELECT * FROM tipos_membresias";

            if (conexion == null) return null;
            
            statement = conexion.prepareStatement(sql);

            //Ejecutando la consulta
            rs = statement.executeQuery();

            while( rs.next() ){
                TipoMembresia tipo = new TipoMembresia();

                tipo.setIdTipo( rs.getInt("idTipoMembresia") );
                tipo.setNombre( rs.getString("nombre") );
                tipo.setPrecio( rs.getFloat("precio") );
                tipo.setDescripcion( rs.getString("descripcion") );

                tiposMembresias.add( tipo );
            }

        }catch(SQLException e){
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

        return tiposMembresias;
    }
    
}
