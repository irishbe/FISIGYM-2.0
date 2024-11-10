package fisigym.controlador;

import fisigym.dao.ClienteDAO;
import fisigym.vista.RegistroCliente;

import fisigym.modelo.Cliente;
import fisigym.modelo.Usuario;
import fisigym.vista.Login;
import fisigym.vista.PlanesCliente;
import fisigym.vista.SedesLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class RegistroClienteCtrl implements ActionListener{
    private RegistroCliente registroUsuario;
    private Cliente cliente;

    public RegistroClienteCtrl(RegistroCliente registroUsuario, Cliente cliente) {
        this.cliente = cliente;
        this.registroUsuario = registroUsuario;
        
        this.registroUsuario.buttonUnirseCliente.addActionListener(this);
        this.registroUsuario.volverLogin.addActionListener(this);
        this.registroUsuario.buttonSeleccionarSede.addActionListener(this);
        this.registroUsuario.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource()== registroUsuario.buttonUnirseCliente ){
            registrarNuevoUsuario();
        }
        
        if( e.getSource()== registroUsuario.volverLogin ){
            irLogin();
        }
        
        if(e.getSource()==registroUsuario.buttonSeleccionarSede){
            irEscogerSede();
        }
    }
    
    private void irLogin(){
        var login = new Login();
        var usuario = new Usuario();
        
        var loginCtrl = new LoginCtrl( login, usuario);
        
        this.registroUsuario.dispose();
    }
    
    private void irEscogerSede(){
        var sedesLogin = new SedesLogin();
        var cliente = new Cliente();
        
        var sedesLoginCtrl = new SedesLoginCtrl( sedesLogin, cliente);
        
    }
    private void irEscogerMembresia(){
        var planesCliente = new PlanesCliente();
        var cliente = new Cliente();
        
        var planesClienteCtrl = new PlanesClienteCtrl( planesCliente, cliente);
        
    }
    
    private void registrarNuevoUsuario() {
        
        if (registroUsuario.txtDniCliente.getText().isEmpty() || 
            registroUsuario.txtCorreoCliente.getText().isEmpty() ||
            registroUsuario.txtContrasenaCliente.getText().isEmpty() ||
            registroUsuario.txtNombreCliente.getText().isEmpty() || 
            registroUsuario.txtApellidoCliente.getText().isEmpty() || 
            registroUsuario.txtTelefonoCliente.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(registroUsuario, "Por favor, complete todos los campos.", 
                                          "Error", JOptionPane.ERROR_MESSAGE);
            return;  
        }

        cliente.setDni(registroUsuario.txtDniCliente.getText());
        cliente.setCorreo(registroUsuario.txtCorreoCliente.getText());
        cliente.setContraseña(registroUsuario.txtContrasenaCliente.getText());
        cliente.setNombres(registroUsuario.txtNombreCliente.getText());
        cliente.setApellidos(registroUsuario.txtApellidoCliente.getText());
        cliente.setTelefono(registroUsuario.txtTelefonoCliente.getText());
        
        // Intenta registrar el usuario en la base de datos
        if (ClienteDAO.registrarCliente(cliente)) {
            
           
            JOptionPane.showMessageDialog(
                registroUsuario, 
                "Usuario registrado exitosamente.", 
                "Éxito", 
                JOptionPane.INFORMATION_MESSAGE
            );
            
            //limpiarFormulario();
            
        }else {
            JOptionPane.showMessageDialog(
                registroUsuario, 
                "Error al registrar el usuario.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
            
        }
        
    }
    
    private void limpiarFormulario() {
        registroUsuario.txtDniCliente.setText("");
        registroUsuario.txtCorreoCliente.setText("");
        registroUsuario.txtContrasenaCliente.setText("");
        registroUsuario.txtNombreCliente.setText("");
        registroUsuario.txtApellidoCliente.setText("");
        registroUsuario.txtTelefonoCliente.setText("");
    }
    
}
