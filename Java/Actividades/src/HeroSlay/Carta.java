package HeroSlay;

public class Carta {
    private String nombre;
    private String tipo;
    private int ataque;

    public Carta(String nombre, String tipo, int ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
    }

    //SETTERS
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //GETTERS

    public int getAtaque() {
        return ataque;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
}


