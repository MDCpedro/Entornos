package act_3;

import java.util.Scanner;

public class Act_8 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿De que te gustaria calcular el area? ");
        System.out.println("Introduce la siguiente letra asignada para cada forma.");
        System.out.println("T > Triangulo");
        System.out.println("C > Cuadrado");
        System.out.println("P > Pentagono");
        String Eleccion = scanner.nextLine();

        if (Eleccion.equals("T")) {
            System.out.println("Escribe la base del triangulo: ");
            int Base = scanner.nextInt();
            System.out.println("Escribe la altura del triangulo: ");
            int Altura = scanner.nextInt();
            int AreaTriangulo = Base*Altura/2;
            System.out.println("El area del triangulo es: " +AreaTriangulo+ " cm2");
            scanner.close();
        } 

    }
}
