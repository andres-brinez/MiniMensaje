import java.util.Scanner;
import java.sql.Date;

// Es la capa intermedia entre la base de datos y la aplicacion(Mení)
public class controller {


    public static void newMessage(/*model message*/) {

        Scanner sc = new Scanner(System.in);

        // Crear mensaje
        System.out.println("Escribe tu mensaje");
        String message = sc.nextLine();

        System.out.println("Tu nombre");
        String name = sc.nextLine();

        String date= new Date(System.currentTimeMillis()).toString();

        model messageObject = new model();
        messageObject.setMessage(message);
        messageObject.setauthorMessage(name);
        messageObject.setdateMessage(date);

        Dao.newMessage(messageObject);
    }


    public static void seeAllMessages() {

    }




    public static void readMessage(int idMessage) {

    }


    public static void deleteMessage(int idMessage) {

    }

    public static void updateMessage(model message) {

    }




}
