package fisigym.modelo;

import java.util.Date;

public class Asistencia {
    private Date fechaAsistencia;
    private boolean asistio;
    
    public void gestionarAsistencia(){
    }
    
    public void verificarAsistencia(){
    }
    
    // Getters y setters

    public Date getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(Date fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }
}
