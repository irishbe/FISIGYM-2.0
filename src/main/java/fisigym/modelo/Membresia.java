package fisigym.modelo;

import java.util.Date;

public class Membresia {
    private int idMembresia;
    private String estado;
    private Date fechaInicio;
    private Date fechaFinal;
    private int diasRestantes;
    
    public Membresia() {
    }
    
    public void adquirirMembresia(Cliente cliente){
        
    }
    public void renovarMembresia(int idCliente){
        
    }
    public void reembolsarMembresia(int idCliente){
        
    }

    public void calcularDiasRestantes(int idCliente){
        
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

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }
}
