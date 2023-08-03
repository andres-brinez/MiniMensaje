import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    // * Tiene la funcionalidad de conectarse a la base de datos

    // devuelve una conexion a la base de datos
    public Connection getConnection(){

        Connection con = null;

        try {

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mensajes_app", "postgres", "admin");

            if (con != null){
                System.out.println("Conexion exitosa");

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
            System.out.println("Error en la conexion");
        }

        return con;

    }
}
