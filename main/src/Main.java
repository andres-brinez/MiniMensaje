import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        do{

            System.out.println("-------------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. Crear mensaje");
            System.out.println(" 2. Listar mensajes");
            System.out.println(" 3. Editar mensaje");
            System.out.println(" 4. Eliminar mensaje");
            System.out.println(" 5. Salir");

            // Leer la opcion del usuario
            option = sc.nextInt();

            switch (option) {

                case 1:

                    controller.newMessage();

                    break;

                case 2:
                    // Listar mensajes
                    controller.seeAllMessages();
                    break;

                case 3:

                    model messageObjectUpdate = new model();

                    controller.updateMessage(messageObjectUpdate);

                    break;

                case 4:

                    // Eliminar mensaje
                    controller.deleteMessage();

                    break;

                default:
                    break;

            }

        }
        while(option !=5 );


        // Crea el obteto conexion
        Conexion conexion = new Conexion();

        // Llama al metodo getConnection() de la clase Conexion
        try(Connection connection = conexion.getConnection()){

        } catch (Exception e) {

            System.out.println(e);

        }


    }
}