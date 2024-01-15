package Estanteria_de_libros;

public class Libro {

    private String titulo;
    private String autor;
    private double calificacion;

    public Libro() {
        this.titulo = titulo;
        this.autor = autor;
        this.calificacion = calificacion;
    }

    //GETTER Y SETTER DE TITULO
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String nuevo_titulo) {this.titulo = nuevo_titulo;}

    //GETTER Y SETTER DE AUTOR
    public String getAutor() {return this.autor;}
    public void setAutor(String nuevo_autor) {this.autor = nuevo_autor;}

    //GETTER Y SETTER DE CALIFICACION
    public double getCalificacion() {return this.calificacion;}
    public void setCalificacion(double nueva_calificacion) {this.calificacion = nueva_calificacion;}

}
