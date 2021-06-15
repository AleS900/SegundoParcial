package Ejercicios.Ejercicio_4;

import java.util.Collections;
import java.util.Comparator;

public class EstrategiaDeOrdenamientoNombre implements IEstrategiaDeOrdenamiento{
    @Override
    public void ordenar(ListaDePersonas personList) {
        System.out.println("**************************************");
        System.out.println("********** ORDENAR POR NOMBRE ********");
        if(personList.getSort_filter().toLowerCase().equals("nombre")){
            sortName(personList);
            System.out.println("**************************************");
        }
    }

    public void sortName(ListaDePersonas lista){
        Collections.sort(lista.getPersonList(), new Comparator<Persona>() {
            @Override
            public int compare(Persona person1, Persona person2) {
                return person1.getPers_name().compareTo(person2.getPers_name());
            }
        });
        printLista(lista);
    }

    public void printLista(ListaDePersonas lista){
        for(int i = 0; i < lista.getPersonList().size(); i++){
            System.out.println("-- NOMBRE.: " + lista.getPersonList().get(i).getPers_name() +
                    " -- C.I.:" + lista.getPersonList().get(i).getPers_id() +
                    ", FECHA DE NACIMIENTO: " + lista.getPersonList().get(i).getBirth_Date() +
                    ", PROFESION: " + lista.getPersonList().get(i).getProffession());
        }
    }
}