package ActividadesJava;

import java.util.Scanner;

public class Act_3 {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int Num1 = scanner.nextInt();

        int Doble = Num1*2;
        int Triple = Num1*3;

        System.out.println("El doble de este numero es: " +Doble);
        System.out.println("El triple es: " +Triple);
        scanner.close();

    }
    
}
