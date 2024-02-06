package HeroSlay;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Carta carta1 = new Carta("Espadazo", "ATAQUE", 3);
        Carta carta2 = new Carta("PocionCurativa", "CURACION", 2);


        List<Carta> mazo = new ArrayList<>();

        mazo.add(carta1);
        mazo.add(carta2);

        Personaje heroe = new Personaje("Itadori", 10, mazo);
        Personaje villano = new Personaje("Sukuna", 10, mazo);

        Random random = new Random();
        boolean HeroeEmpieza = random.nextBoolean();


        System.out.println("Pelea entre " + heroe.getNombre() + " y " + villano.getNombre() +"!!!");
        System.out.println(heroe.getNombre()+ ", Vida: " +heroe.getVida() +", Mazo: " +heroe.getMazo());
        System.out.println(villano.getNombre()+ ", Vida: " +villano.getVida() +", Mazo: " +villano.getMazo());

        while (heroe.getVida() >= 0 && villano.getVida() >= 0) {
            int carta_aleatoria = random.nextInt(0, mazo.size());
            int seleccion_carta = random.nextInt(0, mazo.size());

            //HEROE
            System.out.println("----------"+heroe.getNombre()+"----------");
            System.out.println("Cartas disponibles: ");

            //GENERA LAS CARTAS
            Carta carta_disponible1 = mazo.get(carta_aleatoria);
            String carta_disponible1_nombre = carta_disponible1.getNombre();
            System.out.println("1: "+carta_disponible1_nombre);

            carta_aleatoria = random.nextInt(0, mazo.size());

            Carta carta_disponible2 = mazo.get(carta_aleatoria);
            String carta_disponible2_nombre = carta_disponible2.getNombre();
            System.out.println("2: "+carta_disponible2_nombre);

            if (carta_disponible1.getTipo().equals(CartaTipo.ATAQUE)) {
                villano.RecibirDaño();
            }

        }



    }


}
