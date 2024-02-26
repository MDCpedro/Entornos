package Vehiculo;

public class Coche extends vehiculo {
    private int puertas;

    public Coche(int puertas, String matricula) {
        super(4, matricula);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return getMatricula()+" Nº Ruedas: "+getRuedas()+" Nº puertas: "+puertas;

    }
}
