package InterficiesAnimales;

public class Koala extends Animal implements Hervivoro {

    public Koala(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void Alimentar(Vegetal vegetal) {
        System.out.println("El Koala esta comiendo: "+vegetal);
    }
}
