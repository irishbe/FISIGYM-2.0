
package fisigym.controlador;

import fisigym.dao.UsuarioDAO;
import fisigym.vista.LoginCliente;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginUsuarioController implements ActionListener{
    private LoginCliente loginUsuario;
    private UsuarioDAO usuario;

    public LoginUsuarioController(LoginCliente loginUsuario, UsuarioDAO usuarioDAO) {
        
        this.usuario = usuario;
        this.loginUsuario = loginUsuario;
        
        this.loginUsuario.IniciarSesion.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== loginUsuario.IniciarSesion){
            loguearUsuario();
        }
    }
    private void loguearUsuario() {
        String nombreUsuario = loginUsuario.txtUsuario.getText();
        
        char[] contraseñaArray = loginUsuario.txtPass.getPassword();
        String contraseña = new String(contraseñaArray);
        usuario.iniciarSesion(nombreUsuario,contraseña);

    if (usuario != null) {
            JOptionPane.showMessageDialog(
                loginUsuario, 
                "Usuario registrado exitosamente.", 
                "Éxito", 
                JOptionPane.INFORMATION_MESSAGE
            );
            
        } else {
            JOptionPane.showMessageDialog(
                loginUsuario, 
                "Credenciales Incorrectas.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
            
        }
        
    }
    
    
}
