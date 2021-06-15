package Ejercicios.Ejercicio_3;

public class Client {
    public static void main (String []args){

        PerfilDeFacebook perfilDeFacebook = new PerfilDeFacebook();

        UsuarioRegistrado user1 = new UsuarioRegistrado(new Persona("123","Juan"),"VIDEO");
        UsuarioRegistrado user2 = new UsuarioRegistrado(new Persona("124","María"),"IMAGEN");
        UsuarioRegistrado user3 = new UsuarioRegistrado(new Persona("125","Enola"),"TODOS");
        UsuarioRegistrado user4 = new UsuarioRegistrado(new Persona("126","Granola"),"VIDEO");
        UsuarioRegistrado user5 = new UsuarioRegistrado(new Persona("127","Choclo"),"IMAGEN");

        perfilDeFacebook.attach(user1);
        perfilDeFacebook.attach(user2);
        perfilDeFacebook.attach(user3);
        perfilDeFacebook.attach(user4);
        perfilDeFacebook.attach(user5);

        perfilDeFacebook.uploadNewPublication(new Publicacion("COMO IMPLEMENTAR EL PATRON DE DISEÑO OBSERVER","VIDEO"));
        perfilDeFacebook.uploadNewPublication(new Publicacion("TWITTER ICON","IMAGEN"));
    }
}
