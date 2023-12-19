package ActividadesJava;
import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class Listas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>(Arrays.asList());

        int cantidad_valores = 5;
        int mayor_num = -99999;
        int menor_num = 99999;

        while (cantidad_valores > 0) {
            System.out.println("Escribe un valor");
            int valor_actual = scanner.nextInt();
            if (valor_actual < menor_num) {
                menor_num = valor_actual;
            }
            if (valor_actual > mayor_num) {
                mayor_num = valor_actual;
            }
            numeros.add(valor_actual);
            cantidad_valores--;
        }
        System.out.println("Los numeros introducidos son "+numeros+" El mayor numero es: "+mayor_num+ " y el menor es: "+menor_num);
    }

}
