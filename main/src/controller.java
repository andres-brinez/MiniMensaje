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

        Dao.seeAllMessages();

    }

    public static void readMessage(int idMessage) {

    }

    public static void deleteMessage(/*int idMessage*/) {

        int idMessage;

        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el ID del mensaje a eliminar");
        idMessage = sc.nextInt();

        Dao.deleteMessage(idMessage);



    }

    public static void updateMessage(model message) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el ID del mensaje a editar");
        int idMessageUpdate = sc.nextInt();

        sc.nextLine(); // Limpiar el buffer

        System.out.println("Escribe tu nuevo mensaje");
        String messageUpdate = sc.nextLine();


        message.setIdMessage(idMessageUpdate);
        message.setMessage(messageUpdate);

        Dao.updateMessage(message);


    }




}
