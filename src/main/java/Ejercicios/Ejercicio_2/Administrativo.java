package Ejercicios.Ejercicio_2;

public class Administrativo extends Colleague {
    private String admin_name;
    private int admin_id;
    private String admin_position;

    public Administrativo(ICanalDeComunicacion mediator, String admin_name, int tch_ci, String admin_position) {
        super(mediator);
        this.admin_name = admin_name;
        this.admin_id = tch_ci;
        this.admin_position = admin_position;
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("-- INFO - ****Message Received**** -- " + admin_position + ": " + admin_name
                + ", id " + admin_id + " \n >> " + message);
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_position() {
        return admin_position;
    }

    public void setAdmin_position(String admin_position) {
        this.admin_position = admin_position;
    }
}
