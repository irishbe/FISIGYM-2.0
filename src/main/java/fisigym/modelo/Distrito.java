package fisigym.modelo;

public class Distrito {
    private int idDistrito;
    private String nombre;
    private boolean distritoActivo;

    public Distrito() {
    }
    
    public void gestionarDistrito(){
    }
    
    // Getters y setters

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDistritoActivo() {
        return distritoActivo;
    }

    public void setDistritoActivo(boolean distritoActivo) {
        this.distritoActivo = distritoActivo;
    }
}
