package Ejercicios.Ejercicio_4;

public class EstrategiaOrdenamientoCarnet implements IEstrategiaDeOrdenamiento{
    @Override
    public void ordenar(ListaDePersonas personList) {
        System.out.println("**************************************");
        System.out.println("*** ORDENAR PO CARNET DE IDENTIDAD ***");
        if(personList.getSort_filter().toLowerCase().equals("carnet de identidad")){
            bubbleSort(personList);
            System.out.println("**************************************");
        }
    }

    public void bubbleSort(ListaDePersonas lista){
        int n =  lista.getPersonList().size();
        for (int i = 0; i < n-1 ; i++){
            for (int j = 0; j < n-1-i; j++){
                if (lista.getPersonList().get(j).getPers_id() > lista.getPersonList().get(j+1).getPers_id()){
                    Persona temp =  lista.getPersonList().get(j);
                    lista.getPersonList().add(j,lista.getPersonList().get(j+1));
                    lista.getPersonList().remove(j+1);
                    lista.getPersonList().add(j+1,temp);
                    lista.getPersonList().remove(j+2);
                }
            }
        }
        printLista(lista);
    }

    public void printLista(ListaDePersonas lista){
        for(int i = 0; i < lista.getPersonList().size(); i++){
            System.out.println("-- C.I.: " + lista.getPersonList().get(i).getPers_id() +
                    " -- NOMBRE:" + lista.getPersonList().get(i).getPers_name() +
                    ", FECHA DE NACIMIENTO: " + lista.getPersonList().get(i).getBirth_Date() +
                    ", PROFESION: " + lista.getPersonList().get(i).getProffession());
        }
    }
}
