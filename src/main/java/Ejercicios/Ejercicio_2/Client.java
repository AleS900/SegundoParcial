package Ejercicios.Ejercicio_2;

public class Client {
    public static void main (String[] args){
        ChatEducativo chat = new ChatEducativo();
        //Estudiantes
        //1.
        Estudiante student_1 =  new Estudiante(chat, "Carlos",1456, true,false,false);
        //2.
        Estudiante student_2 =  new Estudiante(chat, "María",5255, false,true,false);
        //3.
        Estudiante student_3 =  new Estudiante(chat, "Juan",2525, true,true,false);
        //4.
        Estudiante student_4 =  new Estudiante(chat, "Alex",6363, true,false,false);
        //5.
        Estudiante student_5 =  new Estudiante(chat, "Mateo",2626, false,false,true);


        //Administrador
        //1.
        Administrativo admin_1 = new Administrativo(chat,"Carmen Sux",1415,"Secretaria");
        //2.
        Administrativo admin_2 = new Administrativo(chat,"Alexander Entrambasaguas",1516,"Administador");
        //3.
        Administrativo admin_3 = new Administrativo(chat,"Rocio Merida",1617,"Secretaria General");

        //Docente
        //1.
        Docente teacher_1 =  new Docente(chat, "Daniela Morales", 2526463);
        //2.
        Docente teacher_2 =  new Docente(chat, "Rosario Rosales", 3525262);
        //3.
        Docente teacher_3 =  new Docente(chat, "Melania Tapia", 7347373);


        chat.addPeopleToList(student_1);
        chat.addPeopleToList(student_2);
        chat.addPeopleToList(student_3);
        chat.addPeopleToList(student_4);
        chat.addPeopleToList(student_5);
        chat.addPeopleToList(teacher_1);
        chat.addPeopleToList(teacher_2);
        chat.addPeopleToList(teacher_3);
        chat.addPeopleToList(admin_1);
        chat.addPeopleToList(admin_2);
        chat.addPeopleToList(admin_3);

        //Enviar Mensajes
        student_1.send("Hola como estan Docentes");
        System.out.println();
        student_5.send("Hola a Todos");
        System.out.println();
        student_2.send("Hola Administrativos");
        System.out.println();
        teacher_3.send("Hola docentes y estudiantes");
        System.out.println();
        admin_2.send("Hola a TODOS USTEDES");

    }

}
