package Estanteria_de_libros;
import java.util.Scanner;
public class TestEstanteria {
    public static void main(String[] args) {

        Estanteria estanteria1 = new Estanteria();

        estanteria1.añadirLibro("L1", "A1", 4);
        estanteria1.añadirLibro("L2", "A2", 8);

        estanteria1.mostrarEstanteria();
        estanteria1.mostrarTop10Libros();

    }
}