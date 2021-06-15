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
        for (int people : list_of_id){
            if (personaParseOrigen instanceof Administrativo) {
                Administrativo administrativo = (Administrativo)personaParseOrigen;
                if(people != administrativo.getAdmin_id()){
                    people_chat.get(people).messageReceived(message);
                }
            } else if (personaParseOrigen instanceof Docente && (people_chat.get(people) instanceof Docente
                    || people_chat.get(people) instanceof Estudiante)) {
                Docente docente = (Docente)personaParseOrigen;
                if(people != docente.getTch_ci()){
                    people_chat.get(people).messageReceived(message);
                }
            } else if (personaParseOrigen instanceof Estudiante && (people_chat.get(people) instanceof Docente
                    || people_chat.get(people) instanceof Administrativo)){
                Estudiante estudiante = (Estudiante) personaParseOrigen;
                if(people != estudiante.getStd_matricula() && estudiante.isSend_to_all()){
                    people_chat.get(people).messageReceived(message);
                } else if(people != estudiante.getStd_matricula() && estudiante.isSend_to_admi() && people_chat.get(people) instanceof Administrativo){
                    people_chat.get(people).messageReceived(message);
                } else  if(people != estudiante.getStd_matricula() && estudiante.isSend_to_teacher()  && people_chat.get(people) instanceof Docente){
                    people_chat.get(people).messageReceived(message);
                }
            }
        }
    }
}
