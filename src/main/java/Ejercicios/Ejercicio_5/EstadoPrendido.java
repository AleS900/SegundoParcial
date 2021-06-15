package Ejercicios.Ejercicio_5;

public class EstadoPrendido implements IEstadoComputadora {
    private String actionStart;

    public EstadoPrendido(String actionMining){
        this.actionStart =actionMining;
    }

    public String getActionStart() {
        return actionStart;
    }

    public void setActionStart(String actionStart) {
        this.actionStart = actionStart;
    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("*************** Estado: PRENDIDO ******************");
        MemoriaRAM ram= new MemoriaRAM(0, actionStart);
        CPU cpu = new CPU(0,actionStart);
        for (int i = 0 ;  i < computadora.getNumber(); i++) {
            ram.setPercentageUse(i*5);
            cpu.setCpu_percentage_id(i*5);
            computadora.setRam(ram);
            computadora.setCpu(cpu);
        }
        System.out.println("RAM: "+ (ram.getPercentageUse()+5) +" %");
        System.out.println("CPU: "+ (cpu.getCpu_percentage_id()+5)+" %");
    }
}
