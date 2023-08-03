import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public static void seeAllMessages(){
        Conexion dbConnect = new Conexion();

        try (Connection con = dbConnect.getConnection()) {

            // Insertar datos en la base de datos
            PreparedStatement ps = null; // Se encarga de ejecutar las sentencias sql
            ResultSet rs = null; // permite organizar los datos en fila

            try {

                String query = "SELECT * FROM mensajes";
                ps = con.prepareStatement(query); // Se encarga de ejecutar las sentencias sql
                rs = ps.executeQuery(); // Ejecuta la sentencia sql

                System.out.println("Todos los mensajes");

                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id_mensaje"));
                    System.out.println("Mensaje: " + rs.getString("mensaje"));
                    System.out.println("Autor: " + rs.getString("autor_mensaje"));
                    System.out.println("Fecha: " + rs.getString("fecha"));
                    System.out.println("");
                }


            } catch (SQLException ex) {
                System.out.println(ex);
                System.out.println("No se pudieron recuperar los mensajes");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void deleteMessage(int idMessage){

    }



    public static void updateMessage(model message) {
    }

    }



