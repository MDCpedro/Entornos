package HeroSlay;

import java.util.List;

public class Personaje {
    private String nombre;
    private int vida;
    private List<Carta> mazo;

    public Personaje(String nombre, int vida, List<Carta> mazo) {
        this.nombre = nombre;
        this.vida = vida;
        this.mazo = mazo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public List<Carta> getMazo() {
        return mazo;
    }
}
