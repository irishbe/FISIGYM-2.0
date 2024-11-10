package fisigym.modelo;

import java.sql.Time;
import java.util.Date;

public class Taller {
    private int idTaller;
    private boolean tallerEspecial;
    private String zonaGimnasio;
    private int aforo;
    private int cupos;
    private Date fechaInicio;
    private Date fechaFinal;
    private Time horaInicio;
    private Time horaFinal;
    private boolean tallerActivo;

    public Taller() {
    }
    
    public void gestionarTalleres(){
        
    }
    
    // Getters y setters

    public int getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(int idTaller) {
        this.idTaller = idTaller;
    }

    public boolean isTallerEspecial() {
        return tallerEspecial;
    }

    public void setTallerEspecial(boolean tallerEspecial) {
        this.tallerEspecial = tallerEspecial;
    }

    public String getZonaGimnasio() {
        return zonaGimnasio;
    }

    public void setZonaGimnasio(String zonaGimnasio) {
        this.zonaGimnasio = zonaGimnasio;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
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

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Time horaFinal) {
        this.horaFinal = horaFinal;
    }

    public boolean isTallerActivo() {
        return tallerActivo;
    }

    public void setTallerActivo(boolean tallerActivo) {
        this.tallerActivo = tallerActivo;
    }
}
