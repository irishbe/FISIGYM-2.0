package fisigym.modelo;

import java.util.Date;

public class Factura {
    private int idFactura;
    private String estado;
    private float precioMembresia;
    private float descuento;
    private float montoFinal;
    private Date fechaHora;

    public Factura() {
    }
    
    public void gestionarFacturas(){
    }
    
    public void reporteFacturas(){
        
    }
    
    public void resporteAnual(){
        
    }
    public void reporteMensual(){
        
    }
    public void reporteDiario(){
        
    }
    public void reporteGimnasioAnual(){
        
    }
    public void reporteGimnasioMensual(){
        
    }
    public void reporteGimnasioDiario(){
        
    }
    
    // Getters y setters

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPrecioMembresia() {
        return precioMembresia;
    }

    public void setPrecioMembresia(float precioMembresia) {
        this.precioMembresia = precioMembresia;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(float montoFinal) {
        this.montoFinal = montoFinal;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
}
