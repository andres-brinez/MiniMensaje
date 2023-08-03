import java.sql.Connection;

public class Main {

    public static void main(String[] args) {


        // Crea el obteto conexion
        Conexion conexion = new Conexion();

        // Llama al metodo getConnection() de la clase Conexion
        try(Connection connection = conexion.getConnection()){

        } catch (Exception e) {

            System.out.println(e);

        }


    }
}