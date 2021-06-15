package Ejercicios.Ejercicio_4;

import java.util.List;

public class ListaDePersonas {
    private List<Persona> personList;
    private String sort_filter;

    public ListaDePersonas(List<Persona> personList, String sort_filter) {
        this.personList = personList;
        this.sort_filter = sort_filter;
    }

    public List<Persona> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Persona> personList) {
        this.personList = personList;
    }

    public String getSort_filter() {
        return sort_filter;
    }

    public void setSort_filter(String sort_filter) {
        this.sort_filter = sort_filter;
    }
}
