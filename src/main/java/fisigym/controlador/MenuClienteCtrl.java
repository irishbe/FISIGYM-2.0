package fisigym.controlador;

import fisigym.modelo.Cliente;
import fisigym.modelo.Usuario;
import fisigym.vista.Login;
import fisigym.vista.MenuCliente;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuClienteCtrl implements ActionListener{
    private MenuCliente panel; 
    private Cliente cliente;
    private JPanel panelContenido;
    private CardLayout cardLayout;
    

    public MenuClienteCtrl(MenuCliente panel, Cliente cliente) {
        this.panel = panel;
        this.cliente = cliente;
        this.cardLayout = new CardLayout();
        
        
        this.panelContenido = new JPanel(cardLayout); 
        panel.setLayout(new BorderLayout());  // Asegúrate de que MenuCliente usa BorderLayout
        panel.add(panelContenido, BorderLayout.EAST);
        
        panelContenido.add(panel.jPanel4, "inicio");         // Muestra jPanel4 para "Inicio"
        panelContenido.add(panel.jPanel5, "talleres");       // Muestra jPanel5 para "Talleres"
        panelContenido.add(panel.jPanel6, "servicios");      // Muestra jPanel6 para "Servicios"
        panelContenido.add(panel.jPanel7, "pagoMembresia");  // Muestra jPanel7 para "Pago Membresia"
        panelContenido.add(panel.jPanel8, "perfil");  
        
        
        // Asignando los metodos a los botones
        this.panel.InicioCliente.addActionListener(this);
        this.panel.MiPerfilCliente.addActionListener(this);
        this.panel.MisServiciosCliente.addActionListener(this);
        this.panel.TalleresCliente.addActionListener(this);
        this.panel.pagarMembresíaCliente.addActionListener(this);
        this.panel.buttonCerrarSesion.addActionListener(this);
            
        // Mostrando la interfaz (panel)
        cardLayout.show(panelContenido, "inicio");
        this.panel.setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == panel.buttonCerrarSesion) {
        cerrarSesion();
    } else if (e.getSource() == panel.InicioCliente) {
        cardLayout.show(panelContenido, "inicio");  // Muestra jPanel4
    } else if (e.getSource() == panel.TalleresCliente) {
        cardLayout.show(panelContenido, "talleres"); // Muestra jPanel5
    } else if (e.getSource() == panel.MisServiciosCliente) {
        cardLayout.show(panelContenido, "servicios"); // Muestra jPanel6
    } else if (e.getSource() == panel.pagarMembresíaCliente) {
        cardLayout.show(panelContenido, "pagoMembresia"); // Muestra jPanel7
    } else if (e.getSource() == panel.MiPerfilCliente) {
        cardLayout.show(panelContenido, "perfil"); // Muestra jPanel8
    }
}
    
    public void cerrarSesion(){
        Usuario usuario = new Usuario();
        
        var login = new Login(); 
        var loginCtrl = new LoginCtrl(login, usuario);
        
        this.panel.dispose();
    }
}
