package act_3;

import java.util.Scanner;

public class Act_6 {
     public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una velocidad en Km/h");
        double kilometros = scanner.nextDouble();

        double metroseg = kilometros/3.6;
        System.out.println("La velocidad es de: " +metroseg+ " metros por segundo");
        scanner.close();
    }

}