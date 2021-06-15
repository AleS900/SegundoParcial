package Ejercicios.Ejercicio_5;

public class Computadora {
    private IEstadoComputadora state;
    private ArregloDeProgramas programs_array;
    private MemoriaRAM ram;
    private CPU cpu;
    private Integer number;

    public IEstadoComputadora getState() {
        return state;
    }

    public void setState(IEstadoComputadora state) {
        this.state = state;
    }

    public void request(){
        this.state.handler(this);
    }

    public MemoriaRAM getRam() {
        return ram;
    }

    public void setRam(MemoriaRAM ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public ArregloDeProgramas getPrograms_array() {
        return programs_array;
    }

    public void setPrograms_array(ArregloDeProgramas programs_array) {
        this.programs_array = programs_array;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
