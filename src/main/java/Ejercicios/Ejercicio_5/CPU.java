package Ejercicios.Ejercicio_5;

public class CPU {
    private String cpu_state;
    private int cpu_percentage_id;

    public CPU(int cpu_percentage_id, String cpu_id) {
        this.cpu_state = cpu_id;
        this.cpu_percentage_id = cpu_percentage_id;
    }

    public String getCpu_state() {
        return cpu_state;
    }

    public void setCpu_state(String cpu_state) {
        this.cpu_state = cpu_state;
    }

    public int getCpu_percentage_id() {
        return cpu_percentage_id;
    }

    public void setCpu_percentage_id(int cpu_percentage_id) {
        this.cpu_percentage_id = cpu_percentage_id;
    }
}