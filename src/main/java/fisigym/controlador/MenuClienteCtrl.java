package fisigym.controlador;

import fisigym.modelo.Cliente;
import fisigym.modelo.Usuario;
import fisigym.vista.Login;
import fisigym.vista.MenuCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MenuClienteCtrl implements ActionListener{
    private MenuCliente panel; 
    private Cliente cliente;

    public MenuClienteCtrl(MenuCliente panel, Cliente cliente) {
        this.panel = panel;
        this.cliente = cliente;
        
        // Asignando los metodos a los botones
        this.panel.buttonCerrarSesion.addActionListener(this);
        
        // Mostrando la interfaz (panel)
        this.panel.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource() == panel.buttonCerrarSesion ){
            cerrarSesion();
        }
    }
    
    public void cerrarSesion(){
        Usuario usuario = new Usuario();
        
        var login = new Login(); 
        var loginCtrl = new LoginCtrl(login, usuario);
        
        this.panel.dispose();
    }
}
