package Ejercicios.Ejercicio_4;

import java.util.List;
import java.util.ArrayList;

public class Client {
    public static void main (String []args) {
        BaseDeDatos data_base = new BaseDeDatos();
        List<Persona> person_list = new ArrayList<>();
        person_list.add(new Persona(4010747,"Carlos","2000-06-10","Herrero"));
        person_list.add(new Persona(6373754,"Pedro","1992-10-15","Peluquero"));
        person_list.add(new Persona(3633536,"Martha","2010-08-15","Profesora"));
        person_list.add(new Persona(3737747,"Juan","2000-07-4","Cajero"));
        person_list.add(new Persona(8585353,"Jose","2015-11-23","Administrador"));
        person_list.add(new Persona(4848633,"Viacheslav","1952-12-30","Policia"));
        person_list.add(new Persona(4842524,"Gabriel","1980-06-10","Primer Ministro"));
        person_list.add(new Persona(7262010,"Alexander","1998-04-11","Entrenador"));
        person_list.add(new Persona(2666362,"Daniel","1924-02-7","Futbolista"));
        person_list.add(new Persona(7272272,"Carla","2000-01-6","Repartidor"));
        person_list.add(new Persona(9727373,"Karla","2001-06-4","Conserje"));
        person_list.add(new Persona(10263366,"Ana","2006-06-2","Vago"));

        //1.
        ListaDePersonas listaDePersonas = new ListaDePersonas(person_list,"Carnet de Identidad");
        //2.
        ListaDePersonas listaDePersonas1 = new ListaDePersonas(person_list,"Nombre");
        //3.
        ListaDePersonas listaDePersonas2 = new ListaDePersonas(person_list,"Fecha de Nacimiento");
        //4.
        ListaDePersonas listaDePersonas3 = new ListaDePersonas(person_list,"Profesion");


        //1.
        data_base.setPerson_list(listaDePersonas);
        data_base.setSort_strategy( new EstrategiaOrdenamientoCarnet());
        data_base.ordenarConEstrategia();

        //2.
        data_base.setPerson_list(listaDePersonas1);
        data_base.setSort_strategy( new EstrategiaDeOrdenamientoNombre());
        data_base.ordenarConEstrategia();

        //3.
        data_base.setPerson_list(listaDePersonas2);
        data_base.setSort_strategy( new EstrategiaOrdenamientoFechaOProfesion());
        data_base.ordenarConEstrategia();

        //4.
        data_base.setPerson_list(listaDePersonas3);
        data_base.setSort_strategy( new EstrategiaOrdenamientoFechaOProfesion());
        data_base.ordenarConEstrategia();
    }
}
