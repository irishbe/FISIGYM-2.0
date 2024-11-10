package fisigym.modelo;

public class Disciplina {
    private int idDisciplina;
    private String nombre;
    private String nivel;
    private String descripcion;

    public Disciplina() {
    }
    
    public void gestionarDisciplinas(){
        
    }
    
    // Getters y setters

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
