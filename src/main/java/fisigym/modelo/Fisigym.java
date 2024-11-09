package fisigym.modelo;

public class Fisigym {

    /*public static void main(String[] args) {
        System.out.println("Hello World!");
    }*/

    public static void main(String[] args) {
        String dbPassword = System.getenv("DB_PASSWORD");

        if (dbPassword == null) {
            System.out.println("La variable DB_PASSWORD no está configurada.");
        } else {
            System.out.println("La contraseña de la base de datos es: " + dbPassword);
        }
    }
}
