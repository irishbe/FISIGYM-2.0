package fisigym.modelo;

import java.util.Date;

public class Membresia {
    private int idMembresia;
    private String estado;
    private Date fechaInicio;
    private Date fechaFinal;
    
    public Membresia() {
    }
    
    public void adquirirMembresia(){
        
    }
    public void renovarMembresia(){
        
    }
    public void reembolsarMembresia(){
        
    }

    public void calcularDiasRestantes(){
        
    }
    
    // Getters y setters

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
}
