package act_3;
import java.util.Scanner;
public class Act_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe que grados hace en Cº" );

        double grados = scanner.nextInt();

        double farenheit = (grados * 9 / 5) + 32;
        System.out.println("Estos grados en farenheit son: " +farenheit+ " Fº");
        scanner.close(); 

    }
}
