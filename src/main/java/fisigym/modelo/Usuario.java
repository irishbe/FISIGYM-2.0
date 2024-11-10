package fisigym.modelo;

public class Usuario {
    private int idUsuario;
    private int idGimnasio;
    private String rol;
    private String dni;
    private String correo;
    private String contraseña;
    private String nombres;
    private String apellidos;
    private String telefono;
    private boolean usuarioActivo;

    public Usuario(){};

    public Usuario(String rol, String dni, String correo, String contraseña, String nombres, String apellidos, String telefono) {
        this.rol = rol;
        this.dni = dni;
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }
    
    // Getters y setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdGimnasio() {
        return idGimnasio;
    }

    public void setIdGimnasio(int idGimnasio) {
        this.idGimnasio = idGimnasio;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(boolean usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    @Override
    public String toString() {
        return "Usuario {" +
               "\n  ID Usuario: " + idUsuario +
               "\n  ID Gimnasio: " + idGimnasio +
               "\n  Rol: " + rol +
               "\n  DNI: " + dni +
               "\n  Correo: " + correo +
               "\n  Nombres: " + nombres +
               "\n  Apellidos: " + apellidos +
               "\n  Teléfono: " + telefono +
               "\n}";
    }
}
