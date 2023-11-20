package JuegoNumAleatorio;

import java.util.Random;
import java.util.Scanner;
public class Juego {
    public static void main(String[] args) {

        int NumeroAleatorio = NumAleatorio(0, 50);
        int NumeroSeleccionado = 0;
        int vidas = 5;
        boolean win = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------Trata de adivinar el numero aleatorio-----------");
        System.out.println("---------------------Tienes 5 vidas-------------------------");

        while (vidas < 5 && win == false) {
            System.out.println("Escribe un numero: ");
            NumeroSeleccionado = scanner.nextInt();
        }



    }

    public static int NumAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo);
    }

}