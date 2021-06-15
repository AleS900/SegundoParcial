package Ejercicios.Ejercicio_4;

public class Persona {
    private int pers_id;
    private String pers_name;
    private String birth_Date;
    private String proffession;

    public Persona() {
    }

    public Persona(int pers_id, String pers_name, String birth_Date, String proffession) {
        this.pers_id = pers_id;
        this.pers_name = pers_name;
        this.birth_Date = birth_Date;
        this.proffession = proffession;
    }

    public void showInfo(){
        System.out.println("-- ID    : " + pers_id);
        System.out.println("-- Nombre: " + pers_name);
        System.out.println("-- Fecha");
        System.out.println("   De");
        System.out.println("   Nac.  : " + birth_Date );
        System.out.println("-- Prof. : " + proffession);
    }

    public int getPers_id() {
        return pers_id;
    }

    public void setPers_id(int pers_id) {
        this.pers_id = pers_id;
    }

    public String getPers_name() {
        return pers_name;
    }

    public void setPers_name(String pers_name) {
        this.pers_name = pers_name;
    }

    public String getBirth_Date() {
        return birth_Date;
    }

    public void setBirth_Date(String birth_Date) {
        this.birth_Date = birth_Date;
    }

    public String getProffession() {
        return proffession;
    }

    public void setProffession(String proffession) {
        this.proffession = proffession;
    }
}
