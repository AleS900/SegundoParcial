package Ejercicios.Ejercicio_4;

public class BaseDeDatos {
    private IEstrategiaDeOrdenamiento sort_strategy;
    private ListaDePersonas person_list;

    public BaseDeDatos() {
    }

    public void ordenarConEstrategia(){
        sort_strategy.ordenar(this.person_list);
    }

    public IEstrategiaDeOrdenamiento getSort_strategy() {
        return sort_strategy;
    }

    public void setSort_strategy(IEstrategiaDeOrdenamiento sort_strategy) {
        this.sort_strategy = sort_strategy;
    }

    public ListaDePersonas getPerson_list() {
        return person_list;
    }

    public void setPerson_list(ListaDePersonas person_list) {
        this.person_list = person_list;
    }
}
