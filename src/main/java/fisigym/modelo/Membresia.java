package fisigym.modelo;

import java.time.LocalDate;

public class Membresia {
    private int idMembresia;
    private String estado;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
}
