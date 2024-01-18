package Estanteria_de_libros;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Estanteria estanteria1 = new Estanteria();

        estanteria1.añadirLibro("L1", "A1", 4);
        estanteria1.añadirLibro("L2", "A2", 8);



        Scanner scanner = new Scanner(System.in);
        System.out.println("- Escribe el titulo del libro:");
        String titulo = scanner.nextLine();
        System.out.println("- Escribe el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("- Escribe la calificacion del libro: ");
        double calificacion = scanner.nextDouble();
        estanteria1.añadirLibro(titulo, autor, calificacion);



        //Estanteria estanteria = new Estanteria();
        Scanner scanner = new Scanner(System.in);
        //Estanteria.pintarElecciones();
        int eleccion = scanner.nextInt();
        while (eleccion != 0) {
            switch (eleccion) {
                case 1:

            }
        }
    }
}