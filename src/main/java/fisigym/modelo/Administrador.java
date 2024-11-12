package fisigym.modelo;

public class Administrador extends Usuario{
    private String ruc;    

    public Administrador() {
    }
    
    // Getters y setters

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}
