package Ejercicios.Ejercicio_4;

import java.util.Collections;
import java.util.Comparator;

public class EstrategiaOrdenamientoFechaOProfesion  implements IEstrategiaDeOrdenamiento{
    @Override
    public void ordenar(ListaDePersonas personList) {
        System.out.println("**************************************");
        if(personList.getSort_filter().toLowerCase().equals("profesion")){
            System.out.println("********** ORDENAR POR PROFESION ********");
            sortP(personList);
            System.out.println("**************************************");
        } else if(personList.getSort_filter().toLowerCase().equals("fecha de nacimiento")){
            System.out.println("********** ORDENAR POR FECHA DE NACIMIENTO ********");
            sortBD(personList);
            System.out.println("**************************************");
        }
    }

    public void sortP(ListaDePersonas lista){
        Collections.sort(lista.getPersonList(), new Comparator<Persona>() {
            @Override
            public int compare(Persona person1, Persona person2) {
                return person1.getProffession().compareTo(person2.getProffession());
            }
        });
        printLista1(lista);
    }

    public void printLista1(ListaDePersonas lista){
        for(int i = 0; i < lista.getPersonList().size(); i++){
            System.out.println("-- PROFESION.: " + lista.getPersonList().get(i).getProffession() +
                    " -- C.I.:" + lista.getPersonList().get(i).getPers_id() +
                    ", FECHA DE NACIMIENTO: " + lista.getPersonList().get(i).getBirth_Date() +
                    ", NOMBRE: " + lista.getPersonList().get(i).getPers_name());
        }
    }

    public void sortBD(ListaDePersonas lista){
        Collections.sort(lista.getPersonList(), new Comparator<Persona>() {
            @Override
            public int compare(Persona person1, Persona person2) {
                return person1.getBirth_Date().compareTo(person2.getBirth_Date());
            }
        });
        printLista2(lista);
    }

    public void printLista2(ListaDePersonas lista){
        for(int i = 0; i < lista.getPersonList().size(); i++){
            System.out.println("-- FECHA DE NACIMIENTO: " + lista.getPersonList().get(i).getBirth_Date() +
                    " -- NOMBRE.: " + lista.getPersonList().get(i).getPers_name() +
                    ", C.I.:" + lista.getPersonList().get(i).getPers_id() +
                    ", PROFESION: " + lista.getPersonList().get(i).getProffession());
        }
    }
}