package ActividadesJava;
import java.util.Scanner;
public class BuscarNombres {
    public static void main(String[] args) {
        String nombres[] = {"Pedro", "Freddy", "Daniel", "Aina", "Juan", "Irek", "Pablo Motos"};

        Scanner preguntaNombre =  new Scanner(System.in);
        System.out.println("Escribe el nombre que quieres buscar");
        String nombrebuscar = preguntaNombre.nextLine();

        boolean encontrado = false;
        int index = 0;
        while (index < nombres.length) {
            if (nombres[index].equals(nombrebuscar)) {
                System.out.println("El nombre se encuentra en la posicion "+index);
                encontrado = true;
                break;
            } else {
                index++;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el nombre");
        }
    }
}
