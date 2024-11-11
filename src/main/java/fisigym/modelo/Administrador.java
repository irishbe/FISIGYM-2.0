package fisigym.modelo;

public class Administrador extends Usuario{
    private String ruc;    

    public Administrador() {
    }
    
    public Administrador(Usuario u){
        super( u.getRol() , u.getDni(), u.getCorreo(), u.getNombres(), u.getApellidos(), u.getTelefono() );
    }
    
    // Getters y setters

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}
