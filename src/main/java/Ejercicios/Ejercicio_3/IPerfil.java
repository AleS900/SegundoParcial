package Ejercicios.Ejercicio_3;

public interface IPerfil {
    void attach(IUsuario observer);
    void deattach(IUsuario observer);
    void notifyObserver(Publicacion publicacion);
}
