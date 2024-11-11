package fisigym.controlador;

import fisigym.vista.SedesLogin;
import fisigym.modelo.Cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SedesLoginCtrl implements ActionListener{
    private SedesLogin sedesLogin;
    private Cliente cliente;
    
    public SedesLoginCtrl(SedesLogin sedesLogin, Cliente cliente) {
        this.cliente = cliente;
        this.sedesLogin = sedesLogin;
        
        this.sedesLogin.ConfirmarSede.addActionListener(this);
        this.sedesLogin.VolverSedes.addActionListener(this);
        
        this.sedesLogin.setVisible(true);
    }    
    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource()== sedesLogin.ConfirmarSede ){
            registrarNuevoSede();
        }
        
        if( e.getSource()== sedesLogin.VolverSedes ){
            this.sedesLogin.dispose();
        }        
    }
    
    private void registrarNuevoSede() {
            JOptionPane.showMessageDialog(
                sedesLogin, 
                "Se ha escogido la sede correctamente", 
                "ÉxitoSede", 
                JOptionPane.INFORMATION_MESSAGE
            );       
            this.sedesLogin.dispose();


        
    }
    
}
