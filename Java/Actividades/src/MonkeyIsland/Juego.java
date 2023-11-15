package MonkeyIsland;

import java.util.Scanner;
import static MonkeyIsland.Metodos.*;

// Importacion de metodos.

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

        // Variables.

        System.out.println("----------------Bienvendio a Monkey Island-----------------------");
        System.out.println("-----------Aquí tendrás que ingeniarte las respuestas------------");
        System.out.println("-----------correctas para los insultos de tus enemigos,----------");
        System.out.println("-----------si eliges la equivocada perderás el duelo.------------");
        System.out.println("-----------------------------------------------------------------");

        // Texto de titulo.

        int MonedaInicio = NumAleatorio(0, 2);

        // Metodo num aleatorio usado para determinar si empieza el enemigo o el jugador.

        if (MonedaInicio == 0) {
            while (WinJugador < 3 && WinEnemigo < 3) {
            int[] resultados = RondaJugador(WinJugador, WinEnemigo);
            WinJugador = resultados[0];
            WinEnemigo = resultados[1];
            resultados = RondaEnemigo(WinJugador, WinEnemigo);
            WinJugador = resultados[0];
            WinEnemigo = resultados[1];
        }
        } else {
            while (WinJugador < 3 && WinEnemigo < 3) {
            int [] resultados = RondaEnemigo(WinJugador, WinEnemigo);
            WinJugador = resultados[0];
            WinEnemigo = resultados[1];
            resultados = RondaJugador(WinJugador, WinEnemigo);
            WinJugador = resultados[0];
            WinEnemigo = resultados[1];
        }
        
            
        }
        // Un if, si sale un 0 o 1 se elige un bucle diferente donde se llaman a los metodos en un orden distinto para asi definir quien empieza,
        // donde se ejecutan las rondas, además de actualizar los valores del marcador.

    }
}
