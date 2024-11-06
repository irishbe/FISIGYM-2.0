package fisigym.modelo;

public class TipoMembresia {
    private int idTipo;
    private String nombre;
    private float precio;
    private String descripcion;

    public TipoMembresia() {
    }
    
    public void gestionarTiposMembresias(){
        
    }
    
    // Getters y setters

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}