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

        Personaje heroe = new Personaje("Yuuji", 10, mazo);
        Personaje villano = new Personaje("Sukuna", 10, mazo);

        System.out.println("Pelea entre" + heroe.getNombre());

        pelea(heroe, villano, mazo);



    }

    public static void pelea(Personaje heroe, Personaje villano, List Mazo) {
        Random random = new Random();
        boolean HeroeEmpieza = random.nextBoolean();
        int Seleccion = random.nextInt(0, 2);

        System.out.println("Pelea entre " + heroe.getNombre() + " y " + villano.getNombre() +"!!!");
        System.out.println(heroe.getNombre()+ ", Vida: " +heroe.getVida() +", Mazo: " +heroe.getMazo());





    }


}
