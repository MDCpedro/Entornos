package act_3;

import java.util.Scanner;

public class HundirFlota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] tablero = {
            {1, 0, 0, 0, 0},
            {0, 0, 1, 0, 1},
            {0, 1, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {0, 0, 1, 1, 0}
        };

        int intentos = 5;
        int barcosHundidos = 0;
        while (intentos > 0) {
            
            System.out.println("Introduce la cordenada X (horizontal 0-4)");
            int X = scanner.nextInt();
            System.out.println("Introduce la cordenada Y (vertical 0-4)");
            int Y = scanner.nextInt();

            if (X > 5 || X < 0 || Y > 5 || Y < 0 ) {
                System.out.println("Estas cordenadas no existen!!!");

            }
            else if (tablero[Y][X] == 1) {
                System.out.println("¡Has dado en el blanco!");
                intentos--;
                barcosHundidos++;
                tablero[Y][X] = 0;
            }
            else if (tablero[Y][X] == 0) {
                System.out.println("¡Has fallado!");
                intentos--;
                barcosHundidos--;
            }
            
        }
        System.out.println("Fin, has derribado " + barcosHundidos + " barcos" );
        scanner.close();
    }
}
