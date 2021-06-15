package Ejercicios.Ejercicio_5;

public class EstadoApagado implements IEstadoComputadora {

    public EstadoApagado(){}
    @Override
    public void handler(Computadora computadora) {
        System.out.println("*************** Estado: APAGADO ******************");
        computadora.setCpu(new CPU(0,"apagado"));
        computadora.setRam(new MemoriaRAM(0,"nulo"));
        computadora.setNumber(0);
        System.out.println("% CPU              : " + computadora.getCpu().getCpu_percentage_id());
        System.out.println("% RAM    : " + computadora.getRam().getPercentageUse());
        System.out.println("ProgramasAbiertos: " + computadora.getNumber());
    }
}