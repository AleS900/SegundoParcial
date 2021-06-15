package Ejercicios.Ejercicio_1;

public class Memento {
    private Documento state;

    public Memento(Documento stateSaved){
        this.state=stateSaved;
    }

    public Documento getState() {
        return state;
    }
}