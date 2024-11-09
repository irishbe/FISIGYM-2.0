package fisigym.modelo;
import fisigym.dao.DBConexion;

public class Fisigym {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        if(DBConexion.getConnection() != null){
            System.out.println("BIEN");
        } else {
            System.out.println("NOOOOOOOOOOOOOOOOOO");
        }
    }
}
