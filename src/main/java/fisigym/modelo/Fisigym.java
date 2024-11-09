package fisigym.modelo;
import fisigym.dao.DBConexion;

public class Fisigym {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        if(DBConexion.getConnection() != null){
            System.out.println("BIEN");
        } else {
            System.out.println("NOOOOOOOOOOOOOOOOOO");
            String host = System.getenv("DB_HOST");
            System.out.println(host);
            System.out.println(System.getenv("DB_HOST"));
            System.out.println(System.getenv("DB_NAME"));
            System.out.println(System.getenv("DB_PASSWORD"));
            System.out.println(System.getenv("DB_USER"));
            System.out.println(System.getenv("DB_PORT"));
            System.out.println(System.getenv("DB_URL"));
        }
    }
}
