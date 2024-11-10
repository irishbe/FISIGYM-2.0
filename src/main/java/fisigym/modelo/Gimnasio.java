package fisigym.modelo;

public class Gimnasio {
    private int idGimnasio;
    private String direccion;
    private String referencia;
    private boolean gimnasioActivo;

    public Gimnasio() {
    }
    
    public void gestionarGimnasios(){
        
    }
    
    // Getters y setters

    public int getIdGimnasio() {
        return idGimnasio;
    }

    public void setIdGimnasio(int idGimnasio) {
        this.idGimnasio = idGimnasio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public boolean isGimnasioActivo() {
        return gimnasioActivo;
    }

    public void setGimnasioActivo(boolean gimnasioActivo) {
        this.gimnasioActivo = gimnasioActivo;
    }
}
