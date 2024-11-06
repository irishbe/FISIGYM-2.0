package fisigym.modelo;

public class Reserva {
    private boolean asistencia;
    private boolean inscrito;

    public Reserva() {
    }
    
    public void generarReserva(Cliente cliente ,Taller taller ){
        
    }
    public void cancelarReserva(Cliente cliente , Taller taller){
        
    }
    public void consultarReservaCliente(int idCliente){
        
    }
    
    // Getters y setters

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public boolean isInscrito() {
        return inscrito;
    }

    public void setInscrito(boolean inscrito) {
        this.inscrito = inscrito;
    }
}
