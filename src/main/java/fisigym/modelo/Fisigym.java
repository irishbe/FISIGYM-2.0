package fisigym.modelo;

import fisigym.controlador.LoginUsuarioController;
import fisigym.controlador.RegistroUsuarioController;
import fisigym.dao.ClienteDAO;
import fisigym.dao.DBConexion;
import fisigym.dao.UsuarioDAO;
import fisigym.vista.LoginCliente;
import fisigym.vista.RegistroUsuario;

public class Fisigym {
    public static void main(String[] args) {
        
        System.out.println("Hello World!");

        

        

        
        
        if(DBConexion.getConnection() != null){
            System.out.println("BIEN");
        } else {
            System.out.println("NOOO");
        }
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        LoginCliente login = new LoginCliente();
        RegistroUsuario registroUsuario = new RegistroUsuario();
        RegistroUsuarioController registroUsuarioController = new RegistroUsuarioController(registroUsuario);
        LoginUsuarioController loginUsuarioController = new LoginUsuarioController(login,usuarioDAO);
        registroUsuario.setVisible(true);
        login.setVisible(true);
        
        
        /*if ( ClienteDAO.registrarCliente(cliente) ){
            System.out.println( "Registro con exito!");
        }else{
            System.out.println("pipipi");
        }*/

    }
}
