import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Dao significa Data Access Object y es una clase que se encarga de acceder a la base de datos
public class Dao {

    public static void newMessage(model message){

        Conexion dbConnect = new Conexion();

        try (Connection con = dbConnect.getConnection()) {

            // Insertar datos en la base de datos
            PreparedStatement ps = null; // Se encarga de ejecutar las sentencias sql
            try {

                String query = "INSERT INTO mensajes (mensaje, autor_mensaje,fecha) VALUES (?,?,?)";
                ps = con.prepareStatement(query); // Se encarga de ejecutar las sentencias sql
                ps.setString(1, message.getMessage()); // El primer parametro es el numero de la columna y el segundo es el valor que se va a insertar
                ps.setString(2, message.getauthorMessage());
                ps.setString(3, message.getdateMessage());
                ps.executeUpdate(); // Ejecuta la sentencia sql
                System.out.println("Mensaje creado");

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }


    }

    public static void readMessage(){

    }

    public static void deleteMessage(int idMessage){

    }



    public static void updateMessage(model message) {
    }

    }



