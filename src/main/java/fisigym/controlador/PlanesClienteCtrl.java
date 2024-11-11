/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fisigym.controlador;

import fisigym.modelo.Cliente;
import fisigym.modelo.Usuario;
import fisigym.vista.Login;
import fisigym.vista.PlanesCliente;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class PlanesClienteCtrl implements ActionListener{
    private PlanesCliente planesCliente;
    private Cliente cliente;   

    public PlanesClienteCtrl(PlanesCliente planesCliente, Cliente cliente) {
        this.cliente = cliente;
        this.planesCliente = planesCliente;
        
        this.planesCliente.IrRegistro.addActionListener(this);
        this.planesCliente.RegresarPlanesCliente.addActionListener(this);
        this.planesCliente.setVisible(true);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource()== planesCliente.IrRegistro){
            registrarPlan();
        }
        
        if( e.getSource()== planesCliente.RegresarPlanesCliente ){
            irLogin();
        }
        
    }
    private void registrarPlan() {
            JOptionPane.showMessageDialog(
                planesCliente, 
                "Se ha escogido el plan correctamente y te has registrado", 
                "ÉxitoPlan", 
                JOptionPane.INFORMATION_MESSAGE
            );       
            this.planesCliente.dispose();
            irLogin();


        
    }    
    private void irLogin(){
        var login = new Login();
        var usuario = new Usuario();
        
        var loginCtrl = new LoginCtrl( login, usuario);
        
        this.planesCliente.dispose();
    }   
    

}
