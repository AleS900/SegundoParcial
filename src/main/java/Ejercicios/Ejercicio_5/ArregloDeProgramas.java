package Ejercicios.Ejercicio_5;

public class ArregloDeProgramas {
    private String arr_id;
    private Programa[] arr_data;

    public ArregloDeProgramas(String arr_id, Programa[] arr_data) {
        this.arr_id = arr_id;
        this.arr_data = arr_data;
    }

    public String getArr_id() {
        return arr_id;
    }

    public void setArr_id(String arr_id) {
        this.arr_id = arr_id;
    }

    public Programa[] getArr_data() {
        return arr_data;
    }

    public void setArr_data(Programa[] arr_data) {
        this.arr_data = arr_data;
    }

    public void showInfo(int number){
        for(int i=0; i<number; i++){
            System.out.println("Programa abierto: " + arr_data[(int)(Math.random()*number+1)].getProg_name());
        }
    }
}