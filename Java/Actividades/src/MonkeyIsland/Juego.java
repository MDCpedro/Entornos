package MonkeyIsland;

import java.util.Scanner;
import static MonkeyIsland.Metodos.NumAleatorio;
import static MonkeyIsland.Metodos.RondaJugador;

public class Juego {
    public static void main(String[] args) {

        String[] insultos = {
          "¿Has dejado ya de usar pañales?",
          "No hay palabras para describir lo asqueroso que eres.",
          "He hablado con simios mas educados que tu.",
          "Eres como un dolor en la parte baja de la espalda.",
        };

        String[] respuestas = {
                "¿Por qué? ¿A caso querías pedir uno prestado?",
                "Si que las hay, lo que nunca las has aprendido",
                "Me alegra que asistieras a tu reunion familiar diaria",
                "Ya te estan fastidandote otra vez las almorranas eh?"
        };

        int WinJugador = 0;
        int WinEnemigo = 0;

        System.out.println("----------------Bienvendio a Monkey Island-----------------------");
        System.out.println("-----------Aquí tendrás que ingeniarte las respuestas------------");
        System.out.println("-----------correctas para los insultos de tus enemigos,----------");
        System.out.println("-----------si eliges la equivocada perderás el duelo.------------");
        System.out.println("-----------------------------------------------------------------");

        int NumInicio = NumAleatorio(0, 4);

        while (WinJugador != 3 || WinEnemigo != 3) {
            RondaJugador();

        }


    }
}
