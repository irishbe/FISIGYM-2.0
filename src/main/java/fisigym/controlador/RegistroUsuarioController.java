package fisigym.controlador;

import fisigym.dao.ClienteDAO;
import fisigym.vista.RegistroUsuario;

import fisigym.modelo.Cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class RegistroUsuarioController implements ActionListener{
    
    private RegistroUsuario registroUsuario;
    private Cliente cliente;

    public RegistroUsuarioController(RegistroUsuario registroUsuario) {
        
        this.cliente = new Cliente();
        this.registroUsuario = registroUsuario;
        
        this.registroUsuario.jButton2.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== registroUsuario.jButton2){
            registrarNuevoUsuario();
            
        }
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
            
            //-----------------------TIENE QUE SALIR EN UNA VENRTANA EMERGENTE------------------
            JOptionPane.showMessageDialog(
                registroUsuario, 
                "Usuario registrado exitosamente.", 
                "Éxito", 
                JOptionPane.INFORMATION_MESSAGE
            );
            limpiarFormulario();
            
        } else {
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
