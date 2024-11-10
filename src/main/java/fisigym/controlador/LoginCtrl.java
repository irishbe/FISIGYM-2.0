package fisigym.controlador;

import fisigym.dao.UsuarioDAO;
import fisigym.modelo.Usuario;
import fisigym.modelo.Cliente;
import fisigym.vista.Login;
import fisigym.vista.RegistroCliente;
import fisigym.vista.MenuCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginCtrl implements ActionListener{
    private Login login; 
    private Usuario usuario;

    public LoginCtrl(Login login, Usuario usuario) {
        this.login = login;
        this.usuario = usuario;
        
        // Asignando los metodos a los botones
        this.login.buttonIniciarSesion.addActionListener(this);
        this.login.buttonRegistrarse.addActionListener(this);
        
        // Mostrando la interfaz (login)
        this.login.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource() == login.buttonIniciarSesion ){
            loguearUsuario();
        }
        
        if( e.getSource() == login.buttonRegistrarse ){
            irRegistroCliente();
        }
    }
    
    private void irPanelCliente(Cliente cliente){
        // Utilizando los controladores
        var menuCliente = new MenuCliente();
        var panelClienteCtrl = new MenuClienteCtrl(menuCliente, cliente);
        
        this.login.dispose();
    }
    
    private void irRegistroCliente(){
        Cliente cliente = new Cliente();
        
        // Utilizando los controladores
        var registroCliente = new RegistroCliente();
        var registroClienteCtrl = new RegistroClienteCtrl(registroCliente, cliente);
        
        this.login.dispose();
    }
    
    
    private void loguearUsuario() {
        String dni_correo = login.txtUsuario.getText();
        String contrasenia = login.txtPass.getText();
        
        usuario = UsuarioDAO.iniciarSesion(dni_correo, contrasenia);

        if ( usuario != null ) {
            
            JOptionPane.showMessageDialog(login, 
                "Usuario registrado exitosamente.", 
                "Éxito", 
                JOptionPane.INFORMATION_MESSAGE
            );
            
            irPanelCliente( new Cliente(usuario) );

        } else {
            JOptionPane.showMessageDialog(login, 
                "Credenciales Incorrectas.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );

        }

    }
    
}
