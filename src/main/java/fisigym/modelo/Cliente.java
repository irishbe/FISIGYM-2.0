package fisigym.modelo;    

public class Cliente extends Usuario{

    public Cliente() {
        super("Cliente");
    }

    public Cliente(Usuario u){
        super( u.getRol() , u.getDni(), u.getCorreo(), u.getNombres(), u.getApellidos(), u.getTelefono() );
    }
    
    public Cliente(String dni, String correo, String nombres, String apellidos, String telefono) {
        super("Cliente", dni, correo, nombres, apellidos, telefono);
    }
    
    

}
