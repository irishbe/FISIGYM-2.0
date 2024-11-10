package fisigym.modelo;    

public class Cliente extends Usuario{

    public Cliente() {}

    public Cliente(String dni, String correo, String contraseña, String nombres, String apellidos, String telefono) {
        super("Cliente", dni, correo, contraseña, nombres, apellidos, telefono);
    }
    
    

}
