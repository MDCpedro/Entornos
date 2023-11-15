package MonkeyIsland;
import java.util.Random;
import java.util.Scanner;

public class Metodos {
    public static int NumAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo);
    }

// Metodo que genera numeros aleatorios.

    public static int[] RondaJugador(int WinJugador, int WinEnemigo) {
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

        int[] resultados = {WinJugador, WinEnemigo};
        int NumInicio = NumAleatorio(0, 4);


        System.out.println("[Enemigo]: " +insultos[NumInicio]);
        System.out.println("--------------------Elige una respuesta--------------------------");
        System.out.println("0 - " +respuestas[0]);
        System.out.println("1 - " +respuestas[1]);
        System.out.println("2 - " +respuestas[2]);
        System.out.println("3 - " +respuestas[3]);
        System.out.println("E-------------------Escribe 0, 1, 2, 3.--------------------------");

        Scanner Eleccion = new Scanner(System.in);
        int NumEleccion = Eleccion.nextInt();

        System.out.println("[Jugador]: "+respuestas[NumEleccion]);
        if (NumEleccion == NumInicio) {
            resultados[0]++;
            System.out.println("----------Has ganado la ronda! +1 punto----------------.");
            System.out.println("-------- Marcador actual: " +WinJugador+ " - " +WinEnemigo+ " --------");
        } else {
            resultados[1]++;
            System.out.println("----------Has perdido la ronda! ----------------.");
            System.out.println("-------- Marcador actual: " +WinJugador+ " - " +WinEnemigo+ " --------");
        }
        return resultados;
    }

    // Metodo donde el enemigo te insulta, y tu respondes.

    public static int[] RondaEnemigo(int WinJugador, int WinEnemigo) {
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

        int[] resultados = {WinJugador, WinEnemigo};

        System.out.println("--------------------Elige una insulto--------------------------");
        System.out.println("0 - " +insultos[0]);
        System.out.println("1 - " +insultos[1]);
        System.out.println("2 - " +insultos[2]);
        System.out.println("3 - " +insultos[3]);
        System.out.println("E-------------------Escribe 0, 1, 2, 3.--------------------------");

        Scanner Eleccion = new Scanner(System.in);
        int NumEleccion = Eleccion.nextInt();
        System.out.println("[Jugador]: "+insultos[NumEleccion]);

        int NumRespuesta = NumAleatorio(0, 4);
        System.out.println("[Enemigo]: "+respuestas[NumRespuesta]);

        if (NumEleccion == NumRespuesta) {
            resultados[1]++;
            System.out.println("----------Has perdido la ronda! ----------------.");
            System.out.println("-------- Marcador actual: " +WinJugador+ " - " +WinEnemigo+ " --------");
        } else {
            resultados[0]++;
            System.out.println("----------Has ganado la ronda! +1 punto----------------.");
            System.out.println("-------- Marcador actual: " +WinJugador+ " - " +WinEnemigo+ " --------");
        }
        return resultados;
    }
    // Metodo donde tu insultas y el enemigo responde.
}

