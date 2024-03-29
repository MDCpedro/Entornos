package Estanteria_de_libros;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Estanteria {
    private List<Libro> libros = new ArrayList<>();

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

    public void añadirLibro(String titulo, String autor, double nota) {
        Libro libro = new Libro(titulo, autor, nota);
        this.libros.add(libro);
    }

    public void eliminarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libros.remove(libro);
                System.out.println("Libro eliminado correctamente");
                return;
            }
        }
        System.out.println("No se ha encontrado del libro");
    }

    public void mostrarEstanteria() {
        System.out.println("Libros en la estantería:");
        for (Libro libro : libros) {
            System.out.println(libro.toString());
            System.out.println("--------");
        }
    }

    public void mostrarTop10Libros() {
        Collections.sort(libros, Comparator.comparingDouble(Libro::getCalificacion).reversed());

        System.out.println("Top 10 libros:");
        int contador = 0;
        for (Libro libro : libros) {
            if (contador < 10) {
                System.out.println(libro.toString());
                System.out.println("--------");
                contador++;
            } else {
                break;
            }
        }
    }

}
