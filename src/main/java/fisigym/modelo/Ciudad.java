package fisigym.modelo;

public class Ciudad {
    private int idCiudad;
    private String nombre;
    private boolean ciudadActiva;

    public Ciudad() {
    }
    
    public void gestionarCiudades(){
    }
    
    // Getters y setters

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
<<<<<<< HEAD

    public boolean isCiudadActiva() {
        return ciudadActiva;
    }

    public void setCiudadActiva(boolean ciudadActiva) {
        this.ciudadActiva = ciudadActiva;
    }
    
=======
    
    public boolean getCiudadActiva(){
        return ciudadActiva;
    }
    
    public void setCiudadActiva(boolean ciudadActiva){
        this.ciudadActiva= ciudadActiva;
    }
>>>>>>> 0b2eb3e528544272cc6cee67bf2f5cd575087c84
}
