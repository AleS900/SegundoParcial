package Ejercicios.Ejercicio_2;

public class Estudiante extends Colleague{
    private String std_name;
    private int std_matricula;
    private boolean send_to_teacher;
    private boolean send_to_admi;
    private boolean send_to_all;

    public Estudiante(ICanalDeComunicacion mediator, String std_name, int std_matricula, boolean send_to_teacher, boolean send_to_admi, boolean send_to_all) {
        super(mediator);
        this.std_name = std_name;
        this.std_matricula = std_matricula;
        this.send_to_teacher = send_to_teacher;
        this.send_to_admi = send_to_admi;
        this.send_to_all = send_to_all;
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("-- INFO - ****Message Received**** -- Alumno: " + std_name
        + ", matrícula " + std_matricula + " \n >> " + message);
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public int getStd_matricula() {
        return std_matricula;
    }

    public void setStd_matricula(int std_matricula) {
        this.std_matricula = std_matricula;
    }

    public boolean isSend_to_teacher() {
        return send_to_teacher;
    }

    public void setSend_to_teacher(boolean send_to_teacher) {
        this.send_to_teacher = send_to_teacher;
    }

    public boolean isSend_to_admi() {
        return send_to_admi;
    }

    public void setSend_to_admi(boolean send_to_admi) {
        this.send_to_admi = send_to_admi;
    }

    public boolean isSend_to_all() {
        return send_to_all;
    }

    public void setSend_to_all(boolean send_to_all) {
        this.send_to_all = send_to_all;
    }
}
