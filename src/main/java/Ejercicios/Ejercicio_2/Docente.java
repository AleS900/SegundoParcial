package Ejercicios.Ejercicio_2;

public class Docente extends Colleague{
    private String tch_name;
    private int tch_ci;

    public Docente(ICanalDeComunicacion mediator, String tch_name, int ci) {
        super(mediator);
        this.tch_name = tch_name;
        this.tch_ci = ci;
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("-- INFO - ****Message Received**** -- Docente: " + tch_name
                + ", matrícula " + tch_ci + " \n >> " + message);
    }



    public String getTch_name() {
        return tch_name;
    }

    public void setTch_name(String tch_name) {
        this.tch_name = tch_name;
    }

    public int getTch_ci() {
        return tch_ci;
    }

    public void setTch_ci(int tch_ci) {
        this.tch_ci = tch_ci;
    }
}
