package Ejercicios.Ejercicio_5;

public class EstadoReiniciando implements IEstadoComputadora {
    public EstadoReiniciando() {
    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("*************** Estado: REINICIANDO ******************");
        computadora.setCpu(new CPU(0,"reiniciando"));
        computadora.setRam(new MemoriaRAM(0,"nulo"));
        computadora.setNumber(0);
        System.out.println("% CPU              : " + computadora.getCpu().getCpu_percentage_id());
        System.out.println("% RAM    : " + computadora.getRam().getPercentageUse());
        System.out.println("ProgramasAbiertos: " + computadora.getNumber());
    }
}
