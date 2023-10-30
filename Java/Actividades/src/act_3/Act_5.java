package act_3;
import java.util.Scanner;
public class Act_5 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el radio de la cirfumferencia: ");
        double Radio = scanner.nextDouble();

        double longitud = 3.14 * Radio;
        double area = 3.14 * (Radio*Radio);

        System.out.println("La longitud de la circumferencia es: " +longitud+ " cm y el area es: " +area+ " cm2");
        scanner.close();
    }

}
