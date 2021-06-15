package Ejercicios.Ejercicio_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatEducativo implements ICanalDeComunicacion{
    private Map<Integer, Colleague> people_chat = new HashMap<>();
    private List<Integer> list_of_id = new ArrayList<>();
    int key;

    public void addPeopleToList(Colleague peopletoAdd){
        if(peopletoAdd instanceof Estudiante){
            Estudiante student = (Estudiante)peopletoAdd;
            key = student.getStd_matricula();
            list_of_id.add(key);
            addPeopleToMap(key, peopletoAdd);
        }else if (peopletoAdd instanceof Docente){
            Docente teacher = (Docente)peopletoAdd;
            key = teacher.getTch_ci();
            list_of_id.add(key);
            addPeopleToMap(key, peopletoAdd);
        }else if (peopletoAdd instanceof Administrativo){
            Administrativo student = (Administrativo) peopletoAdd;
            key = student.getAdmin_id();
            list_of_id.add(key);
            addPeopleToMap(key, peopletoAdd);
        }
    }

    public void addPeopleToMap(int id_persona, Colleague persona){
        people_chat.put(id_persona,persona);
    }

    @Override
    public void send(String message, Colleague colleague) {
        Colleague personaParseOrigen = colleague;
        for (int people_id : list_of_id){
            if (personaParseOrigen instanceof Administrativo) {
                Administrativo administrativo = (Administrativo)personaParseOrigen;
                if(people_id != administrativo.getAdmin_id()){
                    people_chat.get(people_id).messageReceived();
                }
            } else if (personaParseOrigen instanceof Docente ) {
                Docente docente = (Docente)personaParseOrigen;
                if(people_id != docente.getTch_ci()){
                    people_chat.get(people_id).messageReceived();
                }
            } else if (personaParseOrigen instanceof Estudiante){
                Administrativo administrativo = (Administrativo)personaParseOrigen;
                if(people_id != administrativo.getAdmin_id()){
                    people_chat.get(people_id).messageReceived();
                }
            }
        }
    }
}
