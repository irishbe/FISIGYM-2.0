package fisigym.modelo;

public class MetodoPago {
    private int idMetodoPago;
    private String nombre;
    private String cuentaDestino;
    private String informacionPago;

    public MetodoPago() {
    }
    
    public void gestionarMetodoPago(){
        
    }
    
    // Getters y setters

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public String getInformacionPago() {
        return informacionPago;
    }

    public void setInformacionPago(String informacionPago) {
        this.informacionPago = informacionPago;
    }
}
