package act_3;

import java.util.Scanner;

public class Act_7 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cantidad de euros: ");
        double euros = scanner.nextDouble();
        System.out.println("Introduce una cantidad de pesetas: ");
        double peseta = scanner.nextDouble();
        
        double EuroAPeseta = euros * 166.38;
        double PesetaAEuro = peseta/166.38;

        System.out.println(euros+ " euros equivalen a " +EuroAPeseta+ " pesetas");
        System.out.println(peseta+ " pesetas equivalen a " +PesetaAEuro+ " euros");
        scanner.close();
    }
        
}
