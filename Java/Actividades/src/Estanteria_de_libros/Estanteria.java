package Estanteria_de_libros;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class Estanteria {
    private List<Libro> libros;


    public Estanteria(){
       this.libros = new ArrayList<>();
    }

    public void pintarElecciones() {
        System.out.println("------- Estanteria de libros ---------");
        System.out.println("----- ¿Que te gustaria hacer? --------");
        System.out.println("-0. Salir.");
        System.out.println("-1. Añadir un libro.");
        System.out.println("-2. Eliminar un lbiro.");
        System.out.println("-3. Top 10 libros (mostrar libros por calificacion de mayor a menor)");
        System.out.println("-4. Mostrar libros de la estanteria");
        System.out.println("-- Selecciona una opcion pulsando su numero correspondiente. --");

    }

    private void añadirLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Escribe el titulo del libro:");
        String titulo = scanner.nextLine();
        System.out.println("- Escribe el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("- Escribe la calificacion del libro: ");
        double calificacion = scanner.nextDouble();
        Libro libro = new Libro(titulo, autor, calificacion);
        this.libros.add(libro);
    }
}
