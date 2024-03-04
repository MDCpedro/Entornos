package InterficiesAnimales;

public abstract class Animal {
    private String nombre;
    private int edad;
    private int peso;

    public Animal(String nombre, int edad, int peso) {
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre+edad+peso;
    }
}
