package Ejercicios.Ejercicio_3;

public class Publicacion {
    private String titulo;
    private String categoria;

    public Publicacion(String titulo, String categoria){
        this.titulo=titulo;
        this.categoria= categoria;
    }

    public void info(){
        System.out.println("INFO > Título    : "+titulo);
        System.out.println("INFO > Tipo de P.: [" + categoria + "]\n");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
