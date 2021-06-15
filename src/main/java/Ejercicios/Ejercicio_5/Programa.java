package Ejercicios.Ejercicio_5;

public class  Programa {
    private String prog_name;
    private int prog_id;

    public Programa(int prog_id, String prog_name) {
        this.prog_id = prog_id;
        this.prog_name = prog_name;
    }

    public int getProg_id() {
        return prog_id;
    }

    public void setProg_id(int prog_id) {
        this.prog_id = prog_id;
    }

    public String getProg_name() {
        return prog_name;
    }

    public void setProg_name(String prog_name) {
        this.prog_name = prog_name;
    }
}
