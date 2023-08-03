// Se encarga del modelo de la base de datos
public class model {

    int idMessage;
    String Message;
    String authorMessage;
    String dateMessage;



    public model() {
    }

    public model(String Message, String authorMessage, String dateMessage) {
        this.Message = Message;
        this.authorMessage = authorMessage;
        this.dateMessage = dateMessage;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getauthorMessage() {
        return authorMessage;
    }

    public void setauthorMessage(String authorMessage) {
        this.authorMessage = authorMessage;
    }

    public String getdateMessage() {
        return dateMessage;
    }

    public void setdateMessage(String dateMessage) {
        this.dateMessage = dateMessage;
    }
}
