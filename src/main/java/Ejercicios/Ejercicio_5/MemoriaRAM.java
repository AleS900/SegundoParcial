package Ejercicios.Ejercicio_5;

public class MemoriaRAM {
    private int ram_percent = 0;
    private String ram_state;

    public MemoriaRAM(int ram_percent, String ram_state) {
        this.ram_percent = ram_percent;
        this.ram_state = ram_state;
    }

    public int getPercentageUse() {
        return ram_percent;
    }

    public void setPercentageUse(int ram_percentage_use) {
        this.ram_percent = ram_percentage_use;
    }

    public String getRam_state() {
        return ram_state;
    }

    public void setRam_state(String ram_state) {
        this.ram_state = ram_state;
    }
}