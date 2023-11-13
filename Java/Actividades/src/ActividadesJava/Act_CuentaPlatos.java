package ActividadesJava;
import java.util.Scanner;
public class Act_CuentaPlatos {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int contador = 0;
         double Precio = 1;
         double Total = 0;

         while (Precio != 0) {
            System.out.println("Introduce el precio de cada plato, cuando acabes pon 0: ");
            Precio = scanner.nextDouble();

            if (Precio > 0) {
                    Total = Precio+Total;
                    contador = contador+1;
            }
            else if (Precio < 0) {
                System.out.println("No se admiten numeros negativos. Vuelve a escribir un precio.");
                Precio = scanner.nextDouble();
            }
            scanner.close();
         }
         System.out.println("El pedido es de " +contador+ " platos, con un total de " +Total+ " euros" );
    }
}
