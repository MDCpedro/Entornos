package torneo_padel;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Torneo {

    public static List<Pareja> parejas;


    public static void main(String[] args) {
        System.out.println("Nuevo Torneo");

        parejas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que desea hacer?");
        System.out.println("0- Cerrar Aplicacion");
        System.out.println("1- Crear Equipo");
        System.out.println("2- Elimianr Equipo");

        System.out.println(">> ");
        int funcion = scanner.nextInt();
        while (funcion != 0) {
            switch (funcion) {
                case 1 -> inscribirParejas();
                case 2 -> eliminarPareja();
            }
            System.out.println("Selecciona una funcion: ");
            funcion = scanner.nextInt();
        }


        // Crear parejas
        inscribirParejas();
    }


    private static void inscribirParejas() {
        Scanner scanner = new Scanner(System.in);

        //crear una pareja con su contador
        Integer id = parejas.size() + 1;//Autogenerado
        System.out.println("Introduce nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();
        System.out.println("Introduce nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();
        System.out.println("Introduce telefono de contacto: ");
        Integer telefono = scanner.nextInt();
        Pareja pareja = new Pareja(id, nombre1, nombre2, telefono);

        //Añade la pareja a la lista del torneo.
        parejas.add(pareja);

        scanner.close();
    }

    private static void eliminarPareja() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el id del equipo a eliminar: ");
        Integer id = scanner.nextInt();

        Pareja parejaAEliminar = null;
        for (Pareja pareja : parejas) {
            if (pareja.getId() == id) {
                parejaAEliminar = pareja;
            }
        }
        parejas.remove(parejaAEliminar);
    }
}