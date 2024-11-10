
import fisigym.controlador.LoginCtrl;
import fisigym.vista.Login;
import fisigym.vista.RegistroCliente;
import fisigym.modelo.Usuario;

//import fisigym.dao.DBConexion;

public class Fisigym {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        
        // Instanciando las vistas
        Login login = new Login();
        RegistroCliente registroUsuario = new RegistroCliente();
        
        // Utilizando los controladores
        var loginControlador = new LoginCtrl( login, usuario);
    }
}
