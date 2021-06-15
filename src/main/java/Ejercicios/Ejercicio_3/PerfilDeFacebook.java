package Ejercicios.Ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class PerfilDeFacebook implements IPerfil {
    private List<IUsuario> observerList= new ArrayList<>();
    private List<Publicacion> publicationList = new ArrayList<>();

    public void uploadNewPublication(Publicacion publicacion){
        publicationList.add(publicacion);
        this.notifyObserver(publicacion);
    }

    @Override
    public void attach(IUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(Publicacion publicacion) {
        for (IUsuario facebookUser:observerList) {
            if (facebookUser.getCategoria().equals(publicacion.getCategoria()) || facebookUser.getCategoria().equals("TODOS") ){
                // notificacion
                facebookUser.update("Se subio una nueva publicación titulo: " + publicacion.getTitulo(), publicacion);
            }
        }
    }
}
